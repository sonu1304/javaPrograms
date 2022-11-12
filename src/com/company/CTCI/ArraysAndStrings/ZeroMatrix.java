package com.company.CTCI.ArraysAndStrings;

/**
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0
 * */

public class ZeroMatrix {
    /**Solution 1:
     * 1. create two boolean arrays , for rows and columns
     * 2. store the row and column index with value 0
     * 3. nullify the rows based on the values in rows array
     * 4. nullify columns based on the values on column array
     * */

    static void setMatrixZero(int [][] matrix) {
        /** creating arrays */
        boolean [] rows = new boolean[matrix.length];
        boolean [] cols = new boolean[matrix[0].length];

        /** storing the row and column index with value 0*/

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        /** nullify the rows */
        for(int i = 0; i < matrix.length; i++) {
            if(rows[i]) nullifyRows(matrix, i);
        }

        /** nullify the columns */
        for(int j = 0; j < matrix[0].length; j++) {
            if(cols[j]) nullifyCols(matrix, j);
        }


    }
    /** helper method for nullify rows */
    static void nullifyRows(int[][] matrix, int row) {
        for(int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    /** helper method for nullify rows */
    static void nullifyCols(int[][] matrix, int col) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    /**Solution 2: We can reduce the space to 0(1) by using the first row as a replacement for
     * the row array and the first column as a replacement for the column array. This works as follows:
     * */

    static void setZeros(int [][] matrix) {
        boolean rowHasZero = false;
        boolean colHasZero = false;

        /** checking if first row has 0 */
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[0][j] == 0) {
                rowHasZero = true;
                break;
            }
        }

        /** checking if first col has 0 */
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                colHasZero = true;
                break;
            }
        }

        /** check for 0 in the rest of the matrix */
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        /** nullify the rows based on the values in first column */
        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0) nullifyRows(matrix, i);
        }

        /** nullify the cols based on the values in first row */
        for(int j = 1; j < matrix[0].length; j++){
            if(matrix[0][j] == 0) nullifyRows(matrix, j);
        }

        /** nullify first row */
        if(rowHasZero) nullifyRows(matrix, 0);

        /** nullify first row */
        if(colHasZero) nullifyCols(matrix, 0);

    }
}
