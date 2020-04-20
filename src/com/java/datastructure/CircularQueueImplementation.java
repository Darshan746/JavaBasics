package com.java.datastructure;

public class CircularQueueImplementation
{
    private int front=-1, rear = -1;
    private int size;
    private static int[] cqueue;

    public CircularQueueImplementation(int size)
    {
        cqueue = new int[size];
        this.size = size;
    }

    // Circular queue Add Operation
    public void enqueue(int element)
    {
        if(front == (rear+1) % size){
            System.out.println("Queue is full");
            return;
        }else if(front == -1 && rear == -1){
            front = 0; rear = 0;
        }
        else if(rear == size-1 && front!=0) {
            rear = 0;
        }
        else {
            rear = (rear+1)%size;
        }

        cqueue[rear] = element;
    }

    // Circular Queue Delete Operation
    public void dequeue()
    {
        // check queue is empty
        if (front == -1 & rear == -1) {
               System.out.println("Circular queue is empty ...!");
               return;
        }

        // This condition is Only one element left in the circular queue
        else if (front == rear)
        {
            System.out.println("Deleted element is " + cqueue[front]);
            front = -1;
            rear = -1;
        }
        else if (front == size - 1)
        {
            int ele = cqueue[front];
            System.out.println("Delete ele " + ele);
            front = 0;
        }
        else
        {
            System.out.println("Deleted item " + cqueue[front]);
            front++;
        }

    }


    void display() {
        for(int i=front+1 ; i!=(rear+1) ; i=(i+1)%cqueue.length)
        {
            System.out.print(" "+cqueue[i]);
        }
    }

    public static void main(String args[])
    {
        CircularQueueImplementation circularQueue = new CircularQueueImplementation(9);
        for (int i = 10; i <= 16; i++)
        {
            circularQueue.enqueue(i);
        }
        System.out.print("Circular Queue is ::: ");
        circularQueue.display();

        for (int i = 1; i < 4; i++)
        {
            circularQueue.dequeue();

        }
        System.out.println("\n");
        circularQueue.display();
        circularQueue.enqueue(6);
        circularQueue.display();

    }

}
