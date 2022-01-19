package com.company.interviewProblems;

/**
 * count the frequency of each char in given string..
 */
public class CharFrequency {

    public static void countFreq(String str) {

        int [] freq = new int[26];

        int n = str.length();

        for(int i = 0; i < n; i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            //checking the frequency if not equal to 0

            int frequency = freq[str.charAt(i) - 'a'] ;

            if (frequency != 0 )  {

                System.out.println(str.charAt(i) + " -> " +  frequency);

                //updating frequency to 0, so that the same character is not printed again.

                freq[str.charAt(i) - 'a'] = 0;

            }
        }

    }

    public static void main(String[] args) {
        countFreq("abccc");

        System.out.println('b' -'a');
    }

}
