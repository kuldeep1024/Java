package com.test.tricky2;

import com.test.tricky.Frog;

public class TadPole extends Frog {
	public static void main(String[] args) {
		TadPole t = new TadPole();
		t.ribbit();
		//t.jump();//default access i.e package private so only accessible from same package
		
		Frog f = new TadPole();
		//f.ribbit();//from same package or from subclasses
		//f.jump();
	}
}
