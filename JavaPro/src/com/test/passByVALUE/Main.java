package com.test.passByVALUE;
public class Main{
     public static void main(String[] args){
          Foo f = new Foo("f");
          changeReference(f); // It won't change the reference!
          System.out.println(f.attr);
          
          modifyReference(f); // It will modify the object that the reference variable "f" refers to! 
          System.out.println(f.attr);
          int c=1;
          test(1);
          
          System.out.println(c);
     }
     public static void changeReference(Foo a){
          Foo b = new Foo("b");
          a = b;
     }
     public static void modifyReference(Foo c){
         c.setAttribute("c");
    }
     public static void test(int c){
         c++;
    }
}