package com.company.singleLinkedList;

public class LinkedListInsert2 {

    Node head;

    //adding new node after a given node
    public void insertAfter(Node prev_node , int data) {

        if(prev_node == null) {
            System.out.println("prev node cant be null");
            return;
        }

//        System.out.println("third data " + prev_node.data);

        Node new_node = new Node(data);

        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    // print the list..
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListInsert2 list = new LinkedListInsert2();

        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(50);

        //link these node
         list.head.next = second;
         second.next = third;
         third.next = fourth;

         // calling method to add new node after third node in the list
        list.insertAfter(third,40);

        //printing the list after adding the node..
        list.printList();
    }
}
