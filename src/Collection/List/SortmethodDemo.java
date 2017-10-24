package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortmethodDemo
{
	
	private int age;
	private String name;
	
    public SortmethodDemo(int age, String name) 
    {
		super();
		this.age = age;
		this.name = name;
	}


	public static void main(String args[])
    {
		SortmethodDemo d = new SortmethodDemo(12, "darshan");
		SortmethodDemo e = new SortmethodDemo(23, "ramamn");
		
		List<SortmethodDemo> f = new ArrayList<>();
		f.add(d);
		f.add(e);
		System.out.println("Before sorting the collection ele");
		for(SortmethodDemo demo : f)
		{
			System.out.println(demo.name+" "+demo.age);
		}
		System.out.println("After sorting the collection element");
    }
}
