package com.hrms.project.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.project.main.daos.RegistrationDao;
import com.hrms.project.main.model.EmployeeRegistrationModel;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	
	private RegistrationDao registrationDao;

	
	@Autowired
	public RegistrationServiceImpl(RegistrationDao registrationDao) {
		
		this.registrationDao = registrationDao;
	}

	
	@Override
	@Transactional
	public void registerEmployee(EmployeeRegistrationModel employeeRegistrationModel) {
		registrationDao.registerEmployee(employeeRegistrationModel);
	}

}
