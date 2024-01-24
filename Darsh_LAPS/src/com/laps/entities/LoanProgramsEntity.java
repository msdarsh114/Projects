package com.laps.entities;

public class LoanProgramsEntity 
{
	String programname;
	String description;
	String type;
	int durationinyears;
	double minloanamount;
	double maxloanamount;
	double rateofinterest;

	public LoanProgramsEntity(String programname,String description,String type,int durationinyears,
	                          double minloanamount,double maxloanamount,double rateofinterest)
	{
		this.programname=programname;
		this.description=description;
		this.type=type;
		this.durationinyears=durationinyears;
		this.minloanamount= minloanamount;
		this.maxloanamount=maxloanamount;
		this.rateofinterest=rateofinterest;
	}
}
