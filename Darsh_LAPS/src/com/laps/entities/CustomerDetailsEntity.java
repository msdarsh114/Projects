package com.laps.entities;

public class CustomerDetailsEntity 
{
	//Global non-static variable
		String name;
		String emailid;
		long mob;
		String pass;
		String dob;
	    char gender;
	    String role;
	    AddressEntity addrs;

	    //constructor-- To intialize the DATA MEMBERS of the class
	    public CustomerDetailsEntity(String name,String emailid,long mob,String pass, String dob,char gender,String role)
	    {
	    	//using "this" keyword to intializing the values to the global variables 
	    	//if only the local and global variables having the same name
	    	this.name=name;
	    	this.emailid=emailid;
	    	this.mob=mob;
	    	this.pass=pass;
	    	this.dob=dob;
	    	this.gender=gender;
	    	this.role=role;

	    }

	    public CustomerDetailsEntity(String name,String emailid,String pass, String dob,char gender,String role)
	    {
	    	//using "this" keyword to intializing the values to the global variables 
	    	//if only the local and global variables having the same name
	    	this.name=name;
	    	this.emailid=emailid;
	    	this.pass=pass;
	    	this.dob=dob;
	    	this.gender=gender;
	    	this.role=role;

	    }

	    public CustomerDetailsEntity(String name,long mob,String pass, String dob,char gender,String role)
	    {
	    	//using "this" keyword to intializing the values to the global variables 
	    	//if only the local and global variables having the same name
	    	this.name=name;
	    	this.mob=mob;
	    	this.pass=pass;
	    	this.dob=dob;
	    	this.gender=gender;
	    	this.role=role;

	    }
}
