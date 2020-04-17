package com.java.datastructure;

public class DoublyLinkedList {

    static DoublyNode head;
    static DoublyNode tail;
    int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        length = 0;
    }

    public static boolean isEmpty() {
        if(tail==null && head==null){
            return true;
        }
        return false;
    }

    public int length() {
        return this.length;
    }

    public static void displayListInForwardDir() {
        DoublyNode tmp = head;
        while(tmp!=null && tmp.next!=null) {
            System.out.print(tmp.data + "=>");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    public static void displayListInReverseDir() {
        DoublyNode tmp = tail;
        while(tmp!=null && tmp.previous!=null) {
            System.out.print(tmp.data + "=>");
            tmp = tmp.previous;
        }
        System.out.println("null");
    }

    public static  void insertAtLast( ) {
     DoublyNode  newNode = new DoublyNode(30);
     if(isEmpty()) {
         head = newNode;
     }
     else {
         tail.next = newNode;
         newNode.previous = tail;
     }
       tail = newNode;
    }

    public static void insertAtBegining(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if(isEmpty()) {
            tail = newNode;
        }else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        for(int i =20; i<=25; i++){
            insertAtBegining(i);
        }
        displayListInReverseDir();
        displayListInForwardDir();
    }
}