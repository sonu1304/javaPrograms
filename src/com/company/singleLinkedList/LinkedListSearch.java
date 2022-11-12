package com.company.singleLinkedList;

public class LinkedListSearch {
    Node head;

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    //search the given node in the list
    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data)
                return true;
            current = current.next;
        }
        return false;
    }

    //recursive method to search the given node
    public boolean recursiveSearch(Node head , int data) {
        if(head == null)
            return false;
        if(head.data == data)
            return true;
        return recursiveSearch(head.next, data);
    }

    public static void main(String[] args) {

        LinkedListSearch list = new LinkedListSearch();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        long start = System.currentTimeMillis();

        System.out.println(list.searchNode(40) ? "YES" : "NOT FOUND");
        System.out.println(list.recursiveSearch(list.head,40) ? "YES" : "NOT FOUND");

        long end = System.currentTimeMillis();
        System.out.println("time taken to complete the execution: " + (end - start) +"ms");
    }
}
