package com.java.arrays;

import java.util.Arrays;

public class DiagonalMatrix {


    public void printInDiagonalWay(int[][]matrix, int m, int  n ){
        int i , j;
        //printing all the first row  diagonal
        for(int k=0; k<=m-1; k++) {
                i = k;
                j= 0;

                //all diagonals ends at first row so i>=0
                while (i>=0) {
                    //print the matrix

                    i = i-1;
                    j = j+1;
                    //print(matrix[i][j])
                }
        }

        //all diagonals ends at last col so j<=n-1
        //printing all the remaining diagonal
        for(int k=1; k<=n-1; k++) {
                i = m-1;
                j = k;
                while (j <= n-1) {
                    //print(matrix[i][j])
                    i = i-1;
                    j = j+1;
                }
        }
    }

}
