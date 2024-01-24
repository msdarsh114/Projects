package com.darsh.collection;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Mainclass4 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> h1 = new LinkedHashSet<String>();
		LinkedHashSet<Integer> h2 = new LinkedHashSet<Integer>();
		
		h1.add("Darsh");
		h2.add(25);
		h2.add(50);
		h2.add(75);
		h2.add(25);
		h2.add(100);
		h1.add("Pradeep");
		h1.add("Sunil");
		h1.add(null);
		h1.add("Darsh");
		h1.add("Bhanu");
		h1.add(null);
		h1.add("Akshay");
		
		for(String str : h1)
		{
			System.out.println(str);
		}
		System.out.println("--------------------------------------------");
		Iterator<String> it1 = h1.iterator(); // return the control on the iterator
		{
			while(it1.hasNext()==true)  // return true if the next data is present otherwise return false 
			{
				System.out.println(it1.next()); // read the data and move the cursor to next data
			}
		}
		
		System.out.println("--------------------------------------------");
		
		for(Integer i1 : h2)
		{
			System.out.println(i1);
		}

	}

}
