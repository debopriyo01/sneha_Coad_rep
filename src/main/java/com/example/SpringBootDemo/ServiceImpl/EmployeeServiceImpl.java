package com.example.SpringBootDemo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.SpringBootDemo.Entity.Employee;
import com.example.SpringBootDemo.Repository.EmployeeRepo;
import com.example.SpringBootDemo.Service.EmployeeService;

// ---> Controller-->Service -->EmployeeServiceImpl--->Repository--> Database layer :

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		Employee employeeSave=this.employeeRepo.save(employee);
		return employeeSave;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> listOfEmployee=this.employeeRepo.findAll();
		return listOfEmployee;
	}

}
