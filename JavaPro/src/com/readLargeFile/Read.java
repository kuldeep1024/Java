package com.readLargeFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) throws IOException {
		long start = System.nanoTime();
		byte[] bytes = new byte[32*1024];
		String fileName="E:\\spring.log";
		FileInputStream fis = new FileInputStream(fileName);
		int len;
		while((len = fis.read(bytes)) > 0);
		long time = System.nanoTime() - start;
		System.out.printf("Took %.3f seconds%n", time/1e9);
		
		
		
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		//fr.
		
		//Scanner sc= new Scanner
	}

}
