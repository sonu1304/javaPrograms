
package com.company.CTCI.LinkedList;

import java.util.HashSet;

/** Remove Dups: Write code to remove duplicates from an unsorted linked list. FOLLOW UP
 How would you solve this problem if a temporary buffer is not allowed?
 */

public class RemoveDups {

    /** Solution 1: using Set - solution takes O(N) time, where N is the number of elements in the linked list. */

    static void deleteDuplicate(Node n ) {
        HashSet<Integer> set = new HashSet();
        Node prev = null;
        while ( n != null) {
            if(set.contains(n.data)) prev.next = n.next;
            else {
                set.add(n.data);
                prev = n;
            }

            n = n.next;
        }
    }
    /** Solution 2: Follow Up: No Buffer Allowed
     * This code runs in O(1) space,but O(N^2) time.
     * */

    static void deleteDupNode(Node head) {

        Node current = head;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if(runner.next.data == current.data) runner.next = runner.next.next;
                else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

    }

}
