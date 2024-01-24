package com.ems.repository;

import com.ems.entities.Employee;

public class EmployeeRepository 
extends RepoUtils 
implements Repository
{
    public void insert(Object obj)
    {
    	createSession();
    	
    	tx = session.beginTransaction();
    	
    	session.save(obj);
    	
    	tx.commit();
    	
    	closeSession();
    	
    	System.out.println("Employee added to db");
    }

	public void update() 
	{
		createSession();
		
		tx = session.getTransaction();
		
		session.update(session);
		
		closeSession();
	}

	public void delete() 
	{
				
	}

	public Object selectOne(Object id) 
	{
        createSession();
		
		tx = session.beginTransaction();
		
		Employee e1 = session.get(Employee.class, id);
		
		tx.commit();
	
		closeSession();
		
		return e1;
	}
	
}
