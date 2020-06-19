package com.hrms.project.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.project.main.daos.PerformanceReviewsDao;
import com.hrms.project.main.model.EmployeePerformanceAndReview;

@Service
public class PerformanceReviewsServiceImpl implements PerformanceReviewsService {

	private PerformanceReviewsDao  performanceReviewsDao;
	
    @Autowired
	public PerformanceReviewsServiceImpl(PerformanceReviewsDao performanceReviewsDao) {
	
		this.performanceReviewsDao = performanceReviewsDao;
	}


	@Override
	@Transactional
	public void addPerformance(EmployeePerformanceAndReview  employeePerformanceAndReview) {
		performanceReviewsDao.addPerformance(employeePerformanceAndReview);
	}


	@Override
	@Transactional
	public EmployeePerformanceAndReview getIndividualEmployeePerformanceInfo(int id) {
		// TODO Auto-generated method stub
		EmployeePerformanceAndReview  employeePerformanceAndReview = performanceReviewsDao.getIndividualEmployeePerformanceInfo(id);
		return employeePerformanceAndReview;
	}


	@Override
	public List<EmployeePerformanceAndReview> getAllEmployeesPerformanceInfo() {
		List<EmployeePerformanceAndReview> listofemployeePerformanceAndReview =	 performanceReviewsDao.getAllEmployeesPerformanceInfo();
		return listofemployeePerformanceAndReview;
	}

}
