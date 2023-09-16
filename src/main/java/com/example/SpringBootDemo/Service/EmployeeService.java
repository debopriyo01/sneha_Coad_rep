package com.example.SpringBootDemo.Service;

import java.util.List;

import com.example.SpringBootDemo.Entity.Employee;

public interface EmployeeService {

	Employee save(Employee employee);

	List<Employee> getAllEmployees();

}
