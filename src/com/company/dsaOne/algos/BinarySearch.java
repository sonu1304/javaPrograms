package com.company.dsaOne.algos;

/**
 *
 * Binary Search: Search a sorted array by repeatedly dividing the search interval in half.
 * Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle
 * of the interval, narrow the interval to the lower half. Otherwise, narrow it to the upper half.
 * Repeatedly check until the value is found or the interval is empty.
 *
 * The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n).
 * We basically ignore half of the elements just after one comparison.
 *
 * 1.Compare x with the middle element.
 * 2.If x matches with the middle element, we return the mid index.
 * 3.Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
 * 4.Else (x is smaller) recur for the left half.
 *
 */


public class BinarySearch {

    //Iterative method , which is faster than recursive method

    public int binarySearch(int[] a, int key) {

        int l = 0;
        int h = a.length - 1;

        while ( l <= h) {
            int mid = l + ( h - l) / 2;

            if (a[mid] == key) return mid;

            else if(key > a[mid]) l = mid + 1; // search in right side

            else h = mid - 1; // search in left side
        }
        //if there is no key at all in the entire array

        return -1;

    }


    /**
     * recursive method , this is slow for binary search
     * it uses extra auxiliary space that is recursive call stack space = O(log n)
     *
     */

    public int binarySearch(int[] a, int key, int l, int h) {

        if ( l > h) return -1;

        int mid = l + ( h - l) / 2;

        if ( a[mid] == key) return mid;

        if (key > a[mid]) return binarySearch(a, key, mid+1, h);

        return binarySearch(a, key, l, mid - 1);
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 10, 40 };

        // [2, 3, 4, 10, 40]
        //  0  1  2  3   4

        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(a,10)); // o/p = 3
        System.out.println(search.binarySearch(a, 10, 0, a.length)); // o/p = 3
    }

}
