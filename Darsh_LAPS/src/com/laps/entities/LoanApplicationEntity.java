package com.laps.entities;

public class LoanApplicationEntity 
{
	int application_id;
	String application_date;
	String loan_program;
	double amount_of_loan;
	String address_of_property;
	double annual_family_income;
	String documentsproofs_available;
	String gaurantee_cover;
	double marketvalue_of_guaranteecover;
	String status;
	String dateofinterview;

	public LoanApplicationEntity(int application_id,String application_date,String loan_program,
	                            double amount_of_loan,String address_of_property,double annual_family_income,
	                            String documentsproofs_available,String gaurantee_cover,
	                            double marketvalue_of_guaranteecover,String status,String dateofinterview)
	{
	 this.application_id=application_id;
	 this.application_date=application_date;
	 this.loan_program=loan_program;
	 this.amount_of_loan=amount_of_loan;
	 this.address_of_property=address_of_property;
	 this.annual_family_income=annual_family_income;
	 this.documentsproofs_available=documentsproofs_available;
	 this.gaurantee_cover=gaurantee_cover;
	 this.marketvalue_of_guaranteecover=marketvalue_of_guaranteecover;
	 this.status=status;
	 this.dateofinterview=dateofinterview;
	}
}
