package com.java.datastructure.com.java.datastructure.tree;

public class BinarySearchTree {

  public BinaryNode createNewNode(int data){
     BinaryNode node = new BinaryNode();
     node.setData(data);
     node.setLeft(null);
     node.setRight(null);
     return node;
  }


  public BinaryNode insert(BinaryNode node, int data) {
      if (node == null) {
       return createNewNode(data);
      }else if(data < node.data){
        node.left = insert(node.left, data);
      }
      else
        node.right = insert(node.right, data);

      return node;
  }

  public static void main(String[] args) {
    BinarySearchTree b = new BinarySearchTree();
    BinaryNode root = null;

    root = b.insert(root, 8);
    root = b.insert(root, 3);
    root = b.insert(root, 10);
    root = b.insert(root, 6);
    root = b.insert(root, 4);
    root = b.insert(root, 7);
    root = b.insert(root, 1);

    System.out.println(b);

  }
}
