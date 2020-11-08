package com.java.InterviewPrograms;

import java.util.Stack;

public class GetMinElemFromStack {

    private final static Stack<Integer> stack = new Stack<>();
    private static final  Stack<Integer> supportingStack = new Stack<>();

    public static Integer getMinElemFromStack() {
        return supportingStack.peek();
    }

    public static void addElemToStack(Integer elem){
        stack.push(elem);
        if(supportingStack.size()== 0){
            supportingStack.push(elem);
        }
        if(stack.peek()<supportingStack.peek()){
            supportingStack.push(elem);
        }
    }

    public static void deleteElemFromStack(){
        if(stack.peek().equals(supportingStack.peek())){
            supportingStack.pop();
        }
        stack.pop();
    }


    public static void main(String[] args) {
        addElemToStack(23);
        addElemToStack(30);
        addElemToStack(5);
        addElemToStack(45);

        System.out.println("Min element "+getMinElemFromStack());

        deleteElemFromStack();
        addElemToStack(1);
        System.out.println("Min element "+getMinElemFromStack());


    }
}
