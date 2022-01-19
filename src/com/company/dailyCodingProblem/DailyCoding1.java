package com.company.dailyCodingProblem;

import java.util.HashSet;

public class DailyCoding1 {

    // date - 18 oct 2020

//    This problem was recently asked by Google.
//
//    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//
//    Bonus: Can you do this in one pass?


    public static boolean isTwoNum( int arr[] , int k ) {

        HashSet<Integer> set = new HashSet();

        for(int i = 0; i < arr.length; i++) {
            int diff = k - arr[i];

            if(set.contains(diff))
                return true;
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String [] args) {

        int arr[] = {10,15,3,7};
        int k = 17;

        System.out.println(isTwoNum(arr , k ) ? " Yes" : " NO ");
    }

//    Time Complexity: O(n).
//    As the whole array is needed to be traversed only once.
//    Auxiliary Space: O(n).
//    As a hash map has been used to store array elements.

}
