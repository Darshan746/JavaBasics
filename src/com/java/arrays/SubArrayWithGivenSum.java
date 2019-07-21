package com.java.arrays;

public class SubArrayWithGivenSum {


  private static void printSubArray(int[] array, int givenSum) {

    for(int i=0; i<array.length; i++){

      int sum_so_far = 0;

      for(int j=i; j<array.length; j++){

        sum_so_far+=array[j];
        if(sum_so_far == givenSum) {
          printArray(array,i,j);
        }
        if(sum_so_far>givenSum){
          break;
        }
      }
    }
  }

  public static void printArray(int[] array, int startRange, int endRange){
    for(int i=startRange;i<=endRange;i++){
      System.out.print(array[i]+" "+" ");
    }
    System.out.println("\n");


    String s = "hello";
    s= s.substring(2);
    System.out.println(s);


  }

  public static void main(String[] args) {
  int array[] = {3,4,-7,1,3,3,1,-4};
  int sum =7;
  printSubArray(array, sum);

  int[] a = {1,2,3,4};
  System.out.println(a);
int index=1;

  for(int i =index;i<=a.length-2;i++){
    a[i]=a[i+1];
  }

    for(int i =0;i<=a.length-2;i++){
      System.out.print(a.length);
    }


  }




}
