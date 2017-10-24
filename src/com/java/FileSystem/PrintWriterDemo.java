package com.java.FileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String args[]) throws FileNotFoundException {
		File f = new File("abc.txt") ;
		PrintWriter pw = new PrintWriter(f);
		//pw.write(100);
		pw.println("darshan");
		pw.close();
		
	}

}
