package com.company.stack.implementations;

public class StackByArray {

    /**
     * we will implement stack by using Array DS..
     *
     */
    int [] a;

    int top = -1;

    public void initializeArr(int n) {
        a = new int[n];
    }
    public void push(int item) {
        // increment the top first and then insert the item
        a[++top] = item;
    }

    public int pop() {
        top--;
        return a[top+1];
    }

    public int size() {
        return top+1;
    }

    public int top() {
        return a[top];
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    public static void main(String[] args) {
        StackByArray stack = new StackByArray();
        stack.initializeArr(5);
        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println("size: " +stack.size());
        System.out.println("top: " + stack.top());
        System.out.println("isEmpty: "+stack.isEmpty());
    }
}
