package com.company.ProblemSheet.arrays;

public class Problem9 {
    
    //Next Permutation

    // time : traverse - O(n) + traverse again - O(n) + swap - O(n) = O(3n) =~ O(n)
    // space : O(1)

    // approach :
    // 1) traverse the arr from the back to find the break point or pivot - arr[i] >= arr[i+1]
    // 2) again traverse the array from back to find the next index - arr[j] <= arr[i]
    // 3) swap the value - (arr[index1] , arr[index2])
    // 4) reverse (index1 + 1 , last index)

    static void calNextPermutation(int arr[]) {

        if (arr == null || arr.length <= 1) return;

        int i = arr.length - 2;

        while( i >= 0 && arr[i] >= arr[i+1]) i--;
        if( i >= 0 ) {
            int j = arr.length - 1;
            while(arr[j] <= arr[i]) j--;
            swap(arr , i, j);
        }
        reverse(arr, i+1, arr.length-1);

        // printing arr
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
    }

    static void swap(int arr[] , int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[] , int i , int j) {
        while(i<j) swap(arr , i++, j--);
    }

    public static void main(String[] args) {
        int arr[] = { 1,3,5,4,2};
        calNextPermutation(arr);

    }
}
