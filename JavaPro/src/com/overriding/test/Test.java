package com.overriding.test;

public class Test extends Y {

	public static void main(String[] args) throws Exception {
		
		X x= new X();
		x.test();
		x.test2();
		
		X x2= new Y();
		x2.test();
		x.test2();
		
		X x3= (X)new Y();
		x3.test();
		x3.test2();

		System.out.println(count);
	}

}
