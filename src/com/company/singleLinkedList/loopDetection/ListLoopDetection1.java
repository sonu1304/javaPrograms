package com.company.singleLinkedList.loopDetection;
import com.company.singleLinkedList.Node;

import java.util.HashSet;

public class ListLoopDetection1 {

    Node head;

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    // detecting the loop in the linked list by hashing approach
    //this takes o(n) tine and space complexity because hashset takes extra space to store the nodes
    public boolean loopDetect() {
        HashSet<Node> hashSet = new HashSet<>();
        while ( head != null ) {
            //if set is already having the node then there is loop in the list
            if(hashSet.contains(head))
                return true;
            hashSet.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListLoopDetection1 list = new ListLoopDetection1();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        // creating the loop in the list
        list.head.next.next.next = list.head;

        System.out.println(list.loopDetect() ? "Loop found" : "No loop found" );
    }
}
