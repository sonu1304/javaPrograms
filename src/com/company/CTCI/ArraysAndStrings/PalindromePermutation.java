package com.company.CTCI.ArraysAndStrings;


/** Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat'; "atc o eta·; etc.)
 * */

public class PalindromePermutation {

    /** solution 1: */

    static boolean isPermutationOfPalindrome(String phrase) {
        int [] table = charFreqTable(phrase);
        return checkMaxOneOdd(table);
    }

    static boolean checkMaxOneOdd(int [] table ) {
        boolean foundOdd = false;

        for(int count : table) {
            if(count % 2 == 1) {
                if(foundOdd) return false;
                foundOdd = true;
            }
        }
        return true;
    }


    /** map each character to a number, a -> 0, b -> 1, c -> 2 , this is case insensitive, non-character value map to -1*/
    static int getCharNumericValue(Character val) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        if(a <= val && val <= z) return val - a;
        else return -1;

    }

    static int [] charFreqTable(String phrase) {
        int [] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c : phrase.toCharArray()) {
            int x = getCharNumericValue(c);
            if(x!= -1) table[x]++;
        }
        return table;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact Coa"));
    }

}
