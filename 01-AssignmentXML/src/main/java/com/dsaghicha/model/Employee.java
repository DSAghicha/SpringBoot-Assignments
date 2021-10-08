package com.dsaghicha.model;

public class Employee {
	private String employeeID;
	private String employeeName;
	private double employeeSalary;
	private String employeeEmail;
	private String employeeDoJ;
	private Department employeeDept;
	
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
