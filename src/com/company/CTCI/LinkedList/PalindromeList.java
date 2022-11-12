package com.company.CTCI.LinkedList;

import java.util.Stack;

public class PalindromeList {

    /** Solution : 1 */

    public static boolean isPalindrome(Node head) {
        Node reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    private static Node reverseAndClone(Node node) {
        Node head = null;

        while (node != null) {
            Node n = new Node(node.data); //clone
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    private static boolean isEqual(Node list1, Node list2) {
        while(list1 != null && list2 != null) {
            if(list1.data != list2.data) return false;
            list1 = list1.next;
            list2 = list2.next;
        }
        return list1 == null && list2 == null;
    }

    /** Solution: 2 **/

    public static boolean isListPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        Stack<Integer> stack = new Stack<>();

        /** moving first half of the list onto stack */
        while(fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next; // moving 2x speed
        }

        /** if list has odd number of elements, skip middle */
        if(fast != null) {
            slow = slow.next;
        }

        /** comparing stack elements with the second half of the list */
        while(slow != null) {
            int top = stack.pop().intValue();
            if(top != slow.data) return false;
            slow = slow.next;
        }
        return true;
    }
}
