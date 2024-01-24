package com.jspiders.appone;
import com.jspiders.appone.frontend.UserInterface;
import com.jspiders.appone.services.UserService;

public class Mainclass 
{
	private static UserInterface ui1 =new UserInterface();
	static UserService us1=new UserService();
	public static void main(String[] args) 
	{
        System.out.println("program starts..");
        
        //us1.login("virat@rcb.com","9876543210"); 
        //us1.showProfile("virat@rcb.com");
        ui1.loginPage();
        
        
        System.out.println("program ends...");
	}

}
