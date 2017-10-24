package equals.hashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCodeDemo {
	
	public static void main(String args[])
	{
		Student s = new Student("Darshan");
		Student s2 = new Student("Darshan");
		Student s3 = new Student("Darshan");
		
		Map<Student, ReportCard> r = new HashMap<>();
		r.put(s, new ReportCard());
		r.put(s2, new ReportCard());
		r.put(s3 ,new ReportCard());
		
		System.out.println(r.size());
	}

}
