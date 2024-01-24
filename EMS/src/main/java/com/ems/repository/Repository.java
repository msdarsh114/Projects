package com.ems.repository;

public interface Repository 
{
	public void insert(Object obj);
	public void update();
	public void delete();
	public Object selectOne(Object obj);
}
