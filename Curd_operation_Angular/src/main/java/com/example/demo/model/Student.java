package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Student {

	@Id
	
	private int id;
	
	private String name;
	
	private String password;
	
	private String mobno;
	
	private String email;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	
	private List<Address> add;
	
	
	
}
