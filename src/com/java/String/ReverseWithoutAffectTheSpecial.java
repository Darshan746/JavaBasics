package com.java.String;


public class ReverseWithoutAffectTheSpecial {

  public static void reverseString(char specialCharStr[]) {

    int l = 0, r = specialCharStr.length - 1;
    while (l < r) {
      if (!Character.isAlphabetic(specialCharStr[l])) {
        l++;
      } else if (!Character.isAlphabetic(specialCharStr[r])) {
        r--;
      } else {
        char tmp = specialCharStr[l];
        specialCharStr[l] = specialCharStr[r];
        specialCharStr[r] = tmp;
        l++;
        r--;

      }
    }

    for (char ch : specialCharStr) {
      System.out.print(ch);
    }

  }

  public static void main(String[] args) {
    String str = "h#jk(";
    char[] charArray = str.toCharArray();
    reverseString(charArray);
  }

}
