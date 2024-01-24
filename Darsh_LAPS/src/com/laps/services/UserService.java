package com.laps.services;

public abstract class UserService 
{
	CustomerDetailsEntity ud1=null; // global non static reference variable of user entity class

    boolean islogin=false;//global non static variable and intialized to default value

    CustomerDetailsRepo cd1= new CustomerDetailsRepo();
    
    //Service-method signup
	public void SignUp(String entname,String entemailid,long entmob,String entpass, String entdob,char entgender,String entrole)
	{
		//store data to DB
	    ud1 = new CustomerDetailsEntity(entname,entemailid,entmob,entpass,entdob,entgender,entrole);
	    ud1.addrs= new AddressEntity(123,"street1","area1","city1",852963,"state1");
	    cd1.insert();  //call insert method of UserRepo implementation class
	}

	//Service-method signup   ---with missing mobile number
	public void SignUp(String entname,String entemailid,String entpass, String entdob,char entgender,String entrole)
	{
		//store data to DB
	    ud1 = new CustomerDetailsEntity(entname,entemailid,entpass,entdob,entgender,entrole);
	    ud1.addrs= new AddressEntity(123,"street1","area1","city1",852963,"state1");
	    cd1.insert();  //call insert method of UserRepo implementation class
	}

    //Service-method signup   ---with missing Email Id
	public void SignUp(String entname,long entmob,String entpass, String entdob,char entgender,String entrole)
	{
		//store data to DB
	    ud1 = new CustomerDetailsEntity(entname,entmob,entpass,entdob,entgender,entrole);
	    ud1.addrs= new AddressEntity(123,"street1","area1","city1",852963,"state1");
	    cd1.insert();  //call insert method of UserRepo implementation class
	}

    //service method Log in
	public void LogIn(String username,String password)
	{
		if(ud1!=null)   //to check the sign up process is completed
		{
		    //read the data from database
		    if(username==ud1.emailid && password==ud1.pass)
		    {
			    islogin=true;
			    System.out.println("Logged in Succesfully...");
		    }
		    else
		    {
			    System.out.println("error..!!! the username or password are incorrect..");
		    }
		}
		else
		{
			System.out.println("please complete the signup process....");
		}
	}

	//service method Log in  ---using Mobile number 
	public void LogIn(long mob,String password)
	{
		if(ud1!=null)   //to check the sign up process is completed
		{
		    //read the data from database
		    if(mob==ud1.mob && password==ud1.pass)
		    {
			    islogin=true;
			    System.out.println("Logged in Succesfully...");
		    }
		    else
		    {
			    System.out.println("error..!!! the Mobile number or password are incorrect..");
		    }
		}
		else
		{
			System.out.println("please complete the signup process....");
		}
	}

    //service-method view profile
	public void ViewProfile()
	{
			//to check log in inputs
			if (islogin==true) 
			{
			    //utilize object of user entity class
		        System.out.println("--------------User Profile-------------");
                System.out.println("Name :"+ud1.name);
                System.out.println("Email :"+ud1.emailid);
                System.out.println("Mobile :"+ud1.mob);
                System.out.println("Date of Birth :"+ud1.dob);
                System.out.println("Gender :"+ud1.gender);
                viewaddress();
		        System.out.println("--------------User Profile-------------");
            }
            else
            {
            	System.out.println("please complete LogIn process...");
            }
	} 

	public void viewaddress()
	{
		System.out.println("---------Address----------");
        System.out.println("House No :"+ud1.addrs.houseno);
        System.out.println("street   :"+ud1.addrs.street);
        System.out.println("Area     :"+ud1.addrs.area);
        System.out.println("City     :"+ud1.addrs.city);
        System.out.println("Pincode  :"+ud1.addrs.pincode);
        System.out.println("State    :"+ud1.addrs.state);
		System.out.println("---------Address----------");
	}
}
