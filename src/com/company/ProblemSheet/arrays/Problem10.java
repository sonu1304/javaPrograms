package com.company.ProblemSheet.arrays;

public class Problem10 {

    //Count Inversions in an array | Set 1 (Using Merge Sort)
    /**
     * nversion Count for an array indicates – how far (or close) the array is from being sorted. 
     * If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum. 
        Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
     */

    //brute - force solution..
    //time: O(n^2)
    //space: O(1)
    static void countInversion(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++)
            for(int j = i+1; j < arr.length; j++)
                if(arr[i] > arr[j] && i < j)
                    count++;
        System.out.println("inversion count : "+count);            
    }


    //time - O(nlogn)
    //space - O(n)
    static int merge(int arr[], int left, int mid, int right) {

        int swap_count = 0;

        int n1 = mid - left + 1;
        int n2 = right - mid ;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        // copy the elements to temp arrays..

        for(int i = 0; i < n1; i++)
            leftArr[i] = arr[i+left];
        for(int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        //merger the temp arrays..
        int i = 0, j = 0, k = left;
        
        while( i < n1 && j < n2) {
            if(leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++]; 
            } else {
                arr[k++] = rightArr[j++];
                swap_count += (mid + 1) - (left + i);

            }
        }

        //copy remaining elements if any..
        while(i < n1) 
            arr[k++] = leftArr[i++];

        while(j < n2) 
            arr[k++] = rightArr[j++];

        return swap_count;
    }

    static int sort(int arr[], int left, int right) {
        int inversion_coount = 0;

        if(left < right) {
            int mid = left + (right - left) / 2;
            inversion_coount += sort(arr, left, mid);
            inversion_coount += sort(arr, mid + 1, right);
            inversion_coount += merge(arr, left, mid, right);
        }

        return inversion_coount;
    }

    public static void main(String[] args) {
        int arr[] = {8,4,2,1};
        // countInversion(arr);
        System.out.println(sort(arr, 0, arr.length - 1));
    }
}
