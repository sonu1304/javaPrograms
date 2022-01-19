package com.company.ProblemSheet.queue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class SlidingWindowMax {

    /**
     *Method 1 : Bruteforce
     * this will take O(NK) time complexity
     * Space Complexity - O(1)
     */

    public int[] maxSlidingWindowBruteForce(int [] nums , int k) {
        int n = nums.length;
        int [] res = new int[n - 2];
        int index = 0;
        for(int i = 0; i <= n - k; i++) {
            int j = i;
            int window = k;
            int  currMax = 0;
            while( window > 0) {
                currMax = Math.max(currMax,nums[j++]);
                window--;
            }
            res[index++] = currMax;
        }

        return res;
    }

    /**
     *
     * this approach is the best solution
     * time comp - O(n)
     * space - O(k)
     */

    public int[] maxSlidingWindow(int [] nums, int k) {
        int n = nums.length;
        // checking if given array is empty
        if (n <= 1) return nums;

        int [] res = new int[n-k+1];
        int res_in = 0;

        Deque<Integer> dq = new LinkedList();

        for (int i = 0; i < n; i++) {
            //checking if the current index is out of the range of
            //the window size

            if(!dq.isEmpty() && dq.peek() < i - k + 1)
                dq.poll();

            //removing the items from the queue which are smaller
            //than the current index's item

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            //pushing the current index to the quequ
            dq.offer(i);

            // put the item in the res array if,
            // current index is greater than or equal to the k
            if( i >= k-1)
                res[res_in++] = nums[dq.peek()];
        }

        return res;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        SlidingWindowMax slide = new SlidingWindowMax();
        int[] res = slide.maxSlidingWindowBruteForce(nums, 3);
        for(int item : res)
            System.out.print(item+" ");


    }
}
