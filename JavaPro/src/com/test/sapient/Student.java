package com.test.sapient;

public class Student {
	private String name;
	private int age;
	private String phone_number;

	public Student(String name, int age, String phone_number) {
		super();
		this.name = name;
		this.age = age;
		this.phone_number = phone_number;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

}
