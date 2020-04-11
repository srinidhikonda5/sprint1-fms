package com.capg1.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext  context = new  AnnotationConfigApplicationContext(EmployeeConfiguration.class);;;;;;;;;;;;;;;;;;;;
      
       System.out.println("hello");
       Employee  emp=(Employee)context.getBean("employee");
////       System.out.println(emp);

       
       emp.setAge(34);
 System.out.println("Employee details...");
 System.out.println("........................");
 System.out.println("empage :"+emp.getAge());
 System.out.println("emp businessunit :"+emp.getBusinessUnit());
 System.out.println("emp EmployeeId :"+emp.getEmployeeId());
 System.out.println("emp EmployeeName:"+emp.getEmployeeName());
 System.out.println("emp Salary:"+emp.getSalary());
 
 
  Employee emp1=(Employee)context.getBean("employee");
 System.out.println("Employee details...");
 System.out.println("........................");
 System.out.println("empage :"+emp1.getAge());
 System.out.println("emp businessunit :"+emp1.getBusinessUnit());
 System.out.println("emp EmployeeId :"+emp1.getEmployeeId());
 System.out.println("emp EmployeeName:"+emp1.getEmployeeName());
 System.out.println("emp Salary:"+emp1.getSalary());
 
 
    }
}
