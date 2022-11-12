package com.company.dsaOne.arrays;

public class MaxSumSubArray {


    /**
     * this is brute force approach..
     * time complexity - O(n^2)
     */


    int calMaxSum(int arr[]) {

        int maxsum = 0;
        for(int i = 0; i < arr.length; i++) {

            int curr_sum = 0;

            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];

                if (maxsum < curr_sum)
                    maxsum = curr_sum;
            }

        }

        return maxsum;
    }

    public static void main(String[] args) {
//        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int arr [] = {5,-4,-2,6,-1};
        MaxSumSubArray max = new MaxSumSubArray();


        System.out.println(max.calMaxSum(arr));
    }
}
