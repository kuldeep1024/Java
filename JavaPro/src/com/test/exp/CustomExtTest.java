package com.test.exp;

public class CustomExtTest {

	public static void main(String[] args) {
		try {
			throw new CustomExp("Exxxxxxxx");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
