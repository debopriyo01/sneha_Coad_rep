package com.example.SpringBootDemo.Exception;

public class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException(String massage) {
		super(massage);
	}

}
