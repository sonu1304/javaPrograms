package com.company.dsaOne.algos;

/**
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
 * The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked
 * and placed at the correct position in the sorted part.
 *
 * Time Complexity: O(n^2)
 * Auxiliary Space: O(1)
 * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order.
 * And it takes minimum time (Order of n) when elements are already sorted.
 *
 * Uses: Insertion sort is used when number of elements is small.
 * It can also be useful when input array is almost sorted, only few elements are misplaced in complete big
 * array.
 */

public class InsertionSort {

    public void insertionSort(int arr[] , int n) {

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while( j >= 0 && arr[j] > temp ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        // printing sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort sort = new InsertionSort();
        sort.insertionSort(arr, arr.length);
    }
}
