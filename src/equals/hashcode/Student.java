package equals.hashcode;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public  boolean equals(Object o)
	{
		System.out.println("Inside equals");
		Student s = (Student)o;
		if(this.name == s.name)
		{
		return true;
		}
		else 
			return false;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("Inside HAshCode method");
		return name.hashCode();
	}

}
