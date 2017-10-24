package copies;

import java.io.Serializable;

public class CloneDemo implements Cloneable
{
	
	public int i,j;
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String args[]) throws CloneNotSupportedException
	{
		CloneDemo d = new CloneDemo();
		d.i=21;
		d.j=32;
		CloneDemo c = (CloneDemo) d.clone();
		c.i=56;
		c.j=43;
		System.out.println("Value of the d Object"+d.i+" "+d.j);
		System.out.println("After changing the value of the i and j in OBJ C");
		
		System.out.println("Value of the d Object"+c.i+" "+c.j);
		System.out.println("Value of the d Object"+d.i+" "+d.j);
		
	}
}
