package com.company.singleLinkedList;

public class LinkedListMiddle {
    Node head;

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void printMiddleOfList() {
        Node firstPointer = head;
        Node secondPointer = head;

        if (head != null) {
            while (firstPointer != null && firstPointer.next != null) {
                firstPointer = firstPointer.next.next;
                secondPointer = secondPointer.next;
                System.out.println("second is inside loop : " + secondPointer.data);
//                System.out.println("second is inside loop : " + firstPointer.data);

            }
            System.out.println("middle is: " + secondPointer.data);
        }
    }

    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
//        list.push(50);

        list.printMiddleOfList();
    }
}
