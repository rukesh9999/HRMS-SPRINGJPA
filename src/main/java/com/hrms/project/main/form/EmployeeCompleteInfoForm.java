package com.hrms.project.main.form;

import javax.validation.constraints.NotNull;

public class EmployeeCompleteInfoForm {
   
	@NotNull(message = "Please Enter Employee Number")
	protected Integer emp_no;
	protected String emp_name;	
	protected String email_id;
	protected String department;
	protected String name_of_the_project;
	protected String project_status;
	protected String employee_performance;
	protected String type_of_band;
	protected Double ctc;
	public Integer getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(Integer emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName_of_the_project() {
		return name_of_the_project;
	}
	public void setName_of_the_project(String name_of_the_project) {
		this.name_of_the_project = name_of_the_project;
	}
	public String getProject_status() {
		return project_status;
	}
	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}
	public String getEmployee_performance() {
		return employee_performance;
	}
	public void setEmployee_performance(String employee_performance) {
		this.employee_performance = employee_performance;
	}
	public String getType_of_band() {
		return type_of_band;
	}
	public void setType_of_band(String type_of_band) {
		this.type_of_band = type_of_band;
	}
	public Double getCtc() {
		return ctc;
	}
	public void setCtc(Double ctc) {
		this.ctc = ctc;
	}
	
	
	
	@Override
	public String toString() {
		return "EmployeeCompleteInfoForm [emp_no=" + emp_no + ", emp_name=" + emp_name + ", email_id=" + email_id
				+ ", department=" + department + ", name_of_the_project=" + name_of_the_project + ", project_status="
				+ project_status + ", employee_performance=" + employee_performance + ", type_of_band=" + type_of_band
				+ ", ctc=" + ctc + "]";
	}
	
	
	
	
	
	
	
}
