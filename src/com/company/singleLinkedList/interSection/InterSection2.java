package com.company.singleLinkedList.interSection;

import com.company.singleLinkedList.Node;

/**
 * T.C = O(M*N)
 */

public class InterSection2 {

    public int getInterSection(Node head1, Node head2) {

//        Node h1 = head1;
        Node h2 = head2;

        while (head1 != null) {

            while (head2 != null) {
                if (head1.data == head2.data) {
                    return head1.data;
                }
                head2 = head2.next;
            }
            head1 = head1.next;
            head2 = h2;
        }

        return -1;
    }

    public static void main(String[] args) {

        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);

        // creating second linked list
        Node head2 = new Node(10);
        head2.next = new Node(15);
        head2.next.next = new Node(30);

        InterSection2 list = new InterSection2();

        System.out.println(list.getInterSection(head1, head2));
    }
}
