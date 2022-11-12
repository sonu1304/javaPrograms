package com.company.singleLinkedList;

public class LinkedListDeletion3 {

    Node head;

    //adding the node
    public void push(int data) {
        Node nw_nd = new Node(data);
        nw_nd.next = head;
        head = nw_nd;
    }

    //deleting the list
    public void delteList() {
        head = null;
    }
    //print list
    public void printList() {
        Node n = head;
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        while (n!=null) {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDeletion3 list = new LinkedListDeletion3();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.delteList();
        list.printList();
    }

}
