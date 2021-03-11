package com.cjc.service;

import java.util.List;

import com.cjc.model.Department;
import com.cjc.model.Employee;

public interface HomeService {

	public Employee saveData(Employee e);

	public List<Employee> getAllEmp();

	public Employee getEmployeeById(int eid);

	public List<Employee> loginCheck(String euname, String epass);

	public List<Employee> deleteEmployee(int eid);

	public Employee updateEmployee(Employee e);

	public Department saveDept(Department d);

	public List<Department> getAllDept();

	public Department getDeptById(int did);

	public List<Department> deleteDepartment(int did);

	public Department updateDepartment(Department d);

}
