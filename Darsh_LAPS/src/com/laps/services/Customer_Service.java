package com.laps.services;

public class Customer_Service extends UserService 
{
	LoanProgramsRepo lp1=new LoanProgramsRepo();
	LoanApplicationRepo la1=new LoanApplicationRepo(); 
	public void Apply_loan()
	{
		System.out.println("customer applaid for loan...");
		lp1.select();
		la1.insert();
        la1.select();
        la1.update();
        la1.delete();
	}
}
