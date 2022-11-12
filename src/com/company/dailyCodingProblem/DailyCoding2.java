package com.company.dailyCodingProblem;

public class DailyCoding2 {

//    This problem was asked by Uber.
//
//    Given an array of integers, return a new array such that each element at index i of the new array is the product
//    of all the numbers in the original array except the one at i.
//    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
//    If our input was [3, 2, 1], the expected output would be [2, 3, 6].

    public static void calProduct(int arr[], int n) {

        //if array having only one element
        if (n == 1)
            return;

        //create the product array

        int product [] = new int [n];

        int i , temp = 1;

        //initialize the product array with 1
        for (int j = 0; j < n; j++)
            product[j] = 1;

        //calculate the product of left side
        for(i = 0; i < n; i++) {
            product[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        //calculate the product of right side
        for (i = n - 1; i >= 0; i--) {
            product[i] *= temp;
            temp *= arr[i];
        }

        // traverse the product array
        for (i = 0 ; i < n; i++)
            System.out.print(product[i] + " ");

    }

    public static void main(String [] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        calProduct(arr, n);
    }
}
