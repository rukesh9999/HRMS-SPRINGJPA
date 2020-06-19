package com.hrms.project.main.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RecruitedCandidateForm {
 
	@NotNull(message = " ID is required")
	protected Integer id;
	@NotNull(message = "full name is required")
	@Size(min = 3, max = 23, message = "full name is required")
	protected String full_name;

	@NotNull(message = " YearOfPassedOut  is required")
	protected Integer year_of_passed_out;

	@NotNull(message = " Percentage is required")
	protected Double percentage;

	@NotNull(message = "Branch is required")
	@Size(min = 3, max = 22, message = "branch is required")
	protected String branch;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public Integer getYear_of_passed_out() {
		return year_of_passed_out;
	}

	public void setYear_of_passed_out(Integer year_of_passed_out) {
		this.year_of_passed_out = year_of_passed_out;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
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
		return "RecruitedCandidateForm [id=" + id + ", full_name=" + full_name + ", year_of_passed_out="
				+ year_of_passed_out + ", percentage=" + percentage + ", branch=" + branch + "]";
	}

}
