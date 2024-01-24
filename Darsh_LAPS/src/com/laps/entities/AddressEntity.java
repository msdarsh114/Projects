package com.laps.entities;

public class AddressEntity 
{
	int houseno;
	String street;
	String area;
	String city;
	int pincode;
	String state;
    
    //constructor
	public AddressEntity(int houseno,String street,	String area,String city,int pincode,String state)
	{
	    this.houseno=houseno;
	    this.street=street;
	    this.area=area;
	    this.city=city;
	    this.pincode=pincode;
	    this.state=state;
	}
}
