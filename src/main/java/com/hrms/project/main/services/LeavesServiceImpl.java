package com.hrms.project.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.project.main.daos.LeavesDao;
import com.hrms.project.main.model.EmployeeLeaves;

@Service
public class LeavesServiceImpl implements LeavesService{

	private  LeavesDao leavesDao;
	
	@Autowired
	public LeavesServiceImpl(LeavesDao leavesDao) {

		this.leavesDao = leavesDao;
	}


	@Override
	@Transactional
	public void applyLeave(EmployeeLeaves employeeLeaves) {
		leavesDao.applyLeave(employeeLeaves);
	}


	@Override
	@Transactional
	public EmployeeLeaves getEmployeeLeavesById(int id) {
		EmployeeLeaves employeeLeaves =  leavesDao.getEmployeeLeavesById(id);
		
		return employeeLeaves;
	}

}
