package com.company.ProblemSheet.stack;

public class MinStackBestSol {

    /**
     * In this approach we will implement the linkedList, and
     * we will maintain the order like head node always will have
     * the min value
     */
    class StackNode {
        int value;
        int min;
        StackNode next;

        public StackNode(int val, int min) {
            this.min = min;
            this.value = val;
            next = null;
        }
    }

    StackNode head;

    public void push(int val) {
        if(head == null)
            head = new StackNode(val,val);
        else {
            StackNode newNode = new StackNode(val, Math.min(val,head.min));
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop() {
        int n = -1;
        if(head!= null) {
            n = head.value;
            head = head.next;
            return n;
        }
        return n;
    }

    public int getMin() {
        if(head != null)
            return head.min;
        return -1;
    }

    public int peek() {
        if(head != null)
            return head.value;
        return -1;
    }

    public static void main(String[] args) {

        MinStackBestSol stack = new MinStackBestSol();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
    }

}
