package com.company.dsaOne.algos;


/**
 *
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot
 * and partitions the given array around the picked pivot. There are many different versions of quickSort
 * that pick pivot in different ways.
 *
 * Always pick first element as pivot.
 * Always pick last element as pivot (implemented below)
 * Pick a random element as pivot.
 * Pick median as pivot.
 * The key process in quickSort is partition(). Target of partitions is, given an array and an element
 * x of array as pivot, put x at its correct position in sorted array and put all smaller elements
 * (smaller than x) before x, and put all greater elements (greater than x) after x.
 * All this should be done in linear time.
 *
 */

public class QuickSort {



    //this is the major function of quicksort
    public int partition(int low , int high, int arr[]) {

        int pivot = arr[low];

//        int pivot = arr[(low+high)/2];

        int i = low;
        int j = high;

        while(i < j) {

            //move ith pointer from left to right..
            while (arr[i] <= pivot) i++;

            //move jth pointer from right to left..
            while(arr[j] > pivot) j--;

            if( i < j)
                swap(arr, i, j);
        }

        // if i > j , then swap pivot with jth element..

        swap(arr, j, low);

        //return pivot's position after swapping..

        return j;
    }

    //this is driver function..
    public void quickSort(int low , int high, int arr[]) {

        // there should to be two elements in arr at least..

        if ( low < high) {

            int pivot = partition(low, high, arr);

            //after getting pivot's position
            // call quickSort to sort the left and right part of the array..

            quickSort(low, pivot-1, arr);
            quickSort(pivot + 1, high, arr);

        }

    }

    public void swap(int arr[], int l, int h) {

        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }

    public void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};

        QuickSort sort = new QuickSort();

        int high = arr.length-1;

        sort.quickSort(0, high , arr);

        sort.printArr(arr);
    }

}
