package com.company.dsaOne.algos;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element
 * (considering ascending order) from unsorted part and putting it at the beginning.
 * The algorithm maintains two subarrays in a given array.
 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.
 * In every iteration of selection sort, the minimum element (considering ascending order)
 * from the unsorted subarray is picked and moved to the sorted subarray.
 */

public class SelectionSort {

    public void selectionSort(int a[] , int n) {

        for (int i = 0; i < n-1; i++) {
            int min = i;

            //step to find the index of minimum element..
            for (int j = i+1; j < n; j++) {
                if(a[j] < a[min])
                    min = j;
            }

            //check if the current index is already minimum element then there is no need to swap
            if(min != i)
                swap(a, min, i);
        }

        printArr(a,n);

    }

    public int[] swap(int a[], int min, int i) {
        int temp = a[min];
        a[min] = a[i];
        a[i] = temp;

        return a;
    }

    //printing sorted array
    public void printArr(int a[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a [] = {7,4,8,2,3,1,5};

        SelectionSort sort = new SelectionSort();
        sort.selectionSort(a, a.length);
    }
}

