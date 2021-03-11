package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	private String ecompany;
	private String euname;
	private String epass;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonBackReference // back reference for child type means association managed by onetomany
	private Department dept;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcompany() {
		return ecompany;
	}

	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}

	public String getEuname() {
		return euname;
	}

	public void setEuname(String euname) {
		this.euname = euname;
	}

	public String getEpass() {
		return epass;
	}

	public void setEpass(String epass) {
		this.epass = epass;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
