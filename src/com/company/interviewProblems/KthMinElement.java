package com.company.interviewProblems;

import java.util.Arrays;

/**
 * find the kth minimum element in the unsorted array
 */

public class KthMinElement {

    public static int minElement(int a[], int k) {
        Arrays.sort(a);
        return a[k-1];
    }

    public static void main(String[] args) {
        int [] a = { 12, 3, 5, 7, 19 };
        System.out.println(minElement(a, 3));
    }
}
