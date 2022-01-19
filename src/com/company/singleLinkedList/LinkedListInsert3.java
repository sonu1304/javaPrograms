package com.company.singleLinkedList;

//import com.sun.xml.internal.ws.server.WSEndpointMOMProxy;

public class LinkedListInsert3 {

    Node head;

    //adding new node at the tail of the linked list
    // this method is having o(n) complexity but it can be optimised to o(1)..
    public void insertAtTail(int data) {

        Node new_node = new Node(data);

        if (head == null) {
            head.next = new_node;
            return;
        }

        new_node.next = null;

        Node last_node = head;
        while(last_node.next != null)
            last_node = last_node.next;
        last_node.next = new_node;
        return;
    }

    // print list
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListInsert3 list = new LinkedListInsert3();

        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        list.head.next = second;
        second.next = third;

        list.insertAtTail(40);

        list.printList();

    }
}
