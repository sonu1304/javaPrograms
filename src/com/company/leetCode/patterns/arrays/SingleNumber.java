package com.company.leetCode.patterns.arrays;

import java.util.HashMap;

/**
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 *
 */

public class SingleNumber {

    /**
     * Method 1 - Using Hash tables
     *
     * Algorithm
     *
     * We use hash table to avoid the O(n^2) time required for searching the elements.
     *
     * Iterate through all elements in nums and set up key/value pair.
     * Return the element which appeared only once.
     *
     * Complexity Analysis
     *
     * Time complexity : O(n.1) = O(n). Time complexity of for loop is O(n).
     *
     * Space complexity : O(n). The space required by hash_table is equal to the number of elements in nums.
     */

    public static int findSingleNumber(int [] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        //getOrDefault  -  this method returns default value if there is not value for given key
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums) {
            if (map.get(i) == 1)
                return i;
        }

        return 0;
    }

    /**
     *
     * Method 2 - Using Bit Manipulation
     *
     * Concept:
     *
     * If we take XOR of zero and some bit, it will return that bit
     *  a ^ 0 = a
     * If we take XOR of two same bits, it will return 0
     * a ^ a = 0
     *
     * a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b
     * So we can XOR all bits together to find the unique number.
     *
     * Complexity Analysis
     *
     * Time complexity : O(n). We only iterate through nums, so the time complexity is the number of elements in nums.
     *
     * Space complexity : O(1).
     *
     */

    public static int singleNumberByXOR(int [] nums) {

        int missingNum = 0;

        for (int number : nums )
            missingNum ^= number;

        return missingNum;
    }

    public static int printWord() {

        int count = 0;

        for (int i = 0; i < 10; i = i++) {
            i += 1;

            count++;
        }

        return count;
    }



    public static void main(String[] args) {
        int nums [] = {2,2,1};

        System.out.println(findSingleNumber(nums));
        System.out.println(singleNumberByXOR(nums));

        System.out.println("print === "+ printWord());


    }
}
