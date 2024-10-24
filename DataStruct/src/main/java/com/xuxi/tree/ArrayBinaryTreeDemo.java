package com.xuxi.tree;

public class ArrayBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);
        System.out.println("前序遍历1 2 4 5 3 6 7");
        arrayBinaryTree.preorder();
        System.out.println();
        System.out.println("中序遍历4 2 5 1 6 3 7");
        arrayBinaryTree.infixOrder();
        System.out.println();
        System.out.println("后序遍历4 5 2 6 7 3 1");
        arrayBinaryTree.postOrder();
    }
}
class ArrayBinaryTree{
    private int arr[];

    public ArrayBinaryTree(int[] arr) {
        this.arr = arr;
    }
    public void preorder(){
        this.preOrder(0);
    }
    public void infixOrder(){
        this.infixOrder(0);
    }
    public void postOrder(){
        this.postOrder(0);
    }

    public void preOrder(int index){
        if(arr==null || arr.length == 0){
            System.out.println("数组为空");
            return;
        }
        System.out.print(arr[index]+"\t");
        if(index*2+1< arr.length){
            this.preOrder(index*2+1);
        }
        if(index*2+2<arr.length){
            this.preOrder(index*2+2);
        }
    }
    public void infixOrder(int index){
        if(arr==null || arr.length == 0){
            System.out.println("数组为空");
            return;
        }
        if(index*2+1< arr.length){
            this.infixOrder(index*2+1);
        }
        System.out.print(arr[index]+"\t");
        if(index*2+2<arr.length){
            this.infixOrder(index*2+2);
        }
    }

        public void postOrder(int index){
        if(arr==null || arr.length == 0){
            System.out.println("数组为空");
            return;
        }
        if(index*2+1< arr.length){
            this.postOrder(index*2+1);
        }
        if(index*2+2<arr.length){
            this.postOrder(index*2+2);
        }
         System.out.print(arr[index]+"\t");
    }

}
