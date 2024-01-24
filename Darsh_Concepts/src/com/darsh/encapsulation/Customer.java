package com.darsh.encapsulation;

public class Customer 
{
    private int applicationId;
    private String applicantName;
    private String dateOfBirth;
    private String maritalStatus;
    private long mobileNo;
    private int countOfDependents;
    private String emailId;
    
    public Customer()
    {
    	super();
    }

	public Customer(int applicationId, String applicantName, String dateOfBirth, String maritalStatus, long mobileNo,
			        int countOfDependents, String emailId) 
	{
		super();
		this.applicationId = applicationId;
		this.applicantName = applicantName;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.mobileNo = mobileNo;
		this.countOfDependents = countOfDependents;
		this.emailId = emailId;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getCountOfDependents() {
		return countOfDependents;
	}

	public void setCountOfDependents(int countOfDependents) {
		this.countOfDependents = countOfDependents;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
    
    
}
