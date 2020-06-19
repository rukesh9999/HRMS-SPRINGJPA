package com.hrms.project.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="employee_registration")
public class EmployeeRegistrationModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected int emp_no;
   
	protected String emp_name;
    
	protected double salary;
    
	protected String department;
    
	protected String email_id;
    
	protected String username;
    
	protected String password;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date hire_date;
	
	
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	@Override
	public String toString() {
		return "EmployeeRegistrationModel [emp_no=" + emp_no + ", emp_name=" + emp_name + ", salary=" + salary
				+ ", department=" + department + ", email_id=" + email_id + ", username=" + username + ", password="
				+ password + ", hire_date=" + hire_date + "]";
	}
	
	
	
	
	
	

}
