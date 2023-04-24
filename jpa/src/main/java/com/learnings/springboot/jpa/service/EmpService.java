package com.learnings.springboot.jpa.service;

import java.util.ArrayList;
import com.learnings.springboot.jpa.modal.Employee;

public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}