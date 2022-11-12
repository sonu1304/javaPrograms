package com.company.singleLinkedList;

public class LinkedListLength {
    Node head;

    public void push(int data) {
        Node new_nd = new Node(data);
        new_nd.next = head;
        head = new_nd;
    }

    //print the length of list
    public void printLength() {
        int length = 0;

        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println("length----> " + length);
    }

    public static void main(String[] args) {
        LinkedListLength list = new LinkedListLength();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.printLength();
    }
}
