package com.overriding.test;

import java.io.IOException;

public class X {
	public static int count=0; 
	
	public void test() throws IOException,Exception{
		System.out.println("X");
	}
	
	final void test2(){
		System.out.println("X");
	}
}
