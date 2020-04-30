package com.java.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphabets {


  public static void removeNonAlphabetic(String str){
     int j=0;
    char[] s = str.toCharArray();
    for(int i=0;i<=s.length-1;i++){
      if ((s[i] >= 'A' && s[i] <= 'Z')
          || (s[i] >= 'a' && s[i] <= 'z')) {

        s[j]=s[i];
        j++;
      }

    }
    System.out.print(String.valueOf(s).substring(0, j));
  }

  public static void main(String[] args) {
  //  removeNonAlphabetic("12gg^");
    Pattern pattern = Pattern.compile("[\\w\\d\\s]");
    Matcher matcher = pattern.matcher("4gg92^$!@");
    while(matcher.find()){
      System.out.print(matcher.group());

    }
  }
}
