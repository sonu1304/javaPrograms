package com.company.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {

    private BlockingQueue<Integer> sharedQueue;

    public Consumer(BlockingQueue<Integer> queue) {
        super("CONSUMER");
        this.sharedQueue = queue;
    }

    public void run() {

        while (true) {
            try {
                Integer item = sharedQueue.take();
                System.out.println(getName() + " consumed " + item);

            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
