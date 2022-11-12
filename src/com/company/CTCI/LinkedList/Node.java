package com.company.CTCI.LinkedList;

public class Node {

    public int data;
    public Node next;

    public Node() {

    }

    public Node(int data ) {
        this.data = data;
        next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
