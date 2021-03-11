package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repo.Studenrepo;

@RestController
@CrossOrigin("*")
public class Homecontroller {

	@Autowired
	Studenrepo repo;
	
	@PostMapping("/add")
	public Student add(@RequestBody Student s) {
		
	return	repo.save(s);
		
	}
	
	@GetMapping("all")
	
	public List<Student> all(){
		
		return repo.findAll();
		
	}
	
	@DeleteMapping("delete/{id}")
	
	
	public String delete(@PathVariable("id") int id) {
		
		repo.deleteById(id);
		
		return "delete ok";
		
	}
	
}
