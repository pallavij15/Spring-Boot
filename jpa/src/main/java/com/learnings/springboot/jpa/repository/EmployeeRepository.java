package com.learnings.springboot.jpa.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnings.springboot.jpa.modal.Employee;
  
// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    ArrayList<Employee> findAllEmployee();
}