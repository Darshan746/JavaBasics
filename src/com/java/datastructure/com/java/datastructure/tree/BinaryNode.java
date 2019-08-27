package com.java.datastructure.com.java.datastructure.tree;

public class BinaryNode {

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

  public BinaryNode getLeft() {
    return left;
  }

  public void setLeft(BinaryNode left) {
    this.left = left;
  }

  public BinaryNode getRight() {
    return right;
  }

  public void setRight(BinaryNode right) {
    this.right = right;
  }

  public int data;
  public BinaryNode left;
  public BinaryNode right;


}
