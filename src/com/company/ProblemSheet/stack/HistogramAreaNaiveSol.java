package com.company.ProblemSheet.stack;

/**
 * Given an array of integers heights representing the histogram's bar height where the width
 * of each bar is 1, return the area of the largest rectangle in the histogram.
 *
 * Input: heights = [2,1,5,6,2,3]
 * Output: 10
 * Explanation: The above is a histogram where width of each bar is 1.
 * The largest rectangle has an area = 10 units.
 */

public class HistogramAreaNaiveSol {

    /**
     * this is the brute force solution,
     * time complexity - O(n^2)
     */

    /**
     * 1. find right small height
     * 2. find left small height
     * 3. use formula - (rightSmall - leftSmall + 1) * arr[i]
     * 4 return the maxArea.
     */

    public int largestRectangleArea(int [] a) {

        int n = a.length;
        int maxArea = 0;
        int leftSmall = 0;
        int rightSmall = 0;

        for (int i = 0 ; i < n; i++ ) {

            for (int j = i; j < n; j++) {
                if (a[i] > a[j]) {
                    rightSmall = j - 1;
                    break;
                }
            }

            int k = i - 1;

            while ( k >= 0) {
                if (a[i] > a[k]) {
                    leftSmall = k + 1;
                    break;
                }
                k--;
            }

            int currArea = (rightSmall - leftSmall + 1) * a[i];

            maxArea = Math.max(currArea, maxArea);


        }

        return maxArea;
    }

    public static void main(String [] ar) {

        int [] a = {2,1,5,6,2,3};

        HistogramAreaNaiveSol naiveSol = new HistogramAreaNaiveSol();
        System.out.println(naiveSol.largestRectangleArea(a));
    }
}
