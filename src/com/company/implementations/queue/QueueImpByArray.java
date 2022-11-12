package com.company.implementations.queue;

public class QueueImpByArray {

    private int front,rear, capacity;
    private int[] arr;

    public QueueImpByArray(int capacity) {
        this.front = 0;
        this.rear = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public boolean isQueueEmpty() {
        return front == rear;
    }

    public void enqueue(int data) {
        // before adding any data, check the capacity..
        if(capacity == rear){
            System.out.println("Queue is full");
        }
        else {
            arr[rear] = data;
            rear++;
        }
    }

    public int deQueue() {

        //check if queue is empty
        if(isQueueEmpty())
            System.out.println("queue is empty");
        else {
            int item =  arr[front];

            //shift all elements 1 time from right to left

            for (int i = 0; i < rear - 1; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;

            return item;
        }

        return -1;
    }

    public void displayQueue() {
        if(isQueueEmpty())
            System.out.println("Queue is empty");
        else {
            for( int i = front; i < rear; i++) {
                System.out.print(arr[i] +" <--- ");
            }
        }
    }

    public int front() {
        if(isQueueEmpty())
            System.out.println("Queue is empty");

        return arr[front];
    }

}
