package com.darsh.appone.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RepoUtils 
{
    private String dbUrl = "jdbc:mysql://localhost:3306";
    private String dbUser ="root";
    private String dbPass ="Darsh@114";
    Connection con=null;
    
    public void openConnection() throws SQLException
    {
    	if(con==null)
    	{
    	    con=DriverManager.getConnection(dbUrl,dbUser,dbPass);
    	}
    }
    
    public void closeConnection() throws SQLException
    {
    	con.close();
    }
}
