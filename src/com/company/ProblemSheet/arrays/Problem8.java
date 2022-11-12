package com.company.ProblemSheet.arrays;

public class Problem8 {

    //Pascal’s Triangle

    public static void main(String[] args) {
        // time O(n^2) and O(1) space
        for (int i = 1; i <= 4; i++) {

            int k = 1;
            for (int j = 1; j <= i; j++) {

                System.out.print(k+" ");
                k = k * (i - j) / j;
            }
            System.out.println();
        }

    }
    
}
