package com.company.algos;

public class BinarySearch {

    /**
     *
     * this algo gives o(log n ) time complexity
     *
     */

    public boolean binarySearchIterative(int[] arr , int num) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {

            int mid = left + ((right - left) / 2);

            if ( arr[mid] == num) {
                return true;
            } else if (num < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    /**
     *
     * this is recursive approach..
     *
     */

    public boolean binarySearchRecursive(int [] arr, int num) {

        return binarySearchRecursive(arr, num, 0 , arr.length - 1);
    }

    public boolean binarySearchRecursive(int [] arr, int num, int left, int right) {

        if (left > right)
            return false;

        int mid = left + ((right - left) / 2);

        if (arr[mid] == num)
            return true;
        else if ( num < arr[mid]) {
            // search in left array
            return binarySearchRecursive(arr, num, left, mid - 1);
        } else {
            // we will search in right array..
            return binarySearchRecursive(arr, num, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40};

        BinarySearch search = new BinarySearch();

        System.out.println(search.binarySearchIterative(arr, 40));
        System.out.println(search.binarySearchRecursive(arr,30));
    }
}
