package com.company.ProblemSheet.arrays;

import java.util.Arrays;
import java.util.Stack;

public class Problem6 {

    //Merge Overlapping Intervals


    /**
     * 1. Sort the intervals based on increasing order of 
            starting time.
       2. Push the first interval on to a stack.
       3. For each interval do the following
            a. If the current interval does not overlap with the stack 
                top, push it.
            b. If the current interval overlaps with stack top and ending
                time of current interval is more than that of stack top, 
                update stack top with the ending  time of current interval.
        4. At the end stack contains the merged intervals. 

     */


     static void mergeOverlapingIntervals(Interval arr[]) {

        //sort the intervals in increasing order..
        Arrays.sort(arr, (i1 , i2) -> i1.start - i2.start); 

        //creating the stack
        Stack<Interval> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++) {

            System.out.println(arr[i].start +"," + arr[i].end);
        }

        //push the first interval to the stack

        stack.push(arr[0]);

        // start from next interval and merge if necessary

        for (int i = 1; i < arr.length; i++) {

            // get the interval from the top of the stack.

            Interval top = stack.peek();

            //if current interval is not overlapping with the stack top then push it to the stack

            if(top.end < arr[i].start) 
                stack.push(arr[i]);
            
            //otherwise update the ending time of the top if the ending time of current interval is more.    
            else if(top.end < arr[i].end) {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }    
        }

        //traverse the stack

        System.out.println("printing stack...");
        while(!stack.isEmpty()) {
            Interval interval = stack.pop();
            System.out.println(interval.start + "," + interval.end);
        }

        
     }

     /**
      * Note that if intervals are sorted by decreasing order of start times,
       we can quickly check if intervals overlap or not by comparing
       the start time of the previous interval with the end time of the current interval.
      */

      static void mergeWithoutExtraSpace(Interval arr[]) {

        //sorting the intervals in decreasing order...
        Arrays.sort(arr, (i1, i2) -> i2.start - i1.start);

        // printing
        System.out.println("printing decreasing order intervals..");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].start +","+arr[i].end);
        }

        int index = 0;
        
        for (int i = 1; i < arr.length; i++) {

            if(arr[index].end >= arr[i].start) {
                arr[index].end = Math.max(arr[index].end, arr[i].end);
                arr[index].start = Math.min(arr[index].start, arr[i].start);
            }

            else {
                index++;
                arr[index] = arr[i];
            }
        }


        System.out.println("merged intervals are : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].start + ","+ arr[i].end);
        }

      }

     public static void main(String[] args) {

        //Time complexity of the method is O(nLogn) which is for sorting. Once the array of intervals is sorted, merging takes linear time.
         
        Interval intervalArr [] = new Interval[4];
        intervalArr[0] = new Interval(6, 8);
        intervalArr[1] = new Interval(1,9); 
        intervalArr[2] = new Interval(2,4); 
        intervalArr[3] = new Interval(4,7); 

        // mergeOverlapingIntervals(intervalArr);

        mergeWithoutExtraSpace(intervalArr);

     }
}

class Interval {

    int start,end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
 }
