package com.company.singleLinkedList;

public class LinkedListDeletion2 {

    Node head;

    //Add the node at the front of the linked list
    public void push(int data) {
        Node new_nd = new Node(data);
        new_nd.next = head;
        head = new_nd;
    }

    //delete the node at a given position
    public void deleteNode(int position) {

        //if list is empty
        if(head == null)
            return;

        Node prev = head;

        //if first position to be deleted
        if(position == 0)
            head = prev.next;

        //search the prev node
        for(int i = 0; prev!=null && i < position - 1; i++)
            prev = prev.next;

        //if position is more than the node in list or position not found
        if(prev == null || prev.next == null)
            return;

        //delete the node
        Node next = prev.next.next;
        prev.next = next;

    }

    //print the list
    public void printList() {
        Node n = head;
        while (n != null ) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDeletion2 list = new LinkedListDeletion2();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.deleteNode(2);
        list.printList();
    }
}
