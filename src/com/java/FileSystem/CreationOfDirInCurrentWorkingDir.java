package com.java.FileSystem;

import java.io.File;

public class CreationOfDirInCurrentWorkingDir {
	
	public static void main(String args[]) {
		
		File f = new File("Darshan");
		f.mkdir();
		System.out.println("Directory created successfully");
	}

}
