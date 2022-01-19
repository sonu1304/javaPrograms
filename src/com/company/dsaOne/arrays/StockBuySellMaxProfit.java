package com.company.dsaOne.arrays;

public class StockBuySellMaxProfit {

    //brute force approach..
    // time complexity - O(n^2)
    public int maxProfit(int [] arr, int size) {


        int profit = 0;

        for (int i = 0; i < size - 1; i++) {
            for(int j = i+1; j < size; j++) {
                if (arr[j] > arr[i]) {
                    int current_profit = arr[j] - arr[i];
                    profit = Math.max(profit, current_profit);
                }
            }
        }
        return profit;
    }

    /**
     *
     * efficient approach
     * time complexity - O(n)
     * space complexity - O(1)
     *
     */

    public int calProfit(int arr[], int size){

        int minSoFar = arr[0];
        int max_profit = 0 ;

        for (int i = 0; i < size; i++) {

            minSoFar = Math.min(minSoFar, arr[i]);
            int current_profit = arr[i] - minSoFar;

            max_profit = Math.max(max_profit, current_profit);
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

//        int arr1 [] = { 100, 180, 260, 310,
//                40, 535, 695 };
        StockBuySellMaxProfit max = new StockBuySellMaxProfit();
        System.out.println(max.maxProfit(arr, arr.length));
        System.out.println(max.calProfit(arr, arr.length));
    }
}
