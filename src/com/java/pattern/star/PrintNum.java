package com.java.pattern.star;

public class PrintNum {

  static void printNumber(int n){
    for(int i=0;i<n;i++){
      int num=1;
        for(int j=0; j<=i; j++){
          System.out.print(num+" ");
          num++;
        }
        System.out.println(" ");
      }
    }

  public static void main(String[] args) {
    printNumber(4);
    String n = null;
    String a ="jh";
    System.out.println(n+a);
  }
}