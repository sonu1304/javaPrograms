package com.company.CTCI.LinkedList;


/**
 * Sum Lists: You have two numbers represented by a linked list,where each node contains a single digit.
 * The digits are stored in reverse order,such that the 1's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295. Output:2 -> 1 -> 9.That is,912.
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem. Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).
 * That is,617 + 295. Output:9 ->1 ->2.That is,912.
 * */

public class SumLists {

    public static Node addLists(Node l1, Node l2, int carry) {

        if(l1 == null && l2 == null && carry == 0) return null;

        Node result = new Node();

        int val = carry;

        if(l1 != null) val += l1.data;
        if(l2 != null) val += l2.data;

        result.data = val % 10; //second digit

        /** recursive call */
        if(l1 != null || l2 != null) {
            Node moreNodes = addLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next, val >= 10 ? 1 : 0);
            result.setNext(moreNodes);
        }
        return result;
    }
}
