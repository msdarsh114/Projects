package com.jspiders.appone.frontend;

import com.jspiders.appone.services.UserService;

public class UserInterface 
{
	private static UserService us1 = new UserService();
    public static void loginPage()
    {
    	us1.login("virat@rcb.com","9876543210");
    }

}
