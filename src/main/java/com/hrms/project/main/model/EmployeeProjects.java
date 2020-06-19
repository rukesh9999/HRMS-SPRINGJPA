package com.hrms.project.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="employee_projects")
public class EmployeeProjects {

	
	@Id
	protected int emp_no;
	protected String name_of_the_project;
	protected String type_of_the_project;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date start_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date end_date;
	protected String status;
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
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
