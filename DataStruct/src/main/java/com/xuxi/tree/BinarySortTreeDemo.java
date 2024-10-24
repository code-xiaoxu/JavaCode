package com.xuxi.tree;

public class BinarySortTreeDemo {
    public static void main(String[] args) {
        BinarySortTree binaryTree = new BinarySortTree();
        int[] arr = {7, 3, 10, 12, 5, 1, 9, 2};
        for (int i : arr) {
            binaryTree.add(new TreeNode(i));
        }
        binaryTree.infixOrder();
        binaryTree.delNode(7);
        System.out.println("删除后");
        binaryTree.infixOrder();
    }

}

class BinarySortTree {
    public TreeNode root;

    public void add(TreeNode node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public TreeNode search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    public TreeNode searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }

    /**
     *
     *
     * @param node 以node为根节点的树
     * @return 最小节点的val
     */
    public int delRightTreeMin(TreeNode node){
        TreeNode target = node;
        while(target.left!=null){
            target = target.left;
        }
        delNode(target.val);
        return target.val;
    }
    public int delLeftTreeMax(TreeNode node){
         TreeNode target = node;
         while(target.right!=null){
             target = target.right;
         }
         delNode(target.val);
         return target.val;
    }

    public void delNode(int val) {
        if (root == null) {
            return;
        } else {
            TreeNode target = search(val);
            if (target == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                root = null;
                return;
            }
            TreeNode parent = searchParent(val);
            if (target.left == null && target.right == null) {
                if (parent.left != null && parent.left.val == target.val) {
                    parent.left = null;
                } else if (parent.right != null && parent.right.val == target.val) {
                    parent.right = null;
                }
            } else if (target.left != null && target.right != null) {
                //从右子树找最小
                //int minVal = delRightTreeMin(target.right);
                //target.val = minVal;
                //从左子树找最大
                int maxVal = delLeftTreeMax(target.left);
                target.val = maxVal;
            } else {
                if(target.left!=null){
                    if(parent.left.val==target.val){
                        parent.left = target.left;
                    }else{
                        parent.right = target.left;
                    }
                }else{
                    if(parent != null){
                    if(parent.left.val==target.val){
                        parent.left = target.right;
                    }else{
                        parent.right = target.right;
                    }
                }else{
                        root = target.right;
                    }
                    }
            }
        }
        }


        public void infixOrder () {
            if (root != null) {
                root.infixOrder();
            } else {
                System.out.println("二叉树为空");
            }
        }

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }

        public TreeNode search(int value) {
            if (this.val == value) {
                return this;
            } else if (this.val > value) {
                if (this.left == null) {
                    return null;
                }
                return this.left.search(value);
            } else {
                if (this.right == null) {
                    return null;
                }
                return this.right.search(value);
            }
        }

        public TreeNode searchParent(int value) {
            if ((this.left != null && this.left.val == value) ||
                    (this.right != null && this.right.val == value)) {
                return this;
            } else {
                if (this.left != null && this.val > value) {
                    return this.left.searchParent(value);
                } else if (this.right != null && this.val <= value) {
                    return this.right.searchParent(value);
                } else {
                    return null;
                }
            }
        }

        public void add(TreeNode node) {
            if (node == null) {
                return;
            }
            if (node.val < this.val) {
                if (this.left == null) {
                    this.left = node;
                } else {
                    this.left.add(node);
                }
            } else {
                if (this.right == null) {
                    this.right = node;
                } else {
                    this.right.add(node);
                }
            }
        }

        public void infixOrder() {
            if (this.left != null) {
                this.left.infixOrder();
            }
            System.out.println(this);
            if (this.right != null) {
                this.right.infixOrder();
            }

        }
    }





