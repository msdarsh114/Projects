package com.darsh.exception;

public class Mainclass2 {

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
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
		}
		catch(ArrayIndexOutOfBoundsException arib)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}

		System.out.println("test() ends..");

		return;// stop execution and exit from STACK
	}

	public static void main(String[] args) {
		System.out.println("main() starts..");

		test(10, 2);

		System.out.println("main() ends..");
	}
}
