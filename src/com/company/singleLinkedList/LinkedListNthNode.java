package com.company.singleLinkedList;

public class LinkedListNthNode {

    Node head;

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    //get n'th node in the list
    public int getNthNode(int index) {
        Node current = head;
        int count = 0;

        while(current != null) {
            if(count == index)
                return current.data;
            count++;
            current = current.next;
        }

        return 0;
    }

    public static void main(String[] args) {
        LinkedListNthNode list = new LinkedListNthNode();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        System.out.println("node at index: "+2 + " is "+list.getNthNode(2));
    }

}
