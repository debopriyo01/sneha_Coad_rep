package com.example.SpringBootDemo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "Employee_table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Student_id")
	private int id;//---> 1
	@Column(name = "Stduent_Name")
	private String name;// ---->Debopriyo
	@Column(name = "Student_Adress")
	private String adress;// --> South kolkata
	@Column(name = "Student_email")
	private String email;// --> xyz@gmail.com
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(int id, String name, String adress, String email) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.email = email;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + ", email=" + email + "]";
	}
}
