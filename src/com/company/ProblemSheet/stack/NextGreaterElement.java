package com.company.ProblemSheet.stack;


import java.util.Arrays;
import java.util.Stack;

/**
 *
 * Given an array, print the Next Greater Element (NGE) for every element.
 * The Next greater Element for an element x is the first greater element on the right side
 * of x in the array. Elements for which no greater element exist, consider the next greater
 * element as -1.
 *
 * exp - [4, 5, 2, 25]
 * o/p - [5, 25, 25,-1]
 */

public class NextGreaterElement {

    /**
     *
     * brute force Method :
     *
     * Time Complexity: O(N2)
     * Auxiliary Space: O(1)
     *
     */

    public void bruteForceSol(int a[]) {

        int nextGreater;
        for (int i = 0; i < a.length; i++) {
            nextGreater = -1;
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] < a[j]) {
                    nextGreater = a[j];
                    break;
                }
            }
            a[i] = nextGreater;

        }

        //printing the array

        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " " );


    }

    /**
     *Method 2 : using stack
     *
     * logic -
     *
     * 1) create the resultant array of same length as of input array, and fill it with -1.
     * 2) create the empty stack
     * 3) loop through the input array from 0 to N, perform the below steps:-
     *      Note: here we will be storing the the index to the stack not the actual elements.
     *      a) keep comparing stack's top item with the current element of the array,
     *          if stack's top element is less than the arrays current element then put current element to the
     *          resultant array at popped position from the stack.
     *
     *      b) push ith element to the stack.
     *
     * Time Comp - O(N)
     * Space Comp - O(N)
     *
     */

    public void stackSol(int [] a) {

        int n = a.length;

        //creating the result array
        int [] res = new int[n];
        Arrays.fill(res, -1);

        //creating empty stack;

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            while(!s.isEmpty() && a[s.peek()] < a[i])
                res[s.pop()] = a[i];
            s.push(i);
        }

        //printing result array..
        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }


    }

    /**
     * circular array:
     *
     * the logic will be same as above, only run the the loop twice
     */

    public void circularArr(int [] a) {

        int n = a.length;
        int [] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < 2*n; i++) {
            while(!s.isEmpty() && a[s.peek()] < a[i % n])
                res[s.pop()] = a[i%n];
            s.push(i % n );
        }
        //printing result array..
        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }




    /**
     *
     * logic -
     *
     * 1) create the resultant array of same length as of input array.
     * 2) create the empty stack
     * 3) loop through the input array from n-1 to 0, start from last index
     *      a) keep removing the elements which are smaller than current element.
     *          to remove from stack, stack should not be empty.
     *      b) now if stack is not empty, take the element from the stack and put it into
     *          resultant arr at ith position.
     *
     *          else put -1 to resultant array at ith position.
     *      c) push ith element to the stack.
     *
     */

    public void stack1(int [] a) {

        int n = a.length;
        int [] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while(!s.isEmpty() && s.peek() < a[i])
                    s.pop();

            if(!s.isEmpty()) res[i] = s.peek();
            else res[i] = -1;

            s.push(a[i]);
        }
        //printing result array..
        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }



    public static void main(String[] args) {
        int[] a = {4, 5, 2, 25};

        int [] circular_arr = {4,5,2,1};

        NextGreaterElement greaterElement = new NextGreaterElement();
//        greaterElement.bruteForceSol(a);
//        greaterElement.stackSol(a);
//        greaterElement.stack1(a);

//        greaterElement.circularArr(circular_arr);

        greaterElement.circularArr(circular_arr);
    }



}
