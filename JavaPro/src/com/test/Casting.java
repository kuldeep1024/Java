package com.test;

class SuperClass {
	void displayOne() {
		System.out.println(" Class SuperClass's Method ");
	}
}

class SubClass extends SuperClass {
	void diaplayTwo() {
		System.out.println(" Class SubClass 's Method ");
	}
}

public class Casting {
	public static void main(String args[]) {
	
	SuperClass sp = new SuperClass();
	sp.displayOne(); /*** output : Class SuperClass's Method **/
	
	SubClass sb = new SubClass();
	sb.displayOne(); /*** output : Class SuperClass's Method **/
	sb.diaplayTwo(); /*** output : Class SubClass 's Method **/
	
	//****** Casting ********* // 
	SuperClass sp1 = new SubClass();
	sp1.displayOne(); /*** output : Class SuperClass 's Method **/
	//sp1.diaplayTwo(); /*** There is no possible to access ****/
	
	/*SubClass sb1 = new SuperClass();
	sb1 .displayOne(); *//*** There is no possible to access ****//*
	sb1 .diaplayTwo(); *//*** There is no possible to access ****/
	
	
	}
}
