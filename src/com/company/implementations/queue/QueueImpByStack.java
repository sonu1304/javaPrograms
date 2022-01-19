package com.company.implementations.queue;

import java.util.Stack;

public class QueueImpByStack {

    /**
     * creating two stacks
     */

    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();

    public void enqueue(int data) {

        // adding the data or elements to the pushStack

        pushStack.push(data);
    }

    public int peek() {
        //shift all the elements from pushStack to popStack..
        // peek() this will not delete the value

        /**
         * The peek() method of Queue Interface returns the element at the front the container.
         * It does not deletes the element in the container
         *
         * This method returns the head of the queue.
         * The method does not throws an exception when the Queue is empty, it returns null instead.
         */

        shiftStacks();

        return popStack.peek();
    }

    public void shiftStacks() {
        if(popStack.isEmpty()) {
            while(!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
    }

    public int dequeue() {
        /**
         * The Dequeue() and the Peek() method is used to retrieve the first element in a queue collection.
         * The Dequeue() removes and returns the first element from a queue because the queue stores
         * elements in FIFO order. Calling the Dequeue() method on an empty queue will throw the InvalidOperation exception
         */


        shiftStacks();
        return popStack.pop();
    }


    public static void main(String[] args) {
        QueueImpByStack queue = new QueueImpByStack();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
    }


}
