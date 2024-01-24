package com.darsh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		//step1
		String dbUrl ="jdbc:mysql://localhost:3306";
		String dbUser ="root";
		String dbPass ="Darsh@114";
		Connection con=null;
		try 
		{
			con=DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("connected to mysql Database");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		finally 
		{
			try 
			{
				con.close();
				System.out.println("Disconnected from mysql Database");
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
