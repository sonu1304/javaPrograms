package com.company.ProblemSheet.arrays;

import java.util.Arrays;

//Merge two sorted Arrays without extra space

/**
 * Input: ar1[] = {10};
       ar2[] = {2, 3};
    Output: ar1[] = {2}
        ar2[] = {3, 10} 
 */

 /**
  * The idea is to begin from last element of ar2[] and search it in ar1[]. 
  If there is a greater element in ar1[], then we move last element of ar1[] to ar2[]. 
  To keep ar1[] and ar2[] sorted, we need to place last element of ar2[] at correct place in ar1[]
  */

 //I will use Insertion sort to solve this ...

public class Problem4 {

    static int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
    static int arr2[] = new int[]{2, 3, 8, 13};

    public static void mergeArrays(int len1, int len2) {

        for (int i = len2 - 1; i >=0; i--) {

            int j, last = arr1[len1 - 1];

            
            for (j = len1 - 2; j >= 0 && arr1[j] > arr2[i]; j--) {

                arr1[j+1] = arr1[j];
            }

            // if there was greater element.. 
            if(j != len1 - 2 || last > arr2[i]) {
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }

    }


    public static void main(String[] args) {
        

        mergeArrays(arr1.length, arr2.length);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //Time Complexity: The worst case time complexity of code/algorithm is O(m*n).
        // The worst case occurs when all elements of ar1[] are greater than all elements of ar2[].

    }


    
}
