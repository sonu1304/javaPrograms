package com.company.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerProblem {

    /***
     *
     * there are other ways to solve this , but we will solve this by BlockingQueue
     *
     * It is arguably the simplest way to solve this problem in any programming language because blocking queue
     * data structure not only provides storage but also provides flow control and thread-safety,
     * which makes the code really simple. Brian Goetz has also explained this key class and pattern in his
     * classic Java Concurrency in Practice book, a must-read for serious Java developers.
     *
     * Java provides a built-in blocking queue data structure in java.util.concurrent package.
     * It was added on JDK with multiple concurrent utilities e.g. CountDownLatch, CyclicBarrier,
     * and Callable and Future classes.
     *
     * The java.util.concurrent.BlockingQueue is an interface and comes with two ready-made implementations
     * then ArrayLinkedBlockingQueue and LinkedBlockingQueue. As the name suggests,
     * one is backed by an array while the other is backed by a linked list.
     *
     * In order to solve the producer-consumer problem, we will create two threads that will simulate producer and consumer,
     * and instead of the shared object, we will use the shared BlockingQueue. Our code will be simple,
     * the producer will add an element into the queue and the consumer will remove the element.
     *
     * BlockingQueue provides a put() method to store the element and take() method to retrieve the element.
     * Both are blocking methods, which means put() will block if the queue has reached its capacity and
     * there is no place to add a new element.
     *
     * Similarly, the take() method will block if the blocking queue is empty.
     * So, you can see that the critical requirement of the producer-consumer pattern is met right there,
     * you don't need to put any thread synchronization code.
     *
     * BlockingQueue not only provide a data structure to store data * but also gives you flow control,
     *  require for inter thread communication. *
     *
     *
     */

    public static void main(String[] args) {

        BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<>();

        Producer producer = new Producer(sharedQ);
        Consumer consumer = new Consumer(sharedQ);

        producer.start();
        consumer.start();
    }

    /**
     *
     * Explanation of code
     * If you look at the above code example, you will find that we have created and started two threads and named
     * them Producer and Consumer. The Producer thread executes the code inside the run() method,
     * which adds 10 Integer objects starting from 0.
     *
     * After adding each element, the Producer thread is sleeping for 200 milliseconds by calling Thread.sleep()
     * method. This gives time to the Consumer thread to consume elements from Queue,
     * that's why our code never blocks.
     *
     * You can see that our Producer and Consumer threads are working in sync because of Thread.sleep()
     * we have introduced after put() call. You can further experiment with the code by removing the code
     * to pause the Producer thread or inserting pause on the Consumer thread to create scenarios where
     * Queue is full or empty.
     *
     *
     * Benefits of using BlockingQueue to solve Producer Consumer
     * Simple code, much more readable
     * less error-prone as you don't have to deal with any external synchronization
     *
     *
     */


}
