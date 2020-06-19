package com.hrms.project.main.services;

import java.util.List;

import com.hrms.project.main.model.EmployeePerformanceAndReview;

public interface PerformanceReviewsService {
	
	void addPerformance(EmployeePerformanceAndReview employeePerformanceAndReview);
	EmployeePerformanceAndReview getIndividualEmployeePerformanceInfo(int id);
	List<EmployeePerformanceAndReview> getAllEmployeesPerformanceInfo();

}
