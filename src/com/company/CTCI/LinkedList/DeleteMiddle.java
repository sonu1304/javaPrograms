package com.company.CTCI.LinkedList;


/** Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node,
 *  not necessarily the exact middle) of a singly linked list, given only access to that node.
 *
 *  EXAMPLE
 * lnput:the node c from the linked list a->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 *
 *  */

public class DeleteMiddle {

    /**
     * In this p roblem, you are not given access to the head of the linked list. You only have access to that node.
     * The solution is simply to copy the data from the next node over to the current node, and then to delete the next
     * node.
     * */

    static boolean deleteMiddle(Node n) {

        if(n == null || n.next == null) return false;

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return  false;
    }
}
