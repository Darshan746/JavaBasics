package com.java.FileSystem;

import java.io.File;
import java.io.IOException;

public class CreationOfFileInSomeOtherLocation {
	
	public static void main(String args[]) throws IOException {
		
		File f = new File("G:\\Darshan");
		f.mkdir();
		System.out.println("Directory Got created successfully");
		
		//File f1 = new File(f, "abc.xml"); 
		
		//OR
		File f1  = new File("G:\\Darshan","demo.xml");
		
		
		f1.createNewFile();
		System.out.println("File Got created");
	}

}
