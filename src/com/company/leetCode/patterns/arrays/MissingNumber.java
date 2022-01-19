package com.company.leetCode.patterns.arrays;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 *
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 * 2 is the missing number in the range since it does not appear in nums.
 */

public class MissingNumber {

    public static int missingNum(int [] nums) {
        int sum = 0;
        for (int i = 1; i <= nums.length; i++)
            sum += i;

        for (int num : nums) sum -= num;

        return sum;
    }

    public static void main(String[] args) {
        int [] nums = {3,0,1};
        System.out.println(missingNum(nums));
    }
}
