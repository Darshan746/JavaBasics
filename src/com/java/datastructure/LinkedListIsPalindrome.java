package com.java.datastructure;

import java.util.Stack;

public class LinkedListIsPalindrome {

    private static boolean  isPalindrome;
    public static boolean isLinkedListPalindrome(Node head){
        Stack stack = new Stack();
        Node node = head;
        while(node!=null) {
            stack.push(node.data);
            node = node.next;
        }

        Node headNode = head;
        while (headNode!=null) {
            if(headNode.data == (Integer) stack.pop()) {
                isPalindrome = true;
                headNode = headNode.next;
            }else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {

    }

}
