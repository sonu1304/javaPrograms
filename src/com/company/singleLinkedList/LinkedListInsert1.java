package com.company.singleLinkedList;

public class LinkedListInsert1 {

    // there are 3 ways of insert a new element in linked list
    // 1 At front of the linked List
    // 2 in between the linked list
    // 3 At last of the linked List

    Node head;

//    LinkedListInsert1 list;

    //traverse the list
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    //adding the new node at first of the linked list

    /**
     *
     * The new node is always added before the head of the given Linked List.
     * And newly added node becomes the new head of the Linked List. For example, if the given
     * Linked List is 10->15->20->25 and we add an item 5 at the front, then the Linked
     * List becomes 5->10->15->20->25. Let us call the function that adds at the front of the list is push().
     * The push() must receive a pointer to the head pointer, because push must change the head pointer to point
     * to the new node
     *
     */

    public void addAtFront(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String args[]) {
        // creating list of 3 nodes
        LinkedListInsert1 list = new LinkedListInsert1();

        list.head = new Node(10);
        Node second = new Node(15);
        Node third = new Node(20);

        // creating link b/w nodes
        list.head.next = second;
        second.next = third;

        list.addAtFront(5);
        list.printList();
    }
}
