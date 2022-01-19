package com.company.ProblemSheet.arrays;

public class Problem2 {

    //Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array.
    // The functions should put all 0s first, then all 1s and all 2s in last.


    public static void printArray(int arr[]) {

        for(int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }

    }

    public static void logn2Solution(int arr[]) {

        //log(n^2) solution ... 
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        printArray(arr);
        
    }

    public static void logn1solution(int arr[]) {

        //Time Complexity: O(n).
        //Space Complexity: O(1).
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int temp = 0;

        while (mid <= high) {

            switch (arr[mid]) {

                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1: {
                    mid++;
                    break;
                }

                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }

        }

        printArray(arr);

    }

    public static void logn1solutionWithoutswap(int arr[]) {

        //Time Complexity: O(n).
        //Space Complexity: O(1).

        int i, count_0 = 0, count_1 = 1, count_2 = 2;

        //count the number of 0's , 1's and 2's  
        for (i = 0 ; i < arr.length; i++) {
            
            switch(arr[i]) {

                case 0: {
                    count_0++;
                    break;
                }

                case 1: {
                    count_1++;
                    break;
                }

                case 2: {
                    count_2++;
                    break;
                }

            }
        }

        i = 0;

        // update the array..

        while(count_0 > 0) {
            arr[i++] = 0;
            count_0--;
        }

        while(count_1 > 0) {
            arr[i++] = 1;
            count_1--;
        }

        while(count_2 > 0) {
            arr[i++] = 2;
            count_2--;
        }

        printArray(arr);

    }

    public static void main(String[] args) {
        
        // int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr [] = {0, 1, 2, 0, 1, 2};

        logn2Solution(arr);
        System.out.println("printing O(1) solution...");
        logn1solution(arr);
        System.out.println("-----------------------");
        logn1solutionWithoutswap(arr);
        
    }
    
}
