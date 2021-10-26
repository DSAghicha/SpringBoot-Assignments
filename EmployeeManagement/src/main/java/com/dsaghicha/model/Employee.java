package com.dsaghicha.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String employeeID;
	private String employeeName;
	private String employeeEmail;
	private double employeeSalary;
	private String employeeDoJ;
	
	@Autowired
	private Address employeeAddress;	
//	Constructor for Address
	public Employee(Address address) {
		this.employeeAddress = address;
	}
	
	@Autowired
	private Department employeeDept;
//	Constructor for Address
	public Employee(Department dept) {
		this.employeeDept = dept;
	}

	public Employee(String employeeID, String employeeName, String employeeEmail, double employeeSalary,
			String employeeDoJ, Address employeeAddress, Department employeeDept) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
		this.employeeDoJ = employeeDoJ;
		this.employeeAddress = employeeAddress;
		this.employeeDept = employeeDept;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDoJ() {
		return employeeDoJ;
	}

	public void setEmployeeDoJ(String employeeDoJ) {
		this.employeeDoJ = employeeDoJ;
	}

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Department getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(Department employeeDept) {
		this.employeeDept = employeeDept;
	}
}