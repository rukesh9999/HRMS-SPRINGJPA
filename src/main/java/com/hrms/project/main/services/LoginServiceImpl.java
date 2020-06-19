package com.hrms.project.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.project.main.daos.LoginDao;
import com.hrms.project.main.model.EmployeeRegistrationModel;

@Service
public class LoginServiceImpl implements LoginService{

	
	private LoginDao loginDao;

	@Autowired
	public LoginServiceImpl(LoginDao loginDao) {
	
		this.loginDao = loginDao;
	}

	@Override
	public EmployeeRegistrationModel login(String email) {
		// TODO Auto-generated method stub
		EmployeeRegistrationModel employeeRegistrationModel = loginDao.login(email);
		
		return employeeRegistrationModel;
	}
	
	

	
	
    
	
}
