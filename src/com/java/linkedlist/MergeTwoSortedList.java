package com.java.linkedlist;

import com.java.datastructure.Node;

public class MergeTwoSortedList {


    public  static  Node mergeTwoSortedLinkedList(Node p, Node q, Node sorted) {
        Node new_node = new Node();


        if(p!=null && q!=null) {
            if(p.data <= q.data) {
                sorted = p;
                p = sorted.next;
            }
            else {
                sorted = q.next;
                q = sorted.next;
            }
        }
        new_node = sorted;

        while (p!=null && q!=null) {
             if(p.data<=q.data) {
                 sorted.next = p;
                 sorted =p ;
                 p = sorted.next;
             } else {
                 sorted.next = q;
                 sorted =q;
                 q = sorted.next;
             }
        }
        if(p==null) {
            sorted.next =q;
        }
        if(q==null) {
            sorted.next = p;
        }

        return new_node;
    }


    public static void main(String[] args) {

        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();

        n1.data = 1;
        n2.data = 2;
        n3.data = 3;

        n1.next = n2;
        n2.next = n3;
        n3.next =null;


        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();

        n4.data = 4;
        n5.data = 5;
        n6.data = 9;

        n4.next = n5;
        n5.next = n6;
        n6.next =null;

        Node node = new Node();

        Node n = mergeTwoSortedLinkedList(n1, n4,  node);

        while (n != null) {
            System.out.print(n.data+" ");
            n = n.next;
        }



    }




}
