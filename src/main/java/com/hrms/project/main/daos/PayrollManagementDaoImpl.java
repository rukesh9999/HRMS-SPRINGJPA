package com.hrms.project.main.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.project.main.model.EmployeeSalary;

@Repository
public class PayrollManagementDaoImpl implements PayrollManagementDao{

	private EntityManager entityManager;
	
	@Autowired
	public PayrollManagementDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	@Override
	public void paySalary(EmployeeSalary employeeSalary) {

		EmployeeSalary dbempSalary=  entityManager.merge(employeeSalary);
		employeeSalary.setEmp_no(dbempSalary.getEmp_no());
	}



	@Override
	public EmployeeSalary getIndividualEmployeeSalaryInfo(int id) {
	
		EmployeeSalary employeeSalary =  entityManager.find(EmployeeSalary.class, id);
		
		return employeeSalary;
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeSalary> getAllEmployeesSalaryInfo() {
		Query query = entityManager.createQuery("from EmployeeSalary", EmployeeSalary.class);
		List<EmployeeSalary> listofempsalary =  query.getResultList();
		return listofempsalary;
	}

}
