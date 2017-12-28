package com.pyramid.test;

import java.util.LinkedList;

/**
 * @author	-	Kuldeep Kunwar
 * Date		-	Monday 4 December 2017
 *
 */
public class Pyramid1 {

	/**
	 * @param args
	 * Main Method
	 */
	public static void main(String[] args) {
/*		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("A");
		ll.add("D");
		ll.add("G");
		ll.add("B");
		ll.add("T");

for(int i=0;i<10;){
	i=i++;
	System.out.println("hello");
}
		

"a".equals("A");
		
		
		ll.get(3);
		System.out.println(ll.size());
		System.out.println(ll.getLast());
		
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
