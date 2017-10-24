package com.java.InterviewPrograms;

public class FinalDemo {
	int x = 10;
	public void main()
	{
		
		x=x++;
		//x=x++;
		System.out.println(x);
}
	
	public static void main(String args[]) {
		FinalDemo d = new FinalDemo();
		d.main();
	}

}