package com.dsaghicha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dsaghicha.config.AppConfig;
import com.dsaghicha.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Employee emp = context.getBean("employee", Employee.class);
        emp.setEmployeeID("E003");
        emp.setEmployeeName("Darshaan");
        emp.setEmployeeEmail("email@dsaghicha.com");
        emp.setEmployeeSalary(78000.64);
        emp.setEmployeeDoJ("2020-03-03");
        emp.getEmployeeDept().setDeptID("D001");
        emp.getEmployeeDept().setDeptName("IT Dept");
        
//      Display of Information
        System.out.println("Employee ID:" + emp.getEmployeeID());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Email: " + emp.getEmployeeEmail());
        System.out.println("Employee Salary: " + emp.getEmployeeSalary());
        System.out.println("Employee Date of Joining: " + emp.getEmployeeDoJ());
        System.out.println("Employee Department: " + emp.getEmployeeDept().getDeptName() + " (" + emp.getEmployeeDept().getDeptID() + ")");
        
        
        ((AnnotationConfigApplicationContext) context).close();
    }
}
