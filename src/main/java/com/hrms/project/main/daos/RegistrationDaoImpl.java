package com.hrms.project.main.daos;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.project.main.model.EmployeeRegistrationModel;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {
	
	private EntityManager entityManager;
	
    @Autowired
	public RegistrationDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public void registerEmployee(EmployeeRegistrationModel employeeRegistrationModel) {
		
		EmployeeRegistrationModel dBEmployee = entityManager.merge(employeeRegistrationModel);
		employeeRegistrationModel.setEmp_no(dBEmployee.getEmp_no());

	}

	
	
	
}
