package copies;

public class DeepCopy {
	
	private int i,j;
	
	public static void main(String args[])
	{
		DeepCopy a = new DeepCopy();
		a.i=10;
		a.j=12;
		DeepCopy b = new DeepCopy();
		b.i=a.i;
		b.j=a.j;
		b.j=13;
		System.out.println(b.j+" "+a.j);
		
		
		
	}

}
