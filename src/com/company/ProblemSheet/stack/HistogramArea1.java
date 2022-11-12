package com.company.ProblemSheet.stack;

import java.util.Stack;

public class HistogramArea1 {

    /**
     * this is bit optimized approach over brute force sol.
     * in this we will create two arrays of same size of the actual array
     * leftSmall Array will have the leftSmall element's index.
     * rightSmall Array will have the right small element's index
     * we will use the Stack for this
     *
     *
     * T.C -
     *
     * O(n) + O(n) for leftSmall
     * O(n) + O(n) for rightSmall
     *
     * this is including stack
     *
     * total - O(n) + O(n) + O(n) + O(n) = 4 O(n) => O(n)
     *
     * space complexity -  O(3n)
     *
     */

    public int largestArea (int [] a) {
        int n = a.length;
        int [] leftSmall = new int[n];
        int [] rightSmall = new int[n];
        Stack<Integer> s = new Stack();

        int maxArea = 0;


        //creating leftSmall arr

        for (int i = 0; i<n; i++) {
            while(!s.isEmpty() && a[s.peek()] >= a[i])
                s.pop();
            if(s.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = s.peek() + 1;
            s.push(i);

        }

        /**
         * lets empty the stack, so that it can reused again for rightSmall array
         */

        while (!s.isEmpty())
            s.pop();

        //creating rightSmall

        for(int i = n - 1; i > 0; i--) {
            while (!s.isEmpty() && a[s.peek()] >= a[i] )
                s.pop();
            if(s.isEmpty()) rightSmall[i] = n - 1;
            else rightSmall[i] = s.peek() - 1;
            s.push(i);
        }

        /**
         * cal the max area using leftSmall and rightSmall arrays
         */
        for(int i = 0; i<n; i++) {
            maxArea = Math.max(maxArea, a[i] * (rightSmall[i] - leftSmall[i] + 1));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int [] a = {2,1,5,6,2,3};
        HistogramArea1 area = new HistogramArea1();
        System.out.println(area.largestArea(a));
    }

}
