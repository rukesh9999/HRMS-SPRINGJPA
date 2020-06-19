package com.hrms.project.main.form;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


public class EmployeeLeavesForm {
    
    @NotNull(message = "Employee Number is required")
	protected Integer emp_no;
	
	@NotNull
	@Size(min =1, max=22,message =  " Type of the Leave is required")
	protected String type_of_leave;
	
	@PastOrPresent()
	@NotNull(message = " please enter date")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date start_date;
	
	@PastOrPresent
	@NotNull(message = "please enter Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date end_date;
	
	@NotNull(message = "NO of Leaves is Required")
	protected Integer no_of_leaves;

	public Integer getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(Integer emp_no) {
		this.emp_no = emp_no;
	}

	public String getType_of_leave() {
		return type_of_leave;
	}

	public void setType_of_leave(String type_of_leave) {
		this.type_of_leave = type_of_leave;
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

	

	public Integer getNo_of_leaves() {
		return no_of_leaves;
	}

	public void setNo_of_leaves(Integer no_of_leaves) {
		this.no_of_leaves = no_of_leaves;
	}

	
	
	@Override
	public String toString() {
		return "EmployeeLeavesForm [emp_no=" + emp_no + ", type_of_leave=" + type_of_leave + ", start_date="
				+ start_date + ", end_date=" + end_date + ", no_of_leaves=" + no_of_leaves + "]";
	}

	
	
	
	
	
	
	
	
	
}
