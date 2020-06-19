package com.hrms.project.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.project.main.daos.EmployeeInformationDao;
import com.hrms.project.main.form.EmployeeCompleteInfoForm;

@Service
public class EmployeeInformationServiceImpl implements EmployeeInformationService {

	private EmployeeInformationDao employeeInformationDao;

	@Autowired
	public EmployeeInformationServiceImpl(EmployeeInformationDao employeeInformationDao) {

		this.employeeInformationDao = employeeInformationDao;
	}

	@Override
	public List<EmployeeCompleteInfoForm> getAllEmployeesInfo() {

		List<EmployeeCompleteInfoForm> listOfEmployeeCompleteInfoForm = employeeInformationDao.getAllEmployeesInfo();

		return listOfEmployeeCompleteInfoForm;
	}

	@Override
	public EmployeeCompleteInfoForm getIndividualEmployeeInfo(int empNo) {
		// TODO Auto-generated method stub
		EmployeeCompleteInfoForm employeeCompleteInfoForm = employeeInformationDao.getIndividualEmployeeInfo(empNo);
		return employeeCompleteInfoForm;
	}

}
