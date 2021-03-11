package com.cjc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Department {

	@Id
	private int did;
	private String dname;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dept")

	@JsonManagedReference // manage reference for parent type means association managed by onetomany
	private List<Employee> eList = new ArrayList<Employee>();

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> geteList() {
		return eList;
	}

	public void seteList(List<Employee> eList) {
		this.eList = eList;
	}

}
