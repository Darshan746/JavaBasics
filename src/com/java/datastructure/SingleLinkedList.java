package com.java.datastructure;

public class SingleLinkedList {

  private Node head;

  public boolean isEmpty(){
    return (head==null);
  }

  //Insert the Element at the beginning of the node.
  public void insertFirst(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    head  = newNode;
  }

  public Node deleteFirstNode(){
    Node temp = head;
    head = head.next;
    return temp;
  }

  public void deleteAfter(int data){
    Node node = head;
    while(node.next!=null && data != node.data){
      node = node.next;
    }
    if (node.next != null)
      node.next = node.next.next;
  }


  public void insertAtLast(int data) {
    Node n = new Node();
    n.next = null;
    n.data = data;
    Node node = head;
    while (node.next != null) {
      node = node.next;
    }
    node.next = n;
  }

  public  void printLinkedList(){
    Node n = head;
    while(n!=null) {
      System.out.print(n.data + "->");
      n = n.next;

    }
  }


  public void reverse(Node head) {
      Node prev = null;
      Node current = head;
      Node next = null;
        while (current != null) {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
        }
      this.head = prev;
     // return head;
  }



  public boolean detectLoop()
  {
    Node slow_p = head,
         fast_p = head;

    while (slow_p != null && fast_p != null && fast_p.next != null) {
      slow_p = slow_p.next;
      fast_p = fast_p.next.next;
      if (slow_p == fast_p) {
        System.out.println("Found loop");
        return true;
      }
    }
    return false;
  }


  public void removeDuplicate() {
    //Node current will point to head
    Node current = head, index = null, temp = null;

    if(head == null) {
      return;
    }
    else {
      while(current != null){
        //Node temp will point to previous node to index.
        temp = current;
        //Index will point to node next to current
        index = current.next;

        while(index != null) {
          //If current node's data is equal to index node's data
          if(current.data == index.data) {
            //Here, index node is pointing to the node which is duplicate of current node
            //Skips the duplicate node by pointing to next node
            temp.next = index.next;
          }
          else {
            //Temp will point to previous node of index.
            temp = index;
          }
          index = index.next;
        }
        current = current.next;
      }
    }
  }

  public static void main(String[] args) {
    SingleLinkedList list = new SingleLinkedList();

    list.insertFirst(123);
    list.insertAtLast(1234);
    list.insertAtLast(4321);
    list.insertAtLast(4321);
    list.insertAtLast(4321);

    list.printLinkedList();
    System.out.println(" ");
    list.removeDuplicate();
    list.printLinkedList();

    // list.reverse(list.head);
   /* System.out.println(" ");
    list.printLinkedList();
    System.out.println(" ");
    System.out.println("");
*/
  }

}
