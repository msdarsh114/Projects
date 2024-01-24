package com.darsh.appone.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.darsh.appone.entities.User;

public class UserRepository extends RepoUtils implements Repository 
{
	String userOneQuery="select * from darsh.users where email=?";
	String insertUser="insert into darsh.users values(?,?,?,?)";
	String AllUsersQuery ="select * from darsh.users";
	String UpdateQuery="update darsh.users set name=?,email=?,mob=? where email=?";
	String deleteQuery="delete from darsh.users where email=?";
	
	//non static block open connection
	{
		try
		{
			openConnection();
		}
		catch (SQLException e) 
		{
			System.out.println("Not connected to database0");
			e.printStackTrace();
		}
	}

	@Override
	public User selectOne(String value) throws SQLException 
	{
		PreparedStatement pm = con.prepareStatement(userOneQuery);
		User u1=null;
		ResultSet rs=null;
		
		pm.setString(1, value);
		rs=pm.executeQuery();
		if(rs.next()==true)
		{
			int uid =rs.getInt("UID");
			String name =rs.getString("Name");
			String email = rs.getString("Email");
			String mob = rs.getString("mob");
			
			u1=new User(uid,name,email,mob);
		}
		closeConnection();
		
		return u1;
	}

	@Override
	public List<User> selectAll() throws SQLException 
	{
		PreparedStatement pm = con.prepareStatement(AllUsersQuery);
		ResultSet rs = pm.executeQuery();
		
		List<User> userList = new ArrayList<User>();

		while (rs.next() == true) 
		{
			int     uid = rs.getInt("UID");
			String name = rs.getString("Name");
			String email = rs.getString("Email");
			String mob = rs.getString("mob");
			
			User usr = new User(uid,name,email,mob);
			
			userList.add(usr);
		}

		closeConnection();
		
		return userList;
	}

	@Override
	public int insert(List<String> values) throws SQLException 
	{
		PreparedStatement ps  = con.prepareStatement(insertUser);
		ps.setInt(1, 0);
		ps.setString(2, values.get(0));
		ps.setString(3, values.get(1));
		ps.setString(4, values.get(2));
		
		int count = ps.executeUpdate();//DML
		
		return count;
	}

	@Override
	public int update(List<String> values, String condition) throws SQLException 
	{
		  PreparedStatement ps  = con.prepareStatement(UpdateQuery);
	      
	      ps.setString(1, values.get(0));//name
	      ps.setString(2, values.get(1));//email
	      ps.setString(3, values.get(2));//mob
	      ps.setString(4, condition);//currEmail
	      
	       int count = ps.executeUpdate();//DML
		
		return count;
	}

	@Override
	public int delete(String value) throws SQLException 
	{
		PreparedStatement ps  = con.prepareStatement(deleteQuery);
	      
	      ps.setString(1,value);//name
	      	      
	      int count = ps.executeUpdate();//DML
	      
	      return count;
	}

}
