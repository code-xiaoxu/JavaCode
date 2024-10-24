package com.xuxi.tree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        HeroNode root = new HeroNode(1, "a");
        HeroNode node1 = new HeroNode(2, "b");
        HeroNode node2 = new HeroNode(3, "c");
        HeroNode node3 = new HeroNode(4, "d");
        HeroNode node4 = new HeroNode(5, "e");
        root.setLeft(node1);
        root.setRight(node2);
        node2.setRight(node3);
        node2.setLeft(node4);
        binaryTree.setRoot(root);
        //删除
        binaryTree.delNode(3);
        System.out.println("前序遍历");
        binaryTree.preOrder();
//        System.out.println("中序遍历");
//        binaryTree.infixOrder();
//        System.out.println("后序遍历");
//        binaryTree.postOrder();
//        System.out.println("前序遍历查找4 ： no =5");
//        HeroNode heroNode = binaryTree.preOrderSearch(5);
//        System.out.println(heroNode);
//        System.out.println("中序遍历查找3 ： no =5");
//        HeroNode heroNode1 = binaryTree.infixOrderSearch(5);
//        System.out.println(heroNode1);
//        System.out.println("后序遍历查找2 ： no =5");
//        HeroNode heroNode2 = binaryTree.postOrderSearch(5);
//        System.out.println(heroNode2);
    }
}

class BinaryTree {
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    //前序遍历
    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("二叉树为空");
        }
    }

    //中序遍历
    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空");
        }
    }

    //后序遍历
    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("二叉树为空");
        }
    }

    //前序遍历查找
    public HeroNode preOrderSearch(int no) {
        if (this.root != null) {
            return this.root.preOrderSearch(no);
        } else {
            System.out.println("二叉树为空");
        }
        return null;
    }

    //中序遍历查找
    public HeroNode infixOrderSearch(int no) {
        if (this.root != null) {
            return this.root.infixOrderSearch(no);
        } else {
            System.out.println("二叉树为空");
        }
        return null;
    }

    //后序遍历查找
    public HeroNode postOrderSearch(int no) {
        if (this.root != null) {
            return this.root.postOrderSearch(no);
        } else {
            System.out.println("二叉树为空");
        }
        return null;
    }

    public void delNode(int no) {
        if (this.root != null) {
            if (this.root.getNo() == no) {
                this.root = null;
            } else {
                this.root.delNode(no);
                System.out.println(no+"已经被删除");
            }
        } else {
            System.out.println("二叉树为空");
        }
    }


}

class HeroNode {
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    @Override
    public String toString() {
        return "HeroNode{" + "no=" + no + ", name='" + name + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    //前序遍历
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    //中序遍历
    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    //后序遍历
    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

    //先序遍历查找
    public HeroNode preOrderSearch(int no) {
        System.out.println("先序遍历查找~~~~~");
        if (this.no == no) {
            return this;
        }
        HeroNode heronode = null;
        if (this.left != null) {
            heronode = this.left.preOrderSearch(no);
        }
        if (heronode != null) {
            return heronode;
        }
        if (this.right != null) {
            heronode = this.right.preOrderSearch(no);
        }
        return heronode;
    }

    public HeroNode infixOrderSearch(int no) {
        HeroNode heronode = null;
        if (this.left != null) {
            heronode = this.left.infixOrderSearch(no);
        }
        if (heronode != null) {
            return heronode;
        }
        System.out.println("中序遍历查找~~~~~");
        if (this.no == no) {
            return this;
        }
        if (this.right != null) {
            heronode = this.right.infixOrderSearch(no);
        }
        return heronode;
    }

    public HeroNode postOrderSearch(int no) {

        HeroNode heronode = null;
        if (this.left != null) {
            heronode = this.left.postOrderSearch(no);
        }
        if (heronode != null) {
            return heronode;
        }
        if (this.right != null) {
            heronode = this.right.postOrderSearch(no);
        }
        if (heronode != null) {
            return heronode;
        }
        System.out.println("中序遍历查找~~~~~");
        if (this.no == no) {
            return this;
        }
        return heronode;
    }

    //删除节点或者子树
    public void delNode(int no) {
        if (this.left != null && this.left.no == no) {
            this.left = null;
            return;
        }
        if (this.right != null && this.right.no == no) {
            this.right = null;
            return;
        }
        if (this.left != null) {
            this.left.delNode(no);
        }
        if (this.right != null) {
            this.right.delNode(no);
        }
    }


}

