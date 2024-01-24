package com.darsh.collection;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

class Descending implements Comparator<Integer>
{
	@Override
	public int compare(Integer i1, Integer i2) 
	{	
		int res = i2 -i1;
		return res;
	}
}

public class Mainclass5 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		
		ts1.add(123);
		ts1.add(144);
		ts1.add(136);
		ts1.add(139);
		ts1.add(123);
		ts1.add(139);
		ts1.add(121);
		ts1.add(178);
		ts1.add(180);
		ts1.add(200);
		
		Iterator<Integer> i1 = ts1.iterator();
		
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
		}
		
		System.out.println("------------------------------------------");
		
        Descending d1 = new Descending();
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(d1);
		ts2.add(6);
		ts2.add(1);//d1.compare(1,6)
		ts2.add(3);
		ts2.add(4);
		ts2.add(2);
		ts2.add(5);
		ts2.add(7);
		ts2.add(3);
		ts2.add(10);

		Iterator<Integer> i2 = ts2.iterator();

		while (i2.hasNext() == true) 
		{
			System.out.println(i2.next());
		}
	}

}
