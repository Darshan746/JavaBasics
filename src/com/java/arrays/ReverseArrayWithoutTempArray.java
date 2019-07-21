package com.java.arrays;

import java.util.Arrays;
import java.util.Optional;

public class ReverseArrayWithoutTempArray {


  public static void reverseArray(int[] array){

    int l =0;
    int r = array.length-1;

    while(l<=r){
      int tmp = array[l];
      array[l] = array[r];
      array[r]=tmp;
      l++;
      r--;
    }

    for(int a : array){
      System.out.println(a);
    }
  }

  public static void main(String[] args) {
    int[] a = {5,4,3,2,1};
    reverseArray(a);
String name=null;
    System.out.println( Optional.ofNullable(name).orElseThrow(IllegalAccessError::new));
  }
}
