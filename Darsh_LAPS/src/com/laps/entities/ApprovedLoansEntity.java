package com.laps.entities;

public class ApprovedLoansEntity 
{
	String application_id;
	String customername;
	double amountofloangranted;
	double monthlyinstallment;
	int yearstimeperiod;
	double downpayment;
	double rateofinterest;
	double totalamountpayable;

	public ApprovedLoansEntity(String application_id,String customername,double amountofloangranted,
		                        double monthlyinstallment,int yearstimeperiod,double downpayment,
		                        double rateofinterest,double totalamountpayable)
	{
		this.application_id=application_id;
		this.customername=customername;
		this.amountofloangranted=amountofloangranted;
		this.monthlyinstallment=monthlyinstallment;
		this.yearstimeperiod= yearstimeperiod;
		this.downpayment=downpayment;
		this.rateofinterest=rateofinterest;
		this.totalamountpayable=totalamountpayable;
	}
}
