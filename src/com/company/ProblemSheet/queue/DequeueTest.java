package com.company.ProblemSheet.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueTest {

    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(1);
        dq.offer(2);
        dq.offer(3);

        System.out.println(dq);

        System.out.println(dq.peekLast());
    }
}
