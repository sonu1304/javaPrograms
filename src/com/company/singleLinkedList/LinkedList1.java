package com.company.singleLinkedList;

public class LinkedList1 {

    // this program to create single linked list of three nodes

     Node head;

     //this method will print the list

     public void printList() {
         int c = 0;
         Node n = head;
         
         while(n != null) {
             c++;
             System.out.print(n.data + " ");
             n = n.next;
         }
         System.out.println(" c " +c);
     }

    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();

        //creating 3 nodes w/o any link

        linkedList1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // creating link b/t nodes;

        linkedList1.head.next = second;
        second.next = third;

        // printing the list

        linkedList1.printList();

    }

    



    
}