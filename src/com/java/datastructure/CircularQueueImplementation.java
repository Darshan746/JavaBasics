package com.java.datastructure;

public class CircularQueueImplementation
{

    private int front, rear = -1;
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
        // check first cqueue is full
        if (rear == size - 1)
        {
            System.out.println("Circular Queue is full");
        }

        else if (front == -1 && rear == -1)
        {
            front = rear = 0;
            cqueue[rear] = element;
        }

        else
        {
            rear++;
            cqueue[rear] = element;
        }
    }

    // Circular Queue Delete Operation
    public void dequeue()
    {

        // check queue is empty
        if (front == -1 && rear == -1)
        {
            System.out.println("Circular queue is empty ...!");
        }

        // This condition is Only one element left in the circular queue
        else if (front == rear)
        {
            System.out.println("Deleted element is " +
                    cqueue[front]);
            front = rear = -1;
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

    public void display()
    {

        if (rear >= front)
        {
            for (int i = front; i <= rear; i++)
                System.out.print(cqueue[i]);
        }
        else
        {

            for (int i = 0; i <= rear; i++)
                System.out.print(cqueue[i]);
            for (int i = front; i < size; i++)
                System.out.print(cqueue[i]);

        }
    }

    public static void main(String args[])
    {
        CircularQueueImplementation circularQueue = new CircularQueueImplementation(5);
        for (int i = 1; i <= 6; i++)
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
    }

}
