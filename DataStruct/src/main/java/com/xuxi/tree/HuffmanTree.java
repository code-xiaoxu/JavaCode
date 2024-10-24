package com.xuxi.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int arr[] = {13, 7, 8, 3, 29, 6, 1};
        getNode(arr).preOrder();
        }

    public static Node getNode(int arr[]){
         List<Node> list = new ArrayList<>();
         for (int i : arr) {
            list.add(new Node(i));
        }
        while (list.size() > 1) {
            Collections.sort(list, (o1, o2) -> o1.getval() - o2.getval());
            Node leftNode = list.get(0);
            Node rightNode = list.get(1);
            Node parent = new Node(leftNode.getval() + rightNode.getval());
            parent.setLeft(leftNode);
            parent.setRight(rightNode);
            list.add(parent);
            list.remove(leftNode);
            list.remove(rightNode);
        }
        return list.get(0);
    }

}
class Node {
    private int val;
    private Node left;
    private Node right;

    public Node(int val) {
        this.val = val;
    }

    public int getval() {
        return val;
    }

    public void setval(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
    public void preOrder() {
        if (this == null) {
            return;
        }
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }
}

