package com.company.CTCI.ArraysAndStrings;

/**  Given two strings, write a method to decide if one is a permutation of another */

public class CheckStringPermutation {

    /** Method 1: sorting the both strings */

    static String sort(String str) {
        char [] string = str.toCharArray();
        java.util.Arrays.sort(string);
        return new String(string);
    }

    static boolean checkPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        return sort(str1).equals(sort(str2));
    }

    /** Method 2: check if the two strings have the identical character counts.
     * we can use the definition of Permutations - two words with the same character counts.
     * this method is more optimal
     * */


    static boolean permutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int [] letters = new int[128];

        char [] charArr = s1.toCharArray();

        /** counting how many times each character appears.*/

        for(char c : charArr) letters[c]++;

        /** comparing */

        for (int i = 0; i < s2.length(); i++) {
            int c = s2.charAt(i); //automatically get converted char value to int , like 'a' = 97
            letters[c]--;
            if(letters[c] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("god","dog"));
        System.out.println(permutation("ged","dog"));
    }

}
