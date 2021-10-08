package com.dsaghicha.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")
public class Employee {
	private String employeeID;
	private String employeeName;
	private double employeeSalary;
	private String employeeEmail;
	private String employeeDoJ;
	
	@Autowired
	private Department employeeDept;
	
//	Constructor for Department Class
	public Employee(Department dept) {
		this.employeeDept = dept;
	}
	
	public Employee(){}

	public Employee(String employeeID, String employeeName, double employeeSalary, String employeeEmail,
			String employeeDoJ, Department employeeDept) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.employeeDoJ = employeeDoJ;
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

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeDoJ() {
		return employeeDoJ;
	}

	public void setEmployeeDoJ(String employeeDoJ) {
		this.employeeDoJ = employeeDoJ;
	}

	public Department getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(Department employeeDept) {
		this.employeeDept = employeeDept;
	}	
}