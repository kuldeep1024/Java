package com.test;

public class MarkList {
	int num;

	static Integer i=0;
	
	public static void graceMarks(MarkList obj4) {
		obj4.num += 10;
		System.out.println(obj4.num);
	}

	public static void main(String[] args) throws Exception {
		MarkList obj1 = new MarkList();
		MarkList obj2 = obj1;
		MarkList obj3 = new MarkList();
		obj2.num = 60;
		graceMarks(obj2);
		System.out.println(i.compareTo(0));
		
		//System.out.println(5/0);
		throw new Exception();
		
		
		
	}
}
