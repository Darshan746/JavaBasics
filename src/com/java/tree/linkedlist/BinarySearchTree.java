package com.java.tree.linkedlist;

public class BinarySearchTree {

    static Node root;


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.root);

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);

        System.out.println(bst.root.data);
        System.out.println(bst.root.left.data);
        System.out.println(bst.root.right.data);



        //BST contains
        System.out.println("is the number contains ::"+" "+bst.contains(18));
    }


    public boolean insert(int value) {
        Node newNode = new Node(value);
        Node temp = root;
        if (root == null) {
            root = newNode;
            return true;
        }
        while (true) {
            if (newNode.data == temp.data) {
                return false;
            }

            if (newNode.data < temp.data) {
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

        }
    }


    public boolean contains(int data) {
        Node temp = root;
        while (temp != null) {
            if (data < temp.data) {
                temp = temp.left;
            } else if (data > temp.data) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
