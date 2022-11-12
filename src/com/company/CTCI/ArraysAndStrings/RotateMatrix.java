package com.company.CTCI.ArraysAndStrings;

/** Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 * */

/**
 * This algorithm is O( N2 ), which is the best we can do since any algorithm must touch all N2 elements.
 * */

public class RotateMatrix {
    static boolean rotate(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length != matrix.length) return false;

        int n = matrix.length;

        for(int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;

                //saving top
                int top = matrix[first][i];

                //moving left to top
                matrix[first][i] = matrix[last-offset][first];

                //moving bottom to left
                matrix[last-offset][first] = matrix[last][last-offset];

                //moving right to bottom
                matrix[last][last-offset] = matrix[i][last];

                //moving top to right
                matrix[i][last] = top;
            }
        }
        return true;
    }
}
