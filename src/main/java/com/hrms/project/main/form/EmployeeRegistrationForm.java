package com.hrms.project.main.form;

import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeRegistrationForm {
	
    
   
    @NotNull(message = " please enter employee name")
    @Size( min =1, max=8,message = "please enter employee name")
	protected String emp_name;
   
    @Range(min = (long) 10000.0, max = (long) 80000.0)
	protected double salary;
   
    @NotNull
    @Size( min =1, max=22,message =  " department is required")
	protected String department;
   
    @NotEmpty(message = "Email field should not be Empty")
    @Email(regexp = "^(.+)@(.+)$")
	protected String email_id;
    
    @NotNull
    @Size( min =1, max=12,message = " username is required")
    protected String username;
   
    @NotNull
    @Size( min =1, max=12,message = "password is required")
	protected String password;
	
    @PastOrPresent()
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = " please enter date")
	protected Date hire_date;

	
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
		return "EmployeeRegistrationForm [emp_name=" + emp_name + ", salary=" + salary + ", department=" + department
				+ ", email_id=" + email_id + ", username=" + username + ", password=" + password + ", hire_date="
				+ hire_date + "]";
	}
	
}
