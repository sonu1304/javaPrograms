package com.company.dsaOne.arrays;

public class MajorityElement {


    /**
     *
     * time complexity - O(n^2)
     * space complexity - O(1)
     *
     */


    public int findElement(int arr[]) {

        int size = arr.length;

        int count = 0;
        int n = 0;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i +1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    n = arr[i];
                    count++;
                }
            }
        }

        if (count > size/2)
            return n;
        return 0;
    }

    public static void main(String[] args) {
//        int arr [] = {5,1,4,1,1};

        int arr [] = {1, 1, 2, 1, 3, 5, 1};
        MajorityElement m = new MajorityElement();

        int n = m.findElement(arr);

//        System.out.println(n > (arr.length/2) ? n : 0);

        System.out.println(n);
    }
}
