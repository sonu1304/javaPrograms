package com.company.dsaOne.algos;


/**
 *
 * Like QuickSort, Merge Sort is a Divide and Conquer algorithm.
 * It divides the input array into two halves, calls itself for the two halves,
 * and then merges the two sorted halves. The merge() function is used for merging two halves.
 * The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and
 * merges the two sorted sub-arrays into one.
 *
 * Time Complexity: Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity
 * can be expressed as following recurrence relation.
 * T(n) = 2T(n/2) + θ(n)
 *
 * The above recurrence can be solved either using the Recurrence Tree method or the Master method.
 * It falls in case II of Master Method and the solution of the recurrence is θ(nLogn).
 * Time complexity of Merge Sort is  θ(nLogn) in all 3 cases (worst, average and best) as merge sort always divides
 * the array into two halves and takes linear time to merge two halves.
 *
 * Auxiliary Space: O(n)
 *
 * Uses : -
 * 1. Merge Sort is useful for sorting linked lists in O(nLogn) time. - because Merge sort accesses data sequentially and the need of random access is low.
 * 2. Inversion Count Problem.
 *
 */

public class MergeSort {

    //to divide the array in sub arrays and merge them

    public void mergeSort(int[] a, int l, int r) {

        //check if there is at least 2 elements in the array

        if ( l < r) {

            //find the mid

            int mid = (l+r)/2 ;

            //recursive call left sub array
            mergeSort(a, l, mid);

            //recursive call right sub array
            mergeSort(a, mid + 1, r );

            //to merge the sorted arrays
            merge(a, l, mid, r);
        }

    }

    public void merge(int [] a, int l, int mid, int r) {

        //creating the extra array..

        int [] b = new int[a.length];

        int i = l;
        int j = mid + 1;
        int k = l;

        while (i <= mid && j <= r) {
            if ( a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }

            k++;
        }

        //to check if left or right array got exhausted

        if ( i > mid) {
            //copy the remaining element from right array to b[].
            while(j <= r) {
                b[k] = a[j];
                j++;
                k++;
            }
        } else {
            //copy the remaining element from left array to b[].
            while(i <= mid) {
                b[k] = a[i];
                i++;
                k++;
            }
        }

        //copying the element from b[] to a[]

        for ( k = l; k <= r; k++) {
            a[k] = b[k];
        }
    }

    void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] a = {9,4,7,6,3,1,5};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(a, 0, a.length - 1);

        mergeSort.printArr(a);

    }


}
