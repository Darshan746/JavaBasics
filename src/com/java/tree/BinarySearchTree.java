package com.java.tree;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("bst root is :" + bst.root);
    }


    public boolean insertNode(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
            return false;
        }
    }


    public boolean contains(Node newNode, int value) {
    if (newNode==null){
        return false;
    }
    if (newNode.value==value){
        return true;
    }
    if(value<newNode.value){
        return contains(newNode.left, value);
    }else {
        return contains(newNode.right, value);
    }
    }
}


