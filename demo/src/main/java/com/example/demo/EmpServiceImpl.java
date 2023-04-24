package com.example.demo;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
  
  
//  @Service marks a Java class that performs some service,
//  such as executing business logic, performing 
//  calculations, and calling external APIs.

//@ComponentScan(basePackages = "com.example.demo.repository*")
//@EnableJpaRepositories(basePackages = "com.example.demo.repository.*")
@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	    EmployeeRepository employeeRepository;
	 
 public void displaySuccess() {
	 System.out.println("SUCCESSFUL.....");
 }
	
}
 /*   @Autowired
    EmployeeRepository employeeRepository;
    
    @Override
    public ArrayList<Employee> findAllEmployee() {
        return (ArrayList<Employee>) employeeRepository.findAll();
    }
    
    @Override
    public Employee findAllEmployeeByID(long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }
    
    @Override
    public void addEmployee() {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Lucknow", "Shubham"));
        emp.add(new Employee("Delhi", "Puneet"));
        emp.add(new Employee("Pune", "Abhay"));
        emp.add(new Employee("Noida", "Anurag"));
        for (Employee employee : emp) {
            employeeRepository.save(employee);
        }
    }
    
    @Override
    public void deleteAllData() {
        employeeRepository.deleteAll();
    }
}*/