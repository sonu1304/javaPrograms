package com.company.CTCI;

public class test {

    public static void main(String st[]) {
//        String s = "abcdef";
        String l = "abc";
//        String rem = l.substring(1);
//        System.out.println(rem);
//        System.out.println("len "+ l.length());

        permutation(l);
    }

    public static void permutation(String str) {
        permutation(str, " ");
    }

    public static void permutation(String str, String pre) {
        if(str.length() == 0) {
            System.out.println(pre);
        } else {
            for(int i = 0; i < str.length(); i++) {
             String rem = str.substring(0,i) + str.substring(i+1);
             permutation(rem, pre + str.charAt(i));
            }
        }
    }

}
