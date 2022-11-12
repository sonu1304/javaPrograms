package com.company.CTCI.LinkedList;

/**Partition: Write code to partition a linked list around a value x, such that all nodes less than x come before all
 * nodes greater than or equal to x. If x is contained within the list the values of x only need to be after the elements
 * less than x (see below). The partition element x can appear anywhere in the "right partition"; it does not need to
 * appear between the left and right partitions.
 * */

public class Partition {

    Node head;

    static Node partition(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;

            /** adding the smaller than x nodes at the head */
            if(node.data < x ) {
                node.next = head;
                head = node;

            } else {
                /** adding to the tail */
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null; // end of the partition list
//        tail.setNext(4);
        return head;
    }

    public static void main(String[] args) {
        Partition list = new Partition();
        list.head = new Node(3);
        Node second = new Node(5);
        Node third = new Node(8);
        Node fourth = new Node(5);
        Node fifth = new Node(10);
        Node sixth = new Node(2);
        Node seventh = new Node(1);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        list.head = partition(list.head, 5);

        while (list.head != null) {
            System.out.print(list.head.data + " --> ");
            list.head = list.head.next;
        }
    }
}
