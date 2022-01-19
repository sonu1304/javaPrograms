package com.company.interviewProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * count the freq of each element in array
 */
public class CountFrequency {

    /** O(N^2) */
    public static void countFreq(int [] a) {

        boolean visited[] = new boolean[a.length];
        Arrays.fill(visited, false);


        for (int i  = 0; i < a.length; i++) {
            if(visited[i] == true)
                continue;

            int count = 1;
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(a[i] + " = " + count);
        }
    }

    /** using HashMap .... T.M = O(N) and Space Comp = O(N) */

    public static void freqByHashMap(int [] a) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i  = 0 ; i < a.length; i++) {

            if(map.containsKey(a[i]))
                map.put(a[i] , map.get(a[i]) + 1);
            else map.put(a[i], 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " +entry.getValue());
    }

    public static void main(String[] args) {
        int [] a = {1,2,1,2,3};
//        countFreq(a);
        freqByHashMap(a);
    }
}
