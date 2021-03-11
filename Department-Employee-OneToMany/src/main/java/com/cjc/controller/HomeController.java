package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Department;
import com.cjc.model.Employee;
import com.cjc.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;

	@RequestMapping("/")
	// this method is useful when there is no web.xml file
	public String prelogin() {
		System.out.println("this is my Prelogin Method");
		return "login";
	}

	@PostMapping("employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return hs.saveData(employee);
	}

	@PostMapping("dept")
	public Department saveDepartment(@RequestBody Department dept) {
		return hs.saveDept(dept);
	}

	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return hs.getAllEmp();
	}

	@GetMapping("/dept")
	public List<Department> getAllDepartments() {
		return hs.getAllDept();
	}

	@GetMapping("/employee/{eid}")
	public Employee getEmployeeById(@PathVariable("eid") int eid) {
		return hs.getEmployeeById(eid);
	}

	@GetMapping("/dept/{did}")
	public Department getDepartmentById(@PathVariable("did") int did) {
		return hs.getDeptById(did);
	}

	@GetMapping("/employee/{euname}/{epass}")
	public List<Employee> EmpLogin(@PathVariable("euname") String euname, @PathVariable("epass") String epass) {
		return hs.loginCheck(euname, epass);
	}

	@PutMapping("employee")
	public Employee updateEmployee(@RequestBody Employee e) {
		return hs.updateEmployee(e);
	}

	@PutMapping("dept")
	public Department updateDepartment(@RequestBody Department d) {
		return hs.updateDepartment(d);
	}

	@DeleteMapping("employee/{eid}")
	public List<Employee> deleteEmployee(@PathVariable("eid") int eid) {
		return hs.deleteEmployee(eid);
	}

	@DeleteMapping("dept/{did}")
	public List<Department> deleteDepartment(@PathVariable("did") int did) {
		return hs.deleteDepartment(did);
	}

}
