package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {
@Id
	private int aid;
	
	private String areaname;
	
	private String city;
	
	
}
