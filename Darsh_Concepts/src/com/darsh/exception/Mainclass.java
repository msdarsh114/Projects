package com.darsh.exception;

public class Mainclass {

	public static void div(int n, int d) {
		System.out.println("div() starts..");

		System.out.println("INPUTS : " + "n = " + n + " d = " + d);

		int res = 0;

		if (d > 0) 
		{
			res = n / d;
			System.out.println("OUTPUT : " + res);
		} 
		else 
		{
			System.out.println("CANNOT DIVIDE BY ZERO");
		}

		System.out.println("div() ends..");

		return;// stop execution and exit from STACK
	}

	public static void main(String[] args) {
		System.out.println("main() starts..");

		div(10, 0);

		System.out.println("main() ends..");
	}
}
