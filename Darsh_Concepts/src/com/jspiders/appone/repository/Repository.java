package com.jspiders.appone.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspiders.appone.entities.User;

public interface Repository {

	public User selectOne(String value)throws SQLException;
	public List<User> selectAll() throws SQLException;
	public int insert(ArrayList<String> values) throws SQLException;
	public int update(List<String> values,String condition) throws SQLException;
	public void delete(String value)throws SQLException;
}
