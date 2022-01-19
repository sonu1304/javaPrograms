package com.company.dsaOne.algos;

import java.io.BufferedReader;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in wrong order.
 *
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 * Auxiliary Space: O(1)
 * Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
 *
 * Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.
 * In computer graphics it is popular for its capability to detect a very small error
 * (like swap of just two elements) in almost-sorted arrays and fix it with just linear complexity (2n).
 * For example, it is used in a polygon filling algorithm, where bounding lines are sorted by their x coordinate
 * at a specific scan line (a line parallel to x axis) and with incrementing y their order changes
 * (two elements are swapped) only at intersections of two lines
 */

public class BubbleSort {

    public void bubbleSort(int arr[], int n) {

        //to optimized
        boolean swapped = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j+1] < arr[j]) {
                    swapped = true;

                    swap(arr, j+1, j);
                }
            }

            if (!swapped)
                break;
        }

        printArr(arr, n);
    }

    public int[] swap(int arr[], int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public void printArr(int arr[], int n ) {

        for (int i = 0 ; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {7,4,8,2,3,1,5};

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr, arr.length);
    }
}
