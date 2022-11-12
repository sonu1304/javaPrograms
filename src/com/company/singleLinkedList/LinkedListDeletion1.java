package com.company.singleLinkedList;

public class LinkedListDeletion1 {

    Node head;

    //add node at front
    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    //delete the firs occurrence of given key
    public void deleteNode(int data) {
        Node temp = head;
        Node prev = null;

        //if node to be deleted is present at the front of linked list
        if(temp != null && temp.data == data) {
            head = temp.next; //changed head
            return;
        }

        //search the node in the list and keep track of prev node
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        //if the node to be deleted is not found in list
        if(temp == null) return;

        //if found then delete
        prev.next = temp.next;
    }

    //print the list
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDeletion1 list = new LinkedListDeletion1();

        //adding node
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.deleteNode(30);
        list.printList();
    }
}
