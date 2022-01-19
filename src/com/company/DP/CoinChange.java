package com.company.DP;

import com.company.singleLinkedList.interSection.InterSection2;

import java.util.Arrays;

/**
 * You are given an integer array coins representing coins of different denominations and an integer amount
 * representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made
 * up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 *
 *
 * Example 1:
 *
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 *
 */

public class CoinChange {

    /**
     * without dynamic programing
     * it will give O(m^n) time complexity
     *
     */

    public static int minCoins(int n, int a[]) {

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            //base case
            if(n == 0) return 0;

            if(n - a[i] >= 0) {
                //checking every solution
                int subAns = minCoins(n - a[i], a);

                if(subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return ans;
    }

    /**
     * using Dp, it will give O(m*n) time complexity
     */

    static int minCoinDP(int n , int a[], int [] dp) {

        if(n==0) return 0;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i< a.length; i++) {

            if ( n - a[i] >= 0) {
                int subAns = 0;

                if(dp[n - a[i]] != -1) {
                    subAns = dp[n-a[i]];
                } else {
                    subAns = minCoinDP(n-a[i], a, dp);
                }

                if(subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }

        return dp[n] = ans;
    }

    public static void main(String[] args) {
        int [] a = {7,5,1};
        int n = 18;

        int [] dp = new int[n+1];
        Arrays.fill(dp , -1);

        dp[0] = 0;

        System.out.println(minCoins(n, a));
        System.out.println(minCoinDP(n, a, dp));

        for(int i : dp) {
            System.out.print(i+" ");
        }
    }
}
