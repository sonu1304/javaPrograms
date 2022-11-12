package com.company.dsaOne;

public class PowerSet {

    public static void powerSet(String s, int i, String curr) {
        if(i == s.length()) {
            System.out.println(curr);
            return;
        }

        //solving the left side
        powerSet(s,i+1, curr+ s.charAt(i));

        //right side
        powerSet(s, i+1, curr);

    }

    public static void main(String[] args) {
        powerSet("abc", 0, " ");
    }
}
