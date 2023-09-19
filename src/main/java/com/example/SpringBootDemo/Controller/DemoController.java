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

// --> http://localhost:8080/Employee/save

// --> Web application(Jsp,Anuler,Html) 2. Rest full web application :--->json data :--> Server ---> json --> return :

@RestController
//--> Dispature servler --> <url>/</url>
@RequestMapping("/Employee") // --> Root level mapping or class level mapping -->
public class DemoController {

	// ---> I am hear :---> Http request :

	@Autowired
	private EmployeeService service;// --> Service layer -->

	// --> Save Data :
	// ---> Create a Post api to save the data inside the data base by using
	// hibernate jpa :

	// --> Post man -->
	/*
	 * 
	 * { "id": 1, 
	 * "Stduent_Name": "Debopriyo", 
	 * "Student_Adress": "South Kolkata",
	 * "Student_email": "xyz@gmail.com" 
	 * }
	 * 
	 * class Emp{
	 * 
	 * private int id;
	 * private String name;
	 * }
	 * 
	 * Emp empl=new Emp();
	 * empl.setId(1);
	 * System.out.println(empl.id);
	 * 
	 */
	/*Binding the jason object  into the methode parameter */
	@PostMapping("/save")/*Save some data inside the web application*/
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		/*
		 * employee={ "id": 1, 
	 * "Stduent_Name": "Debopriyo", 
	 * "Student_Adress": "South Kolkata",
	 * "Student_email": "xyz@gmail.com" 
	 * }
		 */
		// --> Save the data into database :
		
		//--->before injection we have to create the bean :
		// --> Auto-wired --> injecting the bean whenever we want :

		try {
			Employee employeeSave = this.service.save(employee);
			return employeeSave;// --> Clint --> json format

		} catch (IllegalStateException ex) {

			throw new EmployeeNotFoundException("Invalid input  !");
		}

	}

	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {

		try {

			List<Employee> employeesList = this.service.getAllEmployees();

			return employeesList;
		} catch (Exception e) {

			throw new EmployeeNotFoundException("Employee Not found !!");
		}
	}

}
