package com.company.ProblemSheet.arrays;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {

    //Find the repeating and the missing

    //approach..

    // Traverse the array. While traversing, use the absolute value of every element as an index and make the value at this index as negative to mark it visited.
    //  If something is already marked negative then this is the repeating element.
    //  To find missing, traverse the array again and look for a positive value.

    public static void printMissingAndRepeatingNumber(int arr[]) {

        //Time Complexity: O(n)

        for (int i = 0; i < arr.length; i++) {
            int j = Math.abs(arr[i]);
            if( arr[j-1] > 0 )
                arr[j-1] = -arr[j-1];
            else
                System.out.println("repeating number : "+j);
        }

        System.out.print("missing number : ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                System.out.print( i+1);
                break;
            }
        }
    }

    //using hasmap..

    public static void usinghashmap(int arr[]) {
        /**
         * Approach: 
            This method involves creating a Hashtable with the help of Map. In this, the elements are mapped to their natural index.
            In this process, if an element is mapped twice, then it is the repeating element. 
            And if an element’s mapping is not there, then it is the missing element.
         */

        Map<Integer, Boolean> hashtable = new HashMap<>();

        int len = arr.length;

        for (Integer i : arr) {
            if(hashtable.get(i) == null)
                hashtable.put(i, true);
            else 
                System.out.println("repeating number : " +i);    
        }

        for(int i = 1; i < len; i++) {
            if(hashtable.get(i) == null)
                System.out.println("missing number: "+i);
        }

     }

    public static void main(String[] args) {
        
        int arr[] = {3,1,3};
        int arr2[] = { 4, 3, 6, 2, 1, 1 };
        printMissingAndRepeatingNumber(arr);
        System.out.println(" using map...");
        usinghashmap(arr2);
    }
    
}
