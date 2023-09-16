package com.example.SpringBootDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootDemo.Entity.Employee;
import com.example.SpringBootDemo.Exception.EmployeeNotFoundException;
import com.example.SpringBootDemo.Service.EmployeeService;
import com.example.SpringBootDemo.ServiceImpl.EmployeeServiceImpl;

// --> http://localhost:8080/Demo/welcome
@RestController
@RequestMapping("/Employee") // --> Root level mapping or class level mapping -->
public class DemoController {

	@Autowired
	private EmployeeService service;// --> Service layer -->

	// --> Save Data :
	// ---> Create a Post api to save the data inside the data base by using
	// hibernate jpa :
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {

		try {
			Employee employeeSave = this.service.save(employee);
			return employeeSave;// --> Clint --> json format

		} catch (IllegalStateException ex) {

			throw new EmployeeNotFoundException("Employee not found !");
		}

	}

	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {

		try {

			List<Employee> employeesList = this.service.getAllEmployees();

			return employeesList;
		} catch (Exception e) {

			throw new EmployeeNotFoundException("Not found !!");
		}
	}

}
