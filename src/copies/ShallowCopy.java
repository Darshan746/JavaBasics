package copies;

public class ShallowCopy 
{

	private   int c ,f;
	public static void main(String args[])
	{
		ShallowCopy a = new  ShallowCopy();
		a.c=10;
		a.f=23;
		ShallowCopy b = (ShallowCopy) a;
		b.c=22;
		a.f = 43;
		System.out.println("Printing the a object"+a);
		System.out.println("printing b object"+b);
		
	}
	@Override
	public String toString() {
		return "ShallowCopy [c=" + c + ", f=" + f + "]";
	}
}
