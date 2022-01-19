package com.company.leetCode.patterns.arrays;

import java.util.*;

/**
 *
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 * Follow up: Could you do it without extra space and in O(n) runtime?
 * You may assume the returned list does not count as extra space.
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 */

public class DisappearedNumbers {

    /**
     * using extra space :-
     */

    public static List<Integer> findDisappearedNumbers(int [] nums) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>();

        //adding all numbers in the Hashset

        for(int number : nums) {
            numbers.add(number);
        }

        //traversing Hashset with the index value of array..

        for(int i = 1; i <= nums.length; i++) {
            if(! numbers.contains(i))
                list.add(i);
        }

        return list;
    }

    /**
     *
     * without using extra space..
     *
     */

    public static List<Integer> findDisappearedNumbers2(int [] nums) {
        // creating list to hold the missing numbers..
        List<Integer> list = new ArrayList<>();

        //making all visited elements negative.
        for (int i = 0; i < nums.length; i++) {
            int curr_val = Math.abs(nums[i]);

            nums[curr_val - 1] = - Math.abs(nums[curr_val - 1]);
        }
        // if the element is still +ve , it means that is the missing the element..

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                list.add(i+1);
        }

        return list;
    }

    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
//        int [] nums2 = {4,3,1,5,7};
//        int [] nums2 = {4,3,1,5,5};
        int [] nums2 = {1,3,4,4};

//        System.out.println(findDisappearedNumbers(nums));
//        System.out.println(findDisappearedNumbers(nums2));
//        System.out.println(findDisappearedNumbers2(nums));
        System.out.println(findDisappearedNumbers2(nums2));
    }


}
