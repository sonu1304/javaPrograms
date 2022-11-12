package com.company.singleLinkedList.interSection;

import com.company.singleLinkedList.Node;

import java.util.Arrays;
import java.util.Collection;

public class ListInterSection1 {

    public static int intersectNode(Node list1Head, Node list2Head) {
        if (list1Head == null || list2Head == null)
            return 0;
        Node pointer1 = list1Head;
        Node pointer2 = list2Head;

        while (pointer1.data != pointer2.data) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

            if (pointer1 == null)
                pointer1 = list2Head;
            if (pointer2 == null)
                pointer2 = list1Head;
        }
        return pointer1.data;
    }

    public static void main(String ar[]) {


        ListInterSection1 list1 = new ListInterSection1();
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);

        Node head2 = new Node(10);
        head2.next = new Node(15);
        head2.next.next = new Node(30);


        System.out.println(intersectNode(head1, head2));

//        System.out.println("List1--->" + list1.head1.data);
//        System.out.println("List2--->" + list1.head2.data);

    }

}
