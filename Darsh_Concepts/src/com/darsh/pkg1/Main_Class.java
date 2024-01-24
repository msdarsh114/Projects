package com.darsh.pkg1;

import com.darsh.pkg2.Sample;


public class Main_Class 
{
   public static void main(String[] args)
   {
	   System.out.println("program starts...");
	   
	   Sample.test();
	   Sample s1 = new Sample();
	   s1.display();
	   
	   com.darsh.pkg3.Sample.test();
	   
	   com.darsh.pkg3.Sample s2 = new com.darsh.pkg3.Sample();
	   
	   s2.display();
	   
	   System.out.println("program ends..");
   }
}
