package com.company.CTCI.LinkedList;

/** Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.*/

public class KthToLast {

    /** Solution :  Iterative
     *
     * A more optimal, but less straightforward, solution is to implement this iteratively.
     * We can use two pointers, pl and p2. We place them k nodes apart in the linked list by putting p2 at the
     * beginning and moving pl k nodes into the list. Then, when we move them at the same pace, pl will hit the end
     * of the linked list after LENGTH - k steps. At that point,p2 will be LENGTH - k nodes into the list,
     * or k nodes from the end.
     *
     * */

    static Node kthToLast(Node head, int k ) {
        Node p1 = head;
        Node p2 = head;

        // moving p1 k nodes in the list
        for(int i = 0; i < k; i++) {
            if(p1 == null) return null;
            p1 = p1.next;
        }

        /** moving p1 and p2 at the same pace, when p1 will hit the end, p2 will be at the right place */
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
