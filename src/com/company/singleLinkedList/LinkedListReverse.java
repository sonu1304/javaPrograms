package com.company.singleLinkedList;

public class LinkedListReverse {

    Node head;

    public Node reverseList(Node head) {

        Node prev = null;

        while(head != null ) {
            Node next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }

        return prev;
    }

    // print list

    public void printList(Node head) {
        while(head != null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        LinkedListReverse list = new LinkedListReverse();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        Node head = list.reverseList(list.head);

        list.printList(head);

//        System.out.println(1/2);
    }
}
