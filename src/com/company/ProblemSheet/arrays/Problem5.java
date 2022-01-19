package com.company.ProblemSheet.arrays;

public class Problem5 {

    //Largest Sum Contiguous Subarray - Kadane’s algorithm

    /**
     * Explanation:
     * The simple idea of Kadane’s algorithm is to look for all positive contiguous segments of the array 
     * (max is used for this). And keep track of maximum sum contiguous segment among all positive segments 
     * (max_sum used for this). Each time we get a positive-sum compare it with max_so_far and update max_so_far if it is 
     * greater than max_so_far 
     */


     static int calMaxSubArraySum(int arr[]) {

        int max_num = 0;
        int max_sum = 0;
        
        for (int i = 0; i < arr.length; i++) {

            max_num = max_num + arr[i];

            if (max_num < 0)
                max_num = 0;
            else if (max_sum < max_num)
                max_sum = max_num;
        }

        return max_sum;  

     }

     public static void main(String[] args) {
         
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(" max contigious sum is : "+calMaxSubArraySum(arr));
     }
    
}
