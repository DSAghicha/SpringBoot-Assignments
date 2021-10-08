package com.dsaghicha;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dsaghicha.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("config.xml");
        
        Employee employee = (Employee) factory.getBean("employee");
        
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getEmployeeSalary());
        System.out.println("Employee Email" + employee.getEmployeeEmail());
        System.out.println("Employee Date of Joining: " + employee.getEmployeeDoJ());
        final String employeeDeptStr = "Employee Department: " + employee.getEmployeeDept().getDeptName() + " (" + employee.getEmployeeDept().getDeptID() + ")"; 
        System.out.println(employeeDeptStr);
       
        ((ClassPathXmlApplicationContext) factory).close();
    }
}
