package com.company.thread;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {

    private BlockingQueue<Integer> sharedQueue;

    public Producer(BlockingQueue<Integer> queue) {
        super("PRODUCER");
        this.sharedQueue = queue;
    }

    public void run() {

        //no synchronization needed..

        for (int i = 0; i < 10; i++) {

            try {
                System.out.println(getName() + " produced " +i);
                sharedQueue.put(i);
                Thread.sleep(200);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

        }
    }

}
