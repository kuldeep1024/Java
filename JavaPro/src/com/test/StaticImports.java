package com.test;
import static java.lang.System.out;
import static java.lang.Math.*;
import static java.lang.Integer.*;

public class StaticImports {

	public static void main(String[] args) {
		out.print("Hello");
		//err.out.println("err");//error  because import static used for only out 
		
		Math.max(23.0, 23.0);
		//min(4, 8); //ambiguous -> Math and Integer
	}

}
