package com.company.singleLinkedList.loopDetection;

import com.company.singleLinkedList.Node;

public class ListLoopDetection2 {

    Node head;

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    // Floyd’s Cycle-Finding Algorithm

//    This is the fastest method and has been described below:
//
//    Traverse linked list using two pointers.
//    Move one pointer(second_ptr) by one and another pointer(first_ptr) by two.
//    If these pointers meet at the same node then there is a loop. If pointers do not meet then linked list doesn’t have a loop.
    // it does not take extra space it take o(n) time complexity , coz we need to travers the list once

    public void findLoodInList() {
        Node first_ptr = head;
        Node second_ptr = head;
        boolean flag = false;

        while (second_ptr != null && first_ptr != null && first_ptr.next != null) {

            first_ptr = first_ptr.next.next;
            second_ptr = second_ptr.next;
//            System.out.println("first ptr: "+first_ptr.data + " & second pointer :" + second_ptr.data);

            if (first_ptr == second_ptr) {
                flag = true;
//                System.out.println("first ptr: "+first_ptr.data + " & second pointer :" + second_ptr.data);
                break;
            }
        }

        System.out.println(flag ? "Yes there is loop in the linked list.." : "No there is no loop...");
    }

    public static void main(String[] args) {
        ListLoopDetection2 list = new ListLoopDetection2();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        // creating the loop in the list
        list.head.next.next.next.next.next = list.head.next;
        Node temp = list.head;
//        temp = temp.next.next;
        System.out.println(temp.next.next.data);
//        System.out.println(list.head.next.next.next.next.data);

        list.findLoodInList();

    }
}
