package com.company.dsaOne.arrays;

public class MaxSumSubArray2 {

    /**
     * using Kadane's Algo
     *
     * time complexity - O(n)
     * space complexity - O(1)
     *
     * but this cannot handle if all the elements are -ve
     *
     */

    public int maxSumArr(int arr[]) {

        int max = arr[0];
        int curr_max = 0;

        for (int i = 0; i < arr.length; i++) {

            curr_max += arr[i];

            if (curr_max < 0)
                curr_max = 0;
            else if(curr_max > max)
                max = curr_max;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

//        int arr [] = {-9,-2,-4,-7,-3};

        MaxSumSubArray2 m = new MaxSumSubArray2();

        System.out.println(m.maxSumArr(arr));
    }
}
