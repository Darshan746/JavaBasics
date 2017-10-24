package com.java.FileSystem;

import java.io.File;

public class FileAndDirectoryCount {

	public static void main(String args[]){
		File f = new File("G:\\Eschool\\appData\\Admin\\2");
		String[] filesNames = f.list();
		int fileCount =0;
		int directoryCount=0;
		
		for(String nameOfFile :filesNames) {
			
			File f1 = new File(f,nameOfFile);
			if(f1.isFile()) {
				
				fileCount++;
				System.out.println(nameOfFile);
			}
			
			if(f1.isDirectory()) {
				directoryCount++;
				System.out.println(nameOfFile);
			}
		}
		
		System.out.println("File Count:"+fileCount);
		System.out.println("Directory Count:"+directoryCount);
	}

}
