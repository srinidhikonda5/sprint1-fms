package com.capg1.spring1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")
//@Lazy
public class Employee {
	@Value("${Employee.employeeId}")
 private int employeeId;
	@Value("${Employee.employeeName}")
 private String employeeName;
	@Value("${Employee.employeeSalary}")
 private double salary;
	@Value("${Employee.employeeBusinessUnit}")
private String businessUnit;
	@Value("${Employee.employeeAge}")
private int age;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
	this.businessUnit = businessUnit;
	this.age = age;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getBusinessUnit() {
	return businessUnit;
}
public void setBusinessUnit(String businessUnit) {
	this.businessUnit = businessUnit;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
			+ ", businessUnit=" + businessUnit + ", age=" + age + "]";
}
public void destroy() throws Exception{
	
}

}
