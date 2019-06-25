package com.java.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// flaw of this program is : you will not be having repeated characters because using hasing technique to store the value

//Remove characters from the first string which are present in the second string
public class RemoveCharactersFromFirstString {


  public static void removeCharacter(String s1, String s2){

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();

    Map<Character,Character> map1 = new LinkedHashMap<>();
    Map<Character,Character> map2 = new LinkedHashMap<>();

    for(char ch : c1) {
      map1.put(ch, ch);
    }
    for(char ch : c2) {
      map2.put(ch, ch);
    }

    for(char c : c1){
      if(map2.containsKey(c)){
        map1.remove(c);
      }
    }

    for(Map.Entry<Character,Character> map: map1.entrySet()){
      System.out.print(map.getKey());
    }
  }

  public static void main(String[] args) {
    removeCharacter("herlo", "darshan");
  }

}
