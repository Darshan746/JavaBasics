package com.java.datastructure.com.java.datastructure.tree;

public class BinarySearchTree {

  public Node createNewNode(int data){
     Node node = new Node();
     node.setData(data);
     node.setLeft(null);
     node.setRight(null);
     return node;
  }

  public Node insert(Node node, int data) {
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
    Node root = null;

    root = b.insert(root, 8);
    root = b.insert(root, 3);
    root = b.insert(root, 10);
    
    System.out.println(b);

  }



  public Node deleteNode(Node node, int value) {
      if(node == null) {
          return null;
      }
      if(value < node.data) {
          node.left = deleteNode(node.left, value);
      }else if(value > node.data) {
          node.right = deleteNode(node.right, value);
      }else {
          //delete Single child
            if(node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left==null?node.right : node.left;
                if(temp==null){
                    return null;
                }else {
                    return temp;
                }
          }
            //delete if parent have two children
            else {
                Node successor = getSucessor(node);
                node.data = successor.data;
                node.right = deleteNode(node.right, successor.data);
                return node;
            }
      }


     return node;

  }

    public Node getSucessor(Node node) {
     if (node == null) {
         return null;
     }
     else {
         Node temp = node.right;
         while (temp!=null) {
             temp = temp.left;
         }
         return temp;
     }
    }


}
