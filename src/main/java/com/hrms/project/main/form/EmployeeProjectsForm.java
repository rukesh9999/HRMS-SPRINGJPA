package com.hrms.project.main.form;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeProjectsForm {
	
	@NotNull(message = "Please Enter Employee Number")
	protected Integer emp_no;
	
	@NotNull(message = " please enter Project name")
	@Size(min =1, max=8,message = "please enter Project name")
	protected String name_of_the_project;
	
	@NotNull
	@Size(min =1, max=22,message =  " Type of the Project is required")
	protected String type_of_the_project;
    
	@PastOrPresent()
	@NotNull(message = " please enter date")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date end_date;
	
	 @PastOrPresent()
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 @NotNull(message = " please enter date")
	 protected Date start_date;
	
	 @NotNull
	 @Size( min =1, max=22,message =  " status is required")
	 protected String status;
	
	
	
	public Integer getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(Integer emp_no) {
		this.emp_no = emp_no;
	}
	public String getName_of_the_project() {
		return name_of_the_project;
	}
	public void setName_of_the_project(String name_of_the_project) {
		this.name_of_the_project = name_of_the_project;
	}
	public String getType_of_the_project() {
		return type_of_the_project;
	}
	public void setType_of_the_project(String type_of_the_project) {
		this.type_of_the_project = type_of_the_project;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	@Override
	public String toString() {
		return "EmployeeProjects [emp_no=" + emp_no + ", name_of_the_project=" + name_of_the_project
				+ ", type_of_the_project=" + type_of_the_project + ", start_date=" + start_date + ", end_date="
				+ end_date + ", status=" + status + "]";
	}
	
	
	
}
