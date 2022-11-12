package com.company.dsaOne.arrays;

public class MaxSumSubArray3 {

    /**
     * handles -ve elements case
     */

    public static int maxSumArr(int arr[]) {

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for (int i = 0; i < arr.length; i++) {

            curr_sum = Math.max(arr[i] , curr_sum + arr[i]);
            max_sum = Math.max(max_sum , curr_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int arr [] = {-9,-2,-4,-7,-3};
        System.out.println(MaxSumSubArray3.maxSumArr(arr));
    }
}
