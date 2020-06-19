package com.hrms.project.main.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.project.main.model.EmployeePerformanceAndReview;

@Repository
public class PerformanceReviewsDaoImpl implements PerformanceReviewsDao{

	private EntityManager entityManager;
	
	@Autowired
	public PerformanceReviewsDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	@Override
	public void addPerformance(EmployeePerformanceAndReview employeePerformanceAndReviewy) {

		EmployeePerformanceAndReview dbemployeePerformanceAndReview=  entityManager.merge(employeePerformanceAndReviewy);
		dbemployeePerformanceAndReview.setEmployee_no(dbemployeePerformanceAndReview.getEmployee_no());
	}



	@Override
	public EmployeePerformanceAndReview getIndividualEmployeePerformanceInfo(int id) {
	
		EmployeePerformanceAndReview employeePerformanceAndReview =  entityManager.find(EmployeePerformanceAndReview.class, id);
		
		return employeePerformanceAndReview;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeePerformanceAndReview> getAllEmployeesPerformanceInfo() {
		Query query = entityManager.createQuery("from EmployeePerformanceAndReview", EmployeePerformanceAndReview.class);
		List<EmployeePerformanceAndReview> listofemployeePerformanceAndReview =  query.getResultList();
		return listofemployeePerformanceAndReview;
	}

}
