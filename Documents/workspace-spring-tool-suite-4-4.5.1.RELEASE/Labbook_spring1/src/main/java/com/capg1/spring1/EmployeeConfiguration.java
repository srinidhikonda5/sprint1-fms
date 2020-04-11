package com.capg1.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg1.spring1")
@PropertySource("app.properties")
public class EmployeeConfiguration {
// @Bean(name="employee")
// public Employee getEmployee() {
// Employee emp= new Employee(101,"nidhi", 435467,"developer",21);
// return emp;
//}
}