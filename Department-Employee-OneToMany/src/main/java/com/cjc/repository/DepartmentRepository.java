package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
