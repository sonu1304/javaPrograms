package com.company.DP;

public class PascalTriangle {

    public static void printPascal(int rows) {

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j <= i; j++)
                if(j == 0 || j == i)
                    System.out.print(1+" ");
                else
                    System.out.print((j - 1) + j);
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        printPascal(5);

        int dp[] = new int[5];

        System.out.println(dp[5]);

    }
}
