package com.java.String;

public class RemoveWhiteSpace {



  private static  String removeWiteSpace(String whiteSpaceStr){
    return  whiteSpaceStr.trim();//.replaceAll("\\t", "");
  }

  public static void main(String[] args) {
    System.out.print(removeWiteSpace(" Hello darshan  how are you"));
  }
}
