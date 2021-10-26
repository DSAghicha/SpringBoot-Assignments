package com.dsaghicha.model;

public class Department {
	private String deptID;
	private String deptName;
	private String HoD;
	
	public Department() {} 
	
	public Department(String deptID, String deptName, String hoD) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		HoD = hoD;
	}

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getHoD() {
		return HoD;
	}

	public void setHoD(String hoD) {
		HoD = hoD;
	}	
}
