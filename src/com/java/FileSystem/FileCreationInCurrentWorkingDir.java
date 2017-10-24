package com.java.FileSystem;

import java.io.File;
import java.io.IOException;

public class FileCreationInCurrentWorkingDir {
	
	public static void main(String args[]) throws IOException {
		// create java file object to represent a resource abc.xml
		File f = new File("abc.xml"); 
		
		//create a new file named abc.xml
		f.createNewFile();  
		
		System.out.println("File Created Successfully");
	}

}
