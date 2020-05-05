package com.java.datastructure;

import java.util.Stack;

public class QueueUsingTwoStack {
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public void enqueue(int ele) {
        s1.push(ele);
    }

    public int dequeue() {
        int deQueuedEle = 0;
        if(s2.isEmpty()) {
            while (!s1.empty()) {
                s2.push( s1.pop());
            }
            return (int)s2.pop();
        }
        return deQueuedEle;
    }

    public boolean isQueueEmpty() {
        if(s1.empty()&&s2.isEmpty()) {
            return true;
        }
        return false;
    }

    public int size() {
        return s1.size()+s2.size();
    }
}