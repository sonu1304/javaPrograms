package com.company.ProblemSheet.arrays;

public class Problem1 {


    //Find the duplicate in an array of N integers.

    public static void main(String[] args) {
        

        int [] arr  = {1,2,3,2,1};

        String res = "";

        // O(n^2)
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    res = res+arr[j];
            }
        }

        System.out.println("res---> " +res);


        // O(n)
        for (int i = 0; i < arr.length; i++) {

            int j = Math.abs(arr[i]);

            if(arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.println(j + " ");    

        }

        //O(n) another solution

        int [] arr1  = {1,2,3,2,1};
        System.out.println("mod solution .....");
        for (int i = 0; i < arr1.length; i ++) {
            //For every element in the array increment the arr[i]%n‘th element by n.
            arr1[arr1[i] % arr1.length] = arr1[arr1[i] % arr1.length] + arr1.length;

        }

        //Now traverse the array again and print all those indexes i for which arr[i]/n is greater than 1.
        // Which guarantees that the number n has been added to that index
        for (int i = 0; i < arr1.length; i++) {

            // if(arr1[i] >= arr1.length * 2)
            if((arr1[i] / arr1.length) > 1)
                System.out.println(i +" ");

        }
    }
    
}
