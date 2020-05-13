package com.java.arrays;

public class PrintMatrixInSpiralForm {

    public void printSpiralMatrix(int m, int n, int mat[][]) {

        //k-> represent the row
        //l-> represent the column
        //m-> no of rows
        // n-> no of columns
        int i , k=0 ,l=0;
        int last_row = m-1;
        int last_col = n-1;


        while (k <= last_row && l <= last_col) {

            //printing the row
            for(i=l; i<=last_col; i++) {
                //row is constant
                printMatrix(k, i, mat);
            }//first row is doe . increment k
            k++;

            //printing last column
            for(i=k; i<=last_row; i++) {
                printMatrix(i, last_col, mat);
            } //printed last column
            last_col --;

            //print last row

            if(k<=last_row){

                for(i= last_col; i<=l; i--){
                    printMatrix(last_row,i, mat);
                }
                last_row --;
            }

            //printing first column
            if(l<=last_col) {
                for(i=last_row; i>=k ; i++) {
                    printMatrix(i, l, mat);
                }
                l++;
            }
        }
    }

    private void printMatrix(int i, int j, int[][] mat)
    {
        System.out.print(mat[i][j]);
    }
}