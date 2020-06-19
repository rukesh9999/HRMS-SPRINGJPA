package com.hrms.project.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recruited_candidate")
public class RecruitedCandidate {
    @Id
	protected int id;
	protected String full_name  ; 
	protected int year_of_passed_out;
	protected double percentage;
	protected String branch;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
	public int getYear_of_passed_out() {
		return year_of_passed_out;
	}
	public void setYear_of_passed_out(int year_of_passed_out) {
		this.year_of_passed_out = year_of_passed_out;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	@Override
	public String toString() {
		return "RecruitedCandidate [id=" + id + ", full_name=" + full_name + ", year_of_passed_out="
				+ year_of_passed_out + ", percentage=" + percentage + ", branch=" + branch + "]";
	}
	
}
