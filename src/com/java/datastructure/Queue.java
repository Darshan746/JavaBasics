package com.java.datastructure;

public class Queue
{

    private int[] queue;

    private int rear = 0, front = 0, queueSize;

    public Queue(int size)
    {
        queue = new int[size];
        queueSize = size;
    }

    public void enQueue(int item)
    {
        if (rear == queueSize)
        {
            System.out.println("Queue is full ...!");
        }
        else
        {
            queue[rear++] = item;

        }
    }

    public void deQueue()
    {
        if (front == rear)
        {
            System.out.println("Queue is Empty ....!");
        }
        else
        {
            for (int i = 0; i < rear; i++)
            {
                queue[i] = queue[i + 1];
            }
        }
    }

    public void displayQueue()
    {
        if (front != rear)
        {
            for (int i = front; i < rear; i++)
            {
                System.out.print(queue[i] +" ");
            }
        }
        else
        {
            System.out.println("Queus is Empty");
        }
    }

    public static void main(String args[])
    {
        Queue q = new Queue(5);
        for (int i = 1; i <= 5; i++)
        {
            q.enQueue(i);
        }
        q.displayQueue();
    }

}
