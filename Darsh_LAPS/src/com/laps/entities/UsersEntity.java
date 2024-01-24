package com.laps.entities;

public class UsersEntity 
{
	String login_id;
	String password;
	String role;

	public UsersEntity(String login_id,String password,String role)
	{
		this.login_id=login_id;
		this.password=password;
		this.role=role;
	}
}
