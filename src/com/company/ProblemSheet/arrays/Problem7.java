package com.company.ProblemSheet.arrays;

public class Problem7 {

    //Set Matrix Zeros

    // time complexcity = 2*(m*n)
    // space complexcity = O(1)

    static void setMatrixZero(int matrix[][]) {

        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if(matrix[i][0] == 0) col0 = 0;
            for(int j = 1; j < cols; j++) 
                if(matrix[i][j] == 0) matrix[i][0] = matrix[0][j] = 0;
        }

        // backtrack the matrix..
        for (int i = rows - 1; i >= 0; i--) {
            for(int j = cols - 1; j >= 1; j--)
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if(col0 == 0) matrix[i][0] = 0;        
        }

        //printing the result 
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix [][] = {{1,1,1}, {1,0,1}, {1,1,1}};
        setMatrixZero(matrix);
    }
    
}
