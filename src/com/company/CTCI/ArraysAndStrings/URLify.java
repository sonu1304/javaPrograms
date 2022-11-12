package com.company.CTCI.ArraysAndStrings;

/** URLify: Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string. (Note: If implementing in Java,
 * please use a character array so that you can perform this operation in place.)
 EXAMPLE
 Input: "Mr John Smith ", 13
 Output: "Mr%20John%20Smith"
 */

/** To solve this problem we will start editing the String from the end , as we have extra space buffer at the end.
 * In this algorithm we will use two scan approach, In the first scan, we count the number of spaces.
 * By tripling this number, we can compute how many extra characters we will have in the final string.
 * In the second pass, which is done in reverse order, we actually edit the string. When we see a space,
 * we replace it with %20. If there is no space, then we copy the original character.
 * */

public class URLify {
    public static void replace(String str, int trueLength ) {

        int countSpace = 0, index = 0;

        char [] arr = str.toCharArray();

        //counting the spaces

        for(int i = 0; i < trueLength; i++) {
            if(arr[i] == ' ') countSpace++;
        }

        index = trueLength + countSpace * 2; /** */

        System.out.println("index - > "+index);

        if(trueLength < str.length()) arr[trueLength] = '\0'; //ending array in case of extra spaces

        for (int i = trueLength - 1; i >= 0; i--) {
            if(arr[i] == ' ') {
                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index = index - 3;
            } else {
                System.out.println("index in else starts- > "+index);
                arr[index - 1] = arr[i];
                index--;
                System.out.println("index-- > "+index);
            }
        }

        //printing output array..
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        replace("Mr John Smith    ", 13);
    }
}
