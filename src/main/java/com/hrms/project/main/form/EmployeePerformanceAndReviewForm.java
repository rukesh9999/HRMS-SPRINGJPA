package com.hrms.project.main.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeePerformanceAndReviewForm {
	
    @NotNull(message = " Please Enter Employee Number  ")
	protected Integer  employee_no;
	
	@NotNull(message = " Please Atleast Select One Option")
	protected String  communication;
	
	@NotNull(message = " Please Atleast Select One Option   ")
	@Size(min =1, max=8,message = "Please Atleast Select One Option ")
	protected String  coding_skills;
	
	@NotNull(message = " Please Atleast Select One Option   ")
	@Size(min =1, max=8,message = "Please Atleast Select One Option ")
	protected String  teamwork;
	
	@NotNull(message = "Please Atleast Select One Option")
	@Size(min =1, max=8,message = "Please Atleast Select One Option ")
	protected String  leadership;
	
	@NotNull(message = " Please Atleast Select One Option ")
	@Size(min =1, max=8,message = "Please Atleast Select One Option ")
	protected String  goal_setting;
	
	@NotNull(message = " Please Atleast Select One Option   ")
	@Size(min =1, max=8,message = "Please Atleast Select One Option ")
	protected String  timemanagement;
	
	@NotNull(message = " Please Atleast Select One Option")
	@Size(min =1, max=8,message = "Please Atleast Select One Option")
	protected String  attendance;
	
	@NotNull(message = " Please Atleast Select One Option ")
	@Size(min =1, max=8,message = "Please Atleast Select One Option")
	protected String  overall_performance;
	
	@NotNull(message = "Please Atleast Select One Option ")
	@Size(min =1, max=8,message = "Please Atleast Select One Option")
	protected String  type_of_band;
	
	
	public Integer getEmployee_no() {
		return employee_no;
	}
	
	public void setEmployee_no(Integer employee_no) {
		this.employee_no = employee_no;
	}
	public String getCommunication() {
		return communication;
	}
	public void setCommunication(String communication) {
		this.communication = communication;
	}
	public String getCoding_skills() {
		return coding_skills;
	}
	public void setCoding_skills(String coding_skills) {
		this.coding_skills = coding_skills;
	}
	public String getTeamwork() {
		return teamwork;
	}
	public void setTeamwork(String teamwork) {
		this.teamwork = teamwork;
	}
	public String getLeadership() {
		return leadership;
	}
	public void setLeadership(String leadership) {
		this.leadership = leadership;
	}
	public String getGoal_setting() {
		return goal_setting;
	}
	public void setGoal_setting(String goal_setting) {
		this.goal_setting = goal_setting;
	}
	public String getTimemanagement() {
		return timemanagement;
	}
	public void setTimemanagement(String timemanagement) {
		this.timemanagement = timemanagement;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public String getOverall_performance() {
		return overall_performance;
	}
	public void setOverall_performance(String overall_performance) {
		this.overall_performance = overall_performance;
	}
	public String getType_of_band() {
		return type_of_band;
	}
	public void setType_of_band(String type_of_band) {
		this.type_of_band = type_of_band;
	}
	
	
	@Override
	public String toString() {
		return "EmployeePerformanceAndReview [employee_no=" + employee_no + ", communication=" + communication
				+ ", coding_skills=" + coding_skills + ", teamwork=" + teamwork + ", leadership=" + leadership
				+ ", goal_setting=" + goal_setting + ", timemanagement=" + timemanagement + ", attendance=" + attendance
				+ ", overall_performance=" + overall_performance + ", type_of_band=" + type_of_band + "]";
	}
	
	
		
}
