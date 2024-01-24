package com.darsh.appone.frontend;

import java.util.Scanner;

import com.darsh.appone.services.UserService;

public class UserInterface 
{
    private Scanner sc =new Scanner(System.in);
    
    private UserService us1 =new UserService();
    public void loginPage()
    {
    	System.out.println("Welcome to AppOne");
       while(true)
       {
		System.out.println("Please choose your option");

		System.out.println("1. Signup");
		System.out.println("2. Login");
		System.out.println("any other key to Exit");

		int optn = sc.nextInt();

		String name;
		String email;
		String mob;

		switch (optn) 
		{
		case 1:
			System.out.println("enter your name");
			name = sc.next();
			System.out.println("enter your email");
			email = sc.next();
			System.out.println("enter your mob");
			mob = sc.next();
			us1.signup(name, email, mob);
			break;

		case 2:
			System.out.println("enter your email");
			email = sc.next();
			System.out.println("enter your password");
			mob = sc.next();
			us1.login(email, mob);
			System.out.println("WELCOME....");
			while(true)
			{
			System.out.println("Press 1 to View Profile");
			System.out.println("press any key to back");
			int ch =sc.nextInt();
			switch(ch)
			{
			case 1: 
				    us1.showProfile(email);
				    while(true)
				    {
				    System.out.println("press 1 for Update Profile");
					System.out.println("press 2 for Delete Account");
					System.out.println("press any key to back");
					int c=sc.nextInt();
					switch(c)
					{
					case 1:  System.out.println("enter your name");
						     String newname=sc.next();
						     System.out.println("enter your email");
				             String newemail=sc.next();
				             System.out.println("enter your mob");
				             String newmob=sc.next();
				             us1.updateProfile(newname,newemail,newmob,email);
				             break;
					case 2:  us1.deleteAccount(email);
			                 break;
			        default : System.exit(0);
			                  break;
					}
				    }
			        
			default : System.exit(0);
			          break;
			}
			}
		
			
		default:
			System.out.println("Thank you for using Appone");
			System.exit(0);
			break;
		}
       }
	}
}
