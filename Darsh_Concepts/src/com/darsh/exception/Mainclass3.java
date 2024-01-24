package com.darsh.exception;

public class Mainclass3 {

	public static void test(int n, int d) {
		System.out.println("test() starts..");

		System.out.println("INPUTS : " + "n = " + n + " d = " + d);

		int res = 0;
		int[] a= {500,250,154,254};

		try 
		{
			res = n / d;
			System.out.println("OUTPUT : " +a[res]);
		} 
		catch(Exception exp)
		{
			exp.printStackTrace();
		}

		System.out.println("test() ends..");

		return;// stop execution and exit from STACK
	}

	public static void main(String[] args) {
		System.out.println("main() starts..");

		test(10, 0);

		System.out.println("main() ends..");
	}
}
