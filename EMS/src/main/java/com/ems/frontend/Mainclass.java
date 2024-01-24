package com.ems.frontend;

import com.ems.entities.Department;
import com.ems.entities.Employee;
import com.ems.repository.EmployeeRepository;

public class Mainclass 
{
	static EmployeeRepository er=new EmployeeRepository();
	public static void testOneToOne()
    {
    	Employee e1 = new Employee();
    	e1.setEmpno(0);
    	e1.seteName("Miller");
    	e1.setJob("SSE");
    	e1.setSal(5236.23);
    	e1.setMob(1234567890l);
    	
    	Department d1 = new Department();
    	d1.setDeptNo(20);
    	d1.setdName("DEV");
    	d1.setLoc("GOA");
    	
    	e1.setDept(d1);
    	er.insert(e1);
    }
	
	public static void testGetEmployee()
	{
		Employee e1 = (Employee) er.selectOne(1);	
		   
		   System.out.println("Name  : "+e1.geteName());
		   System.out.println("Empno : "+e1.getEmpno());
		   System.out.println("JOB   : "+e1.getJob());
		   System.out.println("SAL   : "+e1.getSal());
		   
		   Department d1 = e1.getDept();
		   
		   System.out.println("LOC        : "+d1.getLoc());
		   System.out.println("Department : "+d1.getdName());
	}
	public static void main(String[] args) 
	{
        System.out.println("Program starts...");
		
//		EmployeeRepository er = new EmployeeRepository();
//		
//		Employee e1 = new Employee(0,"EMP2","TEST",9877654322l,23302.1,20);
//		
//		er.insert(e1);
        testOneToOne();
       // testGetEmployee();
		
		System.out.println("Program ends...");

	}

}
