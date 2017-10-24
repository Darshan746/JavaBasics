package ArrayListImpl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraysToArrayList 
{

	
	
	public static void main(String[] args)
	{
		Integer[] arrayElement ={1,4,3,5,7};
		int[] b ={1,2,3};
		List<Integer> a = Arrays.asList(arrayElement);
		System.out.println(arrayElement.length);
		System.out.println(a.size());
		//Collections.unmodifiableCollection(a);
		//a.add(32);
		
		
		
		 int num1 = 1;
		    int num2 = 1;

		    num1++;
		    num2++;

		    System.out.println(num1 = num2);
		    System.out.println(num2);
		    System.out.println(num2);

}
}
