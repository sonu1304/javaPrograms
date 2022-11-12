package com.company.test;

public class NQProblem {

    boolean isSafe(int board [][] , int row, int col) {

        int i,j;

        //check left side

        for (i = 0; i < col; i++) {
            if(board[row][i] == 1 )
                return false;
        }

        //check diagonal upper left

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if(board[i][j] == 1)
                return false;

        // check diagonal lower left

        for(i = row, j = col; j >= 0 && i < 4; i++,j--)
            if(board[i][j] == 1)
                return false;

        return true;

    }

    boolean solveNQ ( int board[][] , int col) {

        if ( col >= 4)
            return true;

        for (int i = 0; i < 4; i++) {

            if(isSafe(board, i, col)) {
                board[i][col] = 1;

                if(solveNQ(board, col+1))
                    return true;

                //backtrack

                board[i][col] = 0;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int board[] [] = {
                            {0,0,0,0},
                            {0,0,0,0},
                            {0,0,0,0},
                            {0,0,0,0},

        };

        NQProblem n = new NQProblem();
        n.solveNQ(board, 0);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
