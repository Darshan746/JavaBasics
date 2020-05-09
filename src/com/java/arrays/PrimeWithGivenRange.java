package com.java.arrays;

public class PrimeWithGivenRange {


    private static  void withGivenRange(int range) {
    int i=0;
    int num =0;

   System.out.println("Prime no are");
    for( i =1; i<=range; i++ ) {
        int count = 0;
        for(num = i; num>=1 ; num--) {
            if(i%num==0){
                count++;
            }
        }
        if(count == 2){
            System.out.print(i+" ");
        }

    }
    }

    public static void main(String[] args) {
        withGivenRange(10);
    }
}
