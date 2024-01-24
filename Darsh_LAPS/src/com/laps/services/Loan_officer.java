package com.laps.services;

public class Loan_officer extends UserService
{
	LoanApplicationRepo la1=new LoanApplicationRepo();
	ApprovedLoansRepo al1= new ApprovedLoansRepo();
	public void Verifyloan()
	{
		System.out.println("Loan officer verifies the application..");
		la1.select();
		al1.select();
	}

	public void Rejection()
	{
		System.out.println("Loan officer reject the application...");
	}
}
