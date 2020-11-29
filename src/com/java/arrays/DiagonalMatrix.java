package com.java.arrays;

import java.util.Arrays;

public class DiagonalMatrix {


    public static void printInDiagonalWay(int[][]matrix, int m, int n ){
        int i , j;
        //printing all the first row  diagonal
        for(int k=0; k<=m-1; k++) {
                i = k;
                j= 0;
                //all diagonals ends at first row so i>=0
                while (i>=0) {
                    //print the matrix
                    printMatrix(i, j, matrix);
                    i = i-1;
                    j = j+1;
                }
        }

        //all diagonals ends at last col so j<=n-1
        //printing all the remaining diagonal
        for(int k=1; k<=n-1; k++) {
                i = m-1;
                j = k;
                while (j <= n-1) {
                    printMatrix(i, j, matrix);
                    i = i-1;
                    j = j+1;
                }
        }
    }

    static void printMatrix(int i , int j, int[][] array){
        System.out.print(array[i][j]+" ");
    }

    public static void main(String[] args) {

        int[][] array ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       printInDiagonalWay(array, 4,4);

    }

}
