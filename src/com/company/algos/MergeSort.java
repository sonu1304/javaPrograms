package com.company.algos;

/**
 * Like QuickSort, Merge Sort is a Divide and Conquer algorithm.
 *  It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
 *  The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] 
 *  and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one.
 */

 /**
  * If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = l+ (r-l)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
  */

  //Time complexity of Merge Sort is  θ(nLogn) in all 3 cases (worst, average and best)
  // as merge sort always divides the array into two halves and takes linear time to merge two halves.

  //Space - O(n)

public class MergeSort {

    static void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        //creating the temp arrays
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        // copying from sorted array to temp arrays
        for (int i = 0; i < n1; i++) 
            leftArr[i] = arr[i + left];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];
        
        //merge temp arrays..
        int i = 0, j = 0;
        int k = left;

        while(i < n1 && j < n2) {
            if(leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        //copy remainig elements from tepm arrays if left..
        while(i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    } 
     
    //pringt the array..
    static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    static void sort(int [] arr, int left, int right) {

        if(left < right) {

            int mid = left + (right - left)/2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
            
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 6, 4, 5 };
        int left = 0;
        int right = arr.length-1;
        sort(arr, left, right);
        printArr(arr);

    }
    
}
