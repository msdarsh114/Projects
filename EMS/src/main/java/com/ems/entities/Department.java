package com.ems.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Dept")
public class Department 
{
   @Id
   private int deptNo;
   
   @Column(length = 20,nullable = false)
   private String dName;
   
   @Column(length = 30,nullable = false)
   private String loc;
   
   public Department()
   {
	   
   }

public Department(int deptNo, String dName, String loc) {
	super();
	this.deptNo = deptNo;
	this.dName = dName;
	this.loc = loc;
}

public int getDeptNo() {
	return deptNo;
}

public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}

public String getdName() {
	return dName;
}

public void setdName(String dName) {
	this.dName = dName;
}

public String getLoc() {
	return loc;
}

public void setLoc(String loc) {
	this.loc = loc;
}
   
   
   
}
