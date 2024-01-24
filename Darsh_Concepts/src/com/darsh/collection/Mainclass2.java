package com.darsh.collection;

import java.util.ArrayList;

public class Mainclass2 
{

	public static void main(String[] args) 
	{
        System.out.println("program starts...");
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(50);  //inserting
		a1.add(40);
		a1.add(30);
		a1.add(20);
		a1.add(10);
		
		System.out.println(a1.get(0)); //read
		
		int v1=a1.get(0);
		int res =v1/2;   // utilization
		System.out.println(res);
		System.out.println("----------------------------");
		
		for(int index=0;index<a1.size();index++)
		{
			System.out.println(a1.get(index));
		}
		System.out.println("program starts...");

	}

}
