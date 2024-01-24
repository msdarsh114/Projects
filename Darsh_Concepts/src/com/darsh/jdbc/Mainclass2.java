package com.darsh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DbConnection
{
	private String dbUrl ="jdbc:mysql://localhost:3306";
	private String dbUser ="root";
	private String dbPass ="Darsh@114";
	private Connection con=null;
	public void openConnection() throws SQLException
	{
		con=DriverManager.getConnection(dbUrl,dbUser,dbPass);
		System.out.println("connected to Database");
	}
	
	public void endConnection() throws SQLException
	{
		con.close();
		System.out.println("Disconnected from Database");
		
	}
}
public class Mainclass2 
{
	public static void main(String[] args) 
	{
        DbConnection db1 = new DbConnection();
        try 
        {
			db1.openConnection();
			db1.endConnection();
		}
        catch (SQLException e) 
        {
			e.printStackTrace();
		}
	}
}
