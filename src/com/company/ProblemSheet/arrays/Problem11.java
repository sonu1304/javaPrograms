package com.company.ProblemSheet.arrays;


//Stock Buy and Sell to maximum profit
public class Problem11 {

    //naive solution - O(n^2)
    static int calMaxProfit(int arr[]) {

        int profit = 0;

        for(int i = 0; i < arr.length - 1; i++) {

            int current_profit = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    current_profit = arr[j] - arr[i];
                    profit = Math.max(current_profit, profit);
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(calMaxProfit(arr));
    }
    
}
