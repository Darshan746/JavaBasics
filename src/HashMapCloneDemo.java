import java.util.HashMap;

public class HashMapCloneDemo {

	
	public static void main(String args[])
	{
		HashMap<String, Integer> a= new HashMap<>();
		a.put("Pur", 21);
		a.put("dsfs", 23);
		
		HashMap<String, Integer> b =null;
		b = (HashMap<String, Integer>) a.clone();
		System.out.println(b);
		
		b.put("Pur", 24);
		System.out.println("I am printing A "+a);
		System.out.println("I am printing B"+b);
		b.put("raman`", 21);
		System.out.println(b);
	}
}
