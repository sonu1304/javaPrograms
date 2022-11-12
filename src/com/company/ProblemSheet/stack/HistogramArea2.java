package com.company.ProblemSheet.stack;

import java.util.Stack;

public class HistogramArea2 {

    /**
     * this is the one pass solution.
     * time comp = O(n) + O(n) => O(n)
     * space comp = O(n)
     */

    public int largestArea(int [] a) {
        int n = a.length;
        int maxA = 0;
        Stack<Integer> s = new Stack();

        for (int i = 0; i <= n; i++) {
            while(!s.isEmpty() && (i==n || a[s.peek()] >= a[i])) {
                int height = a[s.peek()];
                s.pop();
                int width;
                if( s.isEmpty()) width = i;
                else width = i - s.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            s.push(i);
        }

        return maxA;
    }

    public static void main(String[] args) {
        int [] a = {2,1,5,6,2,3};

        HistogramArea2 area = new HistogramArea2();
        System.out.println(area.largestArea(a));
    }
}
