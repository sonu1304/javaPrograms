package com.company.CTCI.ArraysAndStrings;

/**
 * implement an algo to determine if a String has all the unique characters. Don't use any additional data structure.
 *
 * time complexity - O(n), n is size of the string.
 */

public class IsUnique {

    public static void main(String[] args) {
//        System.out.println(isUniqueChars("abc"));
        System.out.println("shift - " + (1<<3));
        System.out.println(isUnique("abc99"));
    }

   // with extra space
  public static boolean isUniqueChars(String str) {

        if(str.length() > 128) return false;

        //creating the boolean array

      boolean [] char_set = new boolean[128];

      for(int i = 0; i < str.length(); i++) {
          /** extracting ascii values */
          int val = str.charAt(i) ;
          System.out.println(str.charAt((i)) + " -> " + val);
          if(char_set[val]) return false;
          char_set[val] = true;
      }
      return true;
    }

    //without extra space
    public static boolean isUnique(String str) {
        if(str.length() > 128) return false;

        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println("val -> "+val);
            System.out.println("1 << val ) -> " + (1 << val));
            System.out.println("and with checker -> ");
            System.out.println((checker & (1 << val)));
            if((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
            System.out.println(str.charAt(i) + " -> " + checker);

        }
        return true;

    }

}
