package com.company.leetCode.patterns.arrays;

/**
*
*
* Given an integer array nums, return true if any value appears at least twice in the array,
* and return false if every element is distinct.
    Example 1:

    Input: nums = [1,2,3,1]
    Output: true
*
* */


import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int [] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(!hashSet.add(nums[i]))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

}
