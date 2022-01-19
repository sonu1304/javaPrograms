package com.company.stack;

import java.io.IOException;
import java.util.HashSet;
import java.util.PriorityQueue;

public class test {

 public static void minCost (int a[]) {

     int n = a.length;
     int i = 1;

     int cost = 1000000;

     while ( n > 0) {

         int total = a[i] + a[i-1];
         a[0] = a[n-1];
         a[n-i-1] = total;
         n--;
         i++;
         cost = Math.min(cost, total);

     }

     System.out.println(cost);
 }



    public static void main(String[] args) {


     int [] a = {4,6,8};

     minCost(a);

    }
}


