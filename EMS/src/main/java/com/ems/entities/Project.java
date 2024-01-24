package com.ems.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="project")
public class Project 
{
   @Id
   @Column(length = 20)
   private String prID;
   
   @Column(length = 20,nullable = false)
   private String prName;
   
   @Column(length = 20,nullable = false)
   private String prDos;
   
   @Column(length = 20,nullable = false)
   private String prDoe;
   
   @Column(length = 45,nullable = false)
   private String prDescp;

public Project(String prID, String prName, String prDos, String prDoe, String prDescp) {
	super();
	this.prID = prID;
	this.prName = prName;
	this.prDos = prDos;
	this.prDoe = prDoe;
	this.prDescp = prDescp;
}

public String getPrID() {
	return prID;
}

public void setPrID(String prID) {
	this.prID = prID;
}

public String getPrName() {
	return prName;
}

public void setPrName(String prName) {
	this.prName = prName;
}

public String getPrDos() {
	return prDos;
}

public void setPrDos(String prDos) {
	this.prDos = prDos;
}

public String getPrDoe() {
	return prDoe;
}

public void setPrDoe(String prDoe) {
	this.prDoe = prDoe;
}

public String getPrDescp() {
	return prDescp;
}

public void setPrDescp(String prDescp) {
	this.prDescp = prDescp;
}
   
   
   
}
