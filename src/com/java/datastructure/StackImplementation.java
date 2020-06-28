package com.java.datastructure;

public class StackImplementation
{
    private int[] stackArray;
    private int stackSize;
    private int top = -1;

    public StackImplementation(int size)
    {
        stackArray = new int[size];
        stackSize = size;
    }

    public void push(int item) throws Exception
    {
        if (this.isStackFull())
        {
            throw new Exception("Stack is overflow");
        }
        else
        {
            stackArray[++top] = item;
        }
    }

    public int pop()
    {
        return stackArray[top--];
    }

    public int peek()
    {
        return stackArray[top];
    }

    private void createStack() throws Exception
    {
        for (int i = 1; i <= 10; i++)
        {
            this.push(i);
        }
    }

    private boolean isStackFull()
    {
        if (top == stackSize - 1)
        {
            return true;
        }
        else
            return false;
    }

    public boolean isStackEmpty()
    {
        if (top == -1)
        {
            return true;
        }
        else
            return false;
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception
    {
        StackImplementation stack = new StackImplementation(10);
        stack.createStack();
        stack.pop();
        stack.pop();
        stack.displayStack();
        //System.out.println(stack.peek());
    }

    public void displayStack() {
        if(top!=-1){
            for(int i=0;i<=top; i++){
                System.out.println(stackArray[i]);
            }
        }
    }

   public boolean isEmpty()
    {
        return (top == -1) ? true : false;
    }

}
