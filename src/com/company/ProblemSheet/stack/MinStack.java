package com.company.ProblemSheet.stack;

import java.util.Stack;

/**
 *
     Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

     MinStack() initializes the stack object.
     void push(val) pushes the element val onto the stack.
     void pop() removes the element on the top of the stack.
     int top() gets the top element of the stack.
     int getMin() retrieves the minimum element in the stack.

 */

public class MinStack {

    /**
     * this solution is taking 2 stacks
     * hence space complexity is O(2n)
     */

    Stack<Integer> s = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    int min = 0;
    public void push(int val) {
        if(minStack.isEmpty()) {
            min = val;
            minStack.push(val);
        } else {
            min = Math.min(min, val);
            minStack.push(min);
        }

        s.push(val);
    }

    public int getMin(){
        return minStack.peek();
    }

    public int pop() {

        minStack.pop();
        return s.pop();
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st.getMin());
        System.out.println(st.pop());
        System.out.println(st.getMin());

    }

}
