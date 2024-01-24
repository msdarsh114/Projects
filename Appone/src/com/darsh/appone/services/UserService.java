package com.darsh.appone.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.darsh.appone.entities.User;
import com.darsh.appone.repository.UserRepository;

public class UserService 
{
	UserRepository ur1 =new UserRepository();
	User u1=null;
   public void login(String entemail,String entmob)
   {
	   try 
	   {
		  u1=ur1.selectOne(entemail);
		  String email = u1.getEmail();
		  String mob =u1.getMob();
		  
		  if(email.equals(entemail) && mob.equals(mob))
		  {
			  System.out.println("Login successfull");
		  }
		  else
		  {
			  System.out.println("Invalid Email or Passward");
		  }
	   } 
	   catch (SQLException e) 
	   {
		  e.printStackTrace();
	   }
	   catch (NullPointerException npe) 
	   {
		   System.out.println(entemail+"does not exist please create an Account");
	   }
   }
   
   public void signup(String name, String email, String mob)
   {
	   List<String> values =new ArrayList<String>();
	   
	   values.add(name);
	   values.add(email);
	   values.add(mob);
	   try
	   {
		   int count = ur1.insert(values);
		   
	       if(count>0)
	       {
		       System.out.println("user signup successfull");
	       }
	   }
	   catch(SQLException e)
	   {
		   System.out.println("ERROR!! user with "+email+" already exists");
		   System.out.println("Please login or use different email");
	   }
   }
   
   public void showProfile(String email) 
   {
		System.out.println(u1.getUid());
		System.out.println(u1.getName());
		System.out.println(u1.getEmail());
		System.out.println(u1.getMob());
	}

	public void showAllUserProfiles() 
	{
		try 
		{
			List<User> userList = ur1.selectAll();

			for (int index = 0; index < userList.size(); index++) 
			{
				User u1 = userList.get(index);

				System.out.println(u1.getUid());
				System.out.println(u1.getName());
				System.out.println(u1.getEmail());
				System.out.println(u1.getMob());
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}
	
	public void updateProfile(String name, String email, String mob,String currEmail)
	{
		List<String> values = new ArrayList<String>();

		values.add(name);
		values.add(email);
		values.add(mob);
		
		try 
		{
			ur1.update(values,currEmail);
			System.out.println("User details updated");
		} 
		catch (SQLException e) 
		{
			System.out.println("User with "+currEmail+" does not exist");
		}
	}
	
	public void deleteAccount(String email)
	{
		try 
		{
			ur1.delete(email);
			System.out.println("User account deleted");
		} 
		catch (SQLException e) 
		{
			System.out.println("User with "+email+" does not exist");
		}
	}

}
