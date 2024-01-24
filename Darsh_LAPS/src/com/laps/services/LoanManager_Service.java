package com.laps.services;

public class LoanManager_Service extends UserService
{
	LoanApplicationRepo la1=new LoanApplicationRepo();
	ApprovedLoansRepo al1= new ApprovedLoansRepo();
	public void Approval()
	{
		System.out.println("Manager Approve the loan application...");
		la1.select();
		al1.select();
	}
}
