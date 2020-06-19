package com.hrms.project.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class EmployeeLeaves {
    @Id
	protected int emp_no;
    
	protected String type_of_leave;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date start_date;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date end_date;
	
	protected int no_of_leaves;
	
	
	
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
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
	public int getNo_of_leaves() {
		return no_of_leaves;
	}
	public void setNo_of_leaves(int no_of_leaves) {
		this.no_of_leaves = no_of_leaves;
	}
	
	@Override
	public String toString() {
		return "EmployeeLeaves [emp_no=" + emp_no + ", type_of_leave=" + type_of_leave + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", no_of_leaves=" + no_of_leaves + "]";
	}
	
	
	
	
}
