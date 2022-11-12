package com.company.CTCI.ArraysAndStrings;


/** String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
 *  For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than
 *  the original string, your method should return the original string. You can assume the string has only uppercase and
 *  lowercase letters (a - z).
 *  */

/**
 * The runtime is O(p + k2 ), where p is the size of the original string and k is the number of character sequences.
 * For example, if the string is aabccdeeaa, then there are six character sequences. It's slow because string
 * concatenation operates in O(n2 ).
 * We can fix this by using a StringBuilder.
 * */

public class StringCompression {
    /** Solution1: we will traverse the string and keep count of the consecutive letter, if next char is diff from
     * current , then append this to result string */

    static String compressString(String s) {
        int consecutiveCount = 0;
        String compressedString = "";

        for(int i = 0; i < s.length(); i++) {
            consecutiveCount++;

            /** if next char is diff from current, append this to result*/
            if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
                compressedString += "" + s.charAt(i) + consecutiveCount;
                consecutiveCount = 0;
            }
        }

        return compressedString.length() < s.length() ? compressedString : s;
    }

    /**Solution 2: using stringBuilder because string concatenation takes O(n^2) */

    static String compressString2(String s) {
        int consecutiveCount = 0;
        StringBuilder compressedString = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            consecutiveCount++;

            /** if next char is diff from current, append this to result*/
            if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
                compressedString.append(s.charAt(i));
                compressedString.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }
        return compressedString.length() < s.length() ? compressedString.toString() : s;

    }

    /** Solution 3: in this we will calculate the len of compressed String first */

    static String compressString3(String s) {
        int finalLen = compressionCount(s);
        System.out.println(finalLen);
        System.out.println(String.valueOf(2).length());
        if(finalLen >= s.length()) return s;


        StringBuilder compressedString = new StringBuilder(finalLen);

        int consecutiveCount = 0;

        for(int i = 0; i < s.length(); i++) {
            consecutiveCount++;
            if( i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedString.append(s.charAt(i));
                compressedString.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }
        return compressedString.toString();

    }

    static int compressionCount(String s ) {
        int complessedLen = 0;
        int consecutiveCount = 0;

        for(int i = 0; i < s.length(); i++) {
            consecutiveCount++;
            if( i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
                System.out.println("consecutiveCount -> " +consecutiveCount);
                complessedLen += 1 + String.valueOf(consecutiveCount).length();
//                System.out.println(String.valueOf(consecutiveCount).length());

                consecutiveCount = 0;
            }
        }
        return complessedLen;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString2("aabcccccaaa"));
        System.out.println(compressString3("aabcc"));
    }

}
