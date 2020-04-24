package com.java.datastructure.com.java.datastructure.tree;

public class Node {

  public int getData() {
    return data;
  }

/*
  public BinaryNode(int data, BinaryNode left, BinaryNode right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
*/

  public void setData(int data) {
    this.data = data;
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

  public int data;
  public Node left;
  public Node right;


}
