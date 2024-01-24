package com.laps.services;

public class Admin_Service extends UserService
{
	LoanProgramsRepo lp1=new LoanProgramsRepo();
	public void Postloanprogram()
	{
		System.out.println("Admin posting the loan...");
		lp1.insert();
		lp1.select();
		lp1.update();
		lp1.delete();
	}
}
