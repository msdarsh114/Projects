package com.laps.front_end;

public class Phase_five 
{
	//Global-Static reference object
		//static UserService pro = new UserService(); 


		// public static void SignUpPage()
		// {
		// 	//calling sign-up method in the user-service class
		// 	pro.SignUp("Darsh","darshanms114@gmail.com",9535688426l,"Darsh@114","13-may-1999",'M');
		// }

		// public static void ProfilePage()
		// {
		// 	//calling view-profile method in the user-service class
	 //       pro.ViewProfile();
		// }

		// public static void LogInPage()
		// {
		// 	pro.LogIn("darshanms114@gmail.com","Darsh@114");
		// }

		public static void Customer_Service_Page( )
		{
			Service_Manager sm1=new Service_Manager();
			UserService us1=sm1.getService("CUST");
			us1.SignUp("Darsh","darshanms114@gmail.com",9535688426l,"Darsh@114","13-may-1999",'M',"CUST");

			// Customer_Service cust=new Customer_Service();
			// //calling sign-up method in the user-service class
		    //  cust.SignUp("Darsh","darshanms114@gmail.com",9535688426l,"Darsh@114","13-may-1999",'M',"CUST");

		    // cust.LogIn("darshanms114@gmail.com","Darsh@114");

		    // cust.ViewProfile();

			// cust.Apply_loan();
			Repository repo=null;
			Repository_manager rmg=new Repository_manager();
			repo=rmg.getRepository("custrepo");
			repo.select();
		}

		public static void Loan_officerPage()
		{
			Loan_officer officer=new Loan_officer();

			officer.SignUp("Deshmukh","loan_officer@gmail.com",8529637426l,"Darsh@114","13-may-1999",'M',"LOF");

		    officer.LogIn(8529637426l,"Darsh@114");

		    officer.ViewProfile();

		    officer.Verifyloan();

		    officer.Rejection();

	    }

		public static void LoanManager_ServicePage() 
		{
			LoanManager_Service manager=new LoanManager_Service();

			manager.SignUp("Sunil","manager@gmail.com",7406822431l,"Darsh@114","09-jan-1999",'M',"LMG");

		    manager.LogIn("manager@gmail.com","Darsh@114");

		    manager.ViewProfile();

		    manager.Verifyloan();

		    manager.Rejection();

		    manager.Approval();
		}

		public static void Admin_ServicePage()
		{
			Admin_Service admin=new Admin_Service();

			admin.SignUp("Admin","admin@gmail.com",9110694925l,"Darsh@114","13-may-1999",'M',"ADMIN");

		    admin.LogIn(9110694925l,"Darsh@114");

		    admin.ViewProfile();

		    admin.Postloanprogram();
		}

		public static void main(String[] args) 
		{
			System.out.println("Program starts...");

			// SignUpPage();
			// LogInPage();
	        //ProfilePage();

	         switch(1)
	         {
	            case 1:Customer_Service_Page();
	            break;

	            case 2:LoanManager_ServicePage();
	            break;

	            case 3:Loan_officerPage();
	            break;

	            case 4:Admin_ServicePage();
	            break;

	            default:
	            	System.out.println("invalid choice..");
	            	break;

	        }

			System.out.println("Program Ends...");
		}
}
