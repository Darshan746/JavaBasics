package com.java.String;

public class PrintEveryLastCharacterInString {

  private static void printEveryLastCharacter(String arr){

    String[]  originalArray = arr.split(" ");
    for(int i=0;i<=originalArray.length-1;i++){
      System.out.println(originalArray[i].charAt(originalArray[i].length()-1));
    }
  }

  public static void main(String[] args) {
    String demoString = "hello darshan how are you";
    printEveryLastCharacter(demoString);
  }
}
