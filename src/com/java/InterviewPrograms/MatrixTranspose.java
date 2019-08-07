package com.java.InterviewPrograms;

public class MatrixTranspose {

  static int[][] arr ={{1,2,3},{4,3,2},{8,4,2}};

  public static void main(String[] args) {
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(arr[i][j]);
        System.out.print(" ");
      }
      System.out.println(" ");
    }

    System.out.println(" ");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(arr[j][i]);
        System.out.print(" ");
      }
      System.out.println(" ");
    }
  }

}
