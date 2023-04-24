package com.learnings.springboot.jpa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnings.springboot.jpa.modal.Employee;
import com.learnings.springboot.jpa.serviceimpl.EmpServiceImpl;
  
@RestController
public class EmpController {
    
    @Autowired
    EmpServiceImpl empServiceImpl;
  
    @PostMapping("/")
    public void add() {
        empServiceImpl.addEmployee();
    }
    
    @GetMapping("/")
    public String getGreetings(){
    	return "Greetings from Spring Boot!";
    }
    
    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee() {
    	System.out.println("Urekaaaaa....");
        return empServiceImpl.findAllEmployee();
    }
  
    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }
  
    @DeleteMapping("/delete")
    public void delete() {
        empServiceImpl.deleteAllData();
    }
}