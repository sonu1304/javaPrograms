package com.company.singleLinkedList.loopDetection;

import com.company.singleLinkedList.Node;

public class ListLoopLength {
    Node head;

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public int countNodeInLoop(Node n) {
        int count = 1;
        Node temp = n;
        while (temp.next != n) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int findLoop() {
        Node first_ptr = head;
        Node second_prt = head;

        while (second_prt != null && first_ptr != null && first_ptr.next != null) {
            first_ptr = first_ptr.next.next;
            second_prt = second_prt.next;

            if (second_prt == first_ptr)
                return countNodeInLoop(second_prt);
        }
        return 0;
    }

    public static void main(String[] args) {
        ListLoopLength list = new ListLoopLength();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        // creating the loop in the list
        list.head.next.next.next.next.next = list.head.next;

        System.out.println(list.findLoop());
    }
}
