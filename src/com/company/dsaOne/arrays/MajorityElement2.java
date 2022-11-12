package com.company.dsaOne.arrays;

import java.util.Arrays;

public class MajorityElement2 {

    // time complexity - O(nlogn)
    // space complexity - O(1)

    public int findElement(int arr[]) {

        // first sort the array -- which will take O(n logn)

        Arrays.sort(arr);

        int num = 0;
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i+1]) {
                num = arr[i];
                count++;
            }
        }

        if (count > (arr.length/2))
            return num;

        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {5,1,4,1,1};

        MajorityElement2 m = new MajorityElement2();
        System.out.println(m.findElement(arr));
    }
}
