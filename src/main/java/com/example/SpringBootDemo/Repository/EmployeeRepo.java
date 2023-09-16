package com.example.SpringBootDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootDemo.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
