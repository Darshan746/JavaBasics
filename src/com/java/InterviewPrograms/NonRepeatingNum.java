package com.java.InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonRepeatingNum {

    static int findSingle(int ar[], int ar_size)
    {
      // Do XOR of all elements and return
      int res = ar[0];
      for (int i = 1; i < ar_size; i++)
        res = res ^ ar[i];

      return res;
    }


    public static void main(String[] args) {

    Integer[] array = {1,1,2,2,3,5,5};
    List<Integer> l = new ArrayList<>(Arrays.asList(array));
      List<Integer> l1 = new ArrayList<>(Arrays.asList(array));

      l.removeAll(l1);
System.out.println(l);

    /*System.out.println(findSingle(array,7));
    System.out.println(3^5);*/

  }

}
