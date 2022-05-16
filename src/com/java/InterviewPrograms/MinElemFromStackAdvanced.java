package com.java.InterviewPrograms;

import java.util.Stack;

public class MinElemFromStackAdvanced {

    private Stack<Integer> stack;
    private static Integer minElem;

    MinElemFromStackAdvanced() {
        stack = new Stack<>();
    }

    void getMinElem() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty!");
        } else
            System.out.println(minElem);
    }


    void push(final Integer elem) {
        if (stack.isEmpty()) {
            minElem = elem;
            stack.push(elem);
            return;
        }
        if (elem < minElem) {
            stack.push(2 * elem - minElem);
            minElem = elem;
        } else
            stack.push(elem);
    }

    private void pop() {
        if (stack.isEmpty()) {
            System.out.println("stack is Empty!");
            return;
        }
        Integer top = stack.pop();
        if (top < minElem) {
            minElem = 2 * minElem - top;

        } else System.out.println(top);
    }

    void peek()
    {
        if (stack.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = stack.peek(); // Top element.

        System.out.print("Top Most Element is: ");

        // If t < minEle means minEle stores
        // value of t.
        if (t < minElem)
            System.out.println(minElem);
        else
            System.out.println(t);
    }


    public static void main(String[] args) {
        MinElemFromStackAdvanced a = new MinElemFromStackAdvanced();
        a.push(3);
        a.push(4);
        a.push(1);
        System.out.println("min Elem " + minElem);
        a.push(0);
        System.out.println("min Elem " + minElem);

        a.pop();
        a.pop();
        a.pop();

        a.push(-1);
        System.out.println(minElem);
    }


}
