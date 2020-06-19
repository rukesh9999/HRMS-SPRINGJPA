package com.hrms.project.main.daos;

import java.util.List;

import com.hrms.project.main.model.EmployeePerformanceAndReview;

public interface PerformanceReviewsDao {
	void addPerformance(EmployeePerformanceAndReview employeePerformanceAndReview);
	EmployeePerformanceAndReview getIndividualEmployeePerformanceInfo(int id);
	List<EmployeePerformanceAndReview> getAllEmployeesPerformanceInfo();

}
