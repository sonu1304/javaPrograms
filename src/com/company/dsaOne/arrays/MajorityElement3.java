package com.company.dsaOne.arrays;

import java.util.HashMap;

public class MajorityElement3 {

    //using hashmap extra space - O(n)
    // time complexity - O(n)

    HashMap<Integer, Integer> map = new HashMap<>();

    public int findElement(int arr[]) {

        for (int num : arr) {
            map.put(num, 1);
        }
        return -1;
    }

}
