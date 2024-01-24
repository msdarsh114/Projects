package com.darsh.pkg1;

import com.darsh.pkg2.Demo;

//Access Specifiers
public class Main_Class2 extends Demo {

	public static void main(String[] args) 
	{
		 System.out.println("program starts...");
		   
		 Demo d1 = new Demo();
		 
		 System.out.println("V1 : "+d1.v1);
		 d1.test1();
		 
		 Main_Class2 m1= new Main_Class2();
		 
		 System.out.println("V1 : "+m1.v2);
		 m1.test2();
		   
		 System.out.println("program ends..");	

	}

}
