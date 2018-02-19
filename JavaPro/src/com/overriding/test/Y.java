package com.overriding.test;

import java.io.IOException;

public class Y extends X {
	public void test() throws Exception{
		count++;
		System.out.println("Y");
	}
	
	/*final void test2(){
		System.out.println("Y");
	}*/
}
