package com.company.dsaOne.arrays;

public class MajorityElement4 {

    // Using Boyer Moore’s Majority Voting Algorithm

    /**
     * time complexity - O(n)
     * space complexity - O(1)
     */

    /**
     * Algorithm:
     *1 Loop through each element and maintains a count of majority element, and a majority index, maj_index
     *2 If the next element is same then increment the count if the next element is not same then decrement the count.
     *3 if the count reaches 0 then changes the maj_index to the current element and set the count again to 1.
     *4 Now again traverse through the array and find the count of majority element found.
     *5 If the count is greater than half the size of the array, print the element
     *6 Else print that there is no majority element
     */

    public void printMajorityCandidate(int arr[] , int size) {

        int candidate = findCandidate(arr , size);

        if (isMajority(arr, size, candidate))
            System.out.println(candidate + " is majority candidate");
        else
            System.out.println("No majority candidate found");

    }

    public int findCandidate(int arr[], int size) {

        int count = 1;
        int index_max = 0;

        int i;

        for ( i = 1; i < size; i++) {

            if (arr[index_max] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {

                index_max = i;
                count = 1;
            }
        }

        return arr[index_max];
    }

    //check again ..

    boolean isMajority(int arr[], int size, int candidate) {

        int count = 0;

        for (int i = 0; i < size; i++) {
            if(arr[i] == candidate)
                count++;
        }
        if (count > size/2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
//        int arr [] = { 1, 3, 3, 1, 2 };
        int arr [] = {1, 1,2,3};

        MajorityElement4 m = new MajorityElement4();
        m.printMajorityCandidate(arr, arr.length);
    }

}
