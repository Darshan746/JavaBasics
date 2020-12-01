package com.java.datastructure;

import java.util.HashSet;

public class SingleLinkedList {

  private Node head;

  public boolean isEmpty(){
    return (head==null);
  }

  //Insert the Element at the beginning of the node.
  public void insertFirst(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = head;
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

//ncpc for memorizing
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

  public  int findMidElemInLinkedList() {
    Node fastPtr = head;
    Node slowPtr = head;

    while (fastPtr!=null && fastPtr.next!=null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }
    return slowPtr.data;
  }

  public void removeDuplicate() {
    Node current = head;
    HashSet<Integer> set = new HashSet<Integer>();
    set.add(current.data);
    while (current.next != null) {
      if (set.contains(current.next.data)) {
        current.next = current.next.next;
      } else {
        set.add(current.next.data);
        current = current.next;
      }
    }
  }

  /**
   * Check the linked list size is even or odd without counting nodes
   *
   * increment node by 2 node odd next  will point to null even will point to null
   * @param head
   */
  public void evenOrOdd(Node head) {
    Node node = head;
      while (true) {
        if(node==null) {
          System.out.println("EVEN");
          return;
        }
        if(node.next==null) {
          System.out.println("ODD");
          return;
        }
        node = node.next.next;
      }
    }

//Finding the nth node from the last
  public  Node nth(int n){
    if(head == null || n < 1) return null;

    Node n1 = head;
    Node n2 = head;
    for(int i = 1; i < n; i++){
      if(n1.next == null) return null;
      n1 = n1.next;
    }

    while (n1.next != null){
      n1 = n1.next;
      n2 = n2.next;
    }
    return n2;
  }

  /* Function to swap Nodes x and y in linked list by
    changing links */
  public  void swapNodes(int x, int y)
  {
    // Nothing to do if x and y are same
    if (x == y) return;

    // Search for x (keep track of prevX and CurrX)
    Node prevX = null, currX = head;
    while (currX != null && currX.data != x)
    {
      prevX = currX;
      currX = currX.next;
    }

    // Search for y (keep track of prevY and currY)
    Node prevY = null,
    currY = head;
    while (currY != null && currY.data != y)
    {
      prevY = currY;
      currY = currY.next;
    }

    // If either x or y is not present, nothing to do
    if (currX == null || currY == null)
      return;

    // If x is not head of linked list
    if (prevX != null)
      prevX.next = currY;
    else //make y the new head
      head = currY;

    // If y is not head of linked list
    if (prevY != null)
      prevY.next = currX;
    else // make x the new head
      head = currX;

    // Swap next pointers
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
  }

  public static void main(String[] args) {
    SingleLinkedList list = new SingleLinkedList();

  /*  list.insertFirst(123);
    list.insertAtLast(1234);
    list.insertAtLast(4321);
    list.insertAtLast(76);
    list.insertAtLast(4321);
    list.insertAtLast(123);
    list.insertAtLast(123);
*/


    list.insertFirst(1);
    list.insertFirst(2);
    list.insertFirst(3);
//    list.insertAtLast(2);
//    list.insertAtLast(3);
//    list.insertAtLast(4);
    System.out.println("Printing "+ list.nth(3).data);
list.printLinkedList();
    System.out.println(LinkedListIsPalindrome.isLinkedListPalindrome(list.head));

    // list.evenOrOdd(list.head);
 //   list.swapNodes(123, 76);
  //  list.printLinkedList();
    System.out.println(" ");
   // System.out.println(list.findMidElemInLinkedList());
  }

}
