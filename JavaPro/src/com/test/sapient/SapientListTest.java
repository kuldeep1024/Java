package com.test.sapient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SapientListTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		

		//suppose column headers are Name,Age,Phone Number
		Student s1 = new Student("Kuldeep", 28, "9568454545");
		Student s2 = new Student("Ram", 30, "66666666666666666");
		Student s3 = new Student("Kuldeep", 25, "999999999");

		list.add(s1);
		list.add(s2);
		list.add(s3);

		//Name,age:SUM|age:AVG
		
		test(list, "Name", "age:SUM|age:AVG");
		
		/*String s="";
		s+="hello";
		System.out.println(s=="hello");*/
		
		//Name, avg, sum
		//Kuldeep,26.5,53
		//Ram,30,30
		
		
		
	}

	public static void test(List<Student> list,String clName,String calcType){
		Set<String> set= new HashSet<>();
		if(clName.equalsIgnoreCase("name")){
			for(Student s:list){
				set.add(s.getName());
			}
		}
		
		
		
	}
}
