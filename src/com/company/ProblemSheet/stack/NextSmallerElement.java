package com.company.ProblemSheet.stack;

import java.util.Arrays;
import java.util.Stack;


public class NextSmallerElement {

    /**
     * same as of greater element, just change condition
     */

    public void nextSmallerElement(int [] a) {

        int n = a.length;
        int [] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> s = new Stack();

        for (int i = 0; i < n; i++) {
            while(!s.isEmpty() && a[s.peek()] > a[i]) {
                res[s.pop()] = a[i];
            }
            s.push(i);
        }

        //print res array
        for (int i = 0 ; i < n ; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] ar) {
        int [] a = { 11, 13, 21, 3 };
        NextSmallerElement small = new NextSmallerElement();
        small.nextSmallerElement(a);
    }
}
