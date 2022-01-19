package com.company.dsaOne.arrays;

public class RainWaterTrappingProblem {

    /**
     * solving using extra space :
     * time complexity : O(n)
     * space complexity : O(n) + O(n) = O(2n) => O(n)
     */

    public int findRainWaterTrap(int a[], int size) {

        int maxWater = 0;

        // creating to auxiliary arrays

        // left array --

        int left[] = new int[size];

        int right[] = new int [size];

        //filling left array

        left[0] = a[0];

        for (int i = 1; i < size; i++) {
            left[i] = Math.max(a[i] , left[i-1]);
        }

        // creating right array

        right[size - 1] = a[size - 1];

        for (int i = size - 2; i >= 0; i--) {
            right[i] = Math.max(a[i] , right[i+1]);
        }

        //find the max trapped water


        for (int i = 0; i < size; i ++) {

            maxWater += Math.min(left[i] , right[i]) - a[i];
        }

        return maxWater;

    }

    public static void main(String[] args) {
        int a [] = {3,1,2,4,0,1,3,2};
        int size = a.length;

        RainWaterTrappingProblem water = new RainWaterTrappingProblem();

        System.out.println(water.findRainWaterTrap(a,size));
    }

}
