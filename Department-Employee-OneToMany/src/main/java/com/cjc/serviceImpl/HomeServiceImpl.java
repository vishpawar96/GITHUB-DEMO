package com.cjc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Department;
import com.cjc.model.Employee;
import com.cjc.repository.DepartmentRepository;
import com.cjc.repository.EmployeeRepository;
import com.cjc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	EmployeeRepository hr;

	@Autowired
	DepartmentRepository dr;

	@Override
	public Employee saveData(Employee e) {
		Employee byId = getEmployeeById(e.getEid());
		if (byId == null) {
			return hr.save(e);
		}
		else {
			return null;
		}
	}

	@Override
	public List<Employee> getAllEmp() {
		return (List<Employee>) hr.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> byId = hr.findById(id);

		if (byId.isEmpty()) {
			return null;
		}
		else {
			return byId.get();
		}
	}

	@Override
	public List<Employee> loginCheck(String euname, String epass) {
		if (euname.equals("admin") && epass.equals("admin")) {
			return getAllEmp();
		}
		else {
			return hr.findByEunameAndEpass(euname, epass);
		}
	}

	@Override
	public List<Employee> deleteEmployee(int eid) {
		hr.deleteById(eid);
		return hr.findAll();
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return hr.save(e);

	}

	@Override
	public Department saveDept(Department d) {

		System.out.println("-----------------\n" + d);
		Department byId = getDeptById(d.getDid());
		if (byId == null) {
			return dr.save(d);
		}
		else {
			return null;
		}

	}

	@Override
	public List<Department> getAllDept() {
		return dr.findAll();
	}

	@Override
	public Department getDeptById(int did) {

		Optional<Department> byId = dr.findById(did);
		if (byId.isPresent()) {
			return byId.get();
		}
		else {
			return null;
		}

	}

	@Override
	public List<Department> deleteDepartment(int did) {
		dr.deleteById(did);
		return dr.findAll();
	}

	@Override
	public Department updateDepartment(Department d) {
		return dr.save(d);

	}
}
