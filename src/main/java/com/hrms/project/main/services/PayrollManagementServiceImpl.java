package com.hrms.project.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.project.main.daos.PayrollManagementDao;
import com.hrms.project.main.model.EmployeeSalary;

@Service
public class PayrollManagementServiceImpl implements PayrollManagementService {

	private PayrollManagementDao payrollManagementDao;
	
	@Autowired
	public PayrollManagementServiceImpl(PayrollManagementDao payrollManagementDao) {
	
		this.payrollManagementDao = payrollManagementDao;
	}


	@Override
	@Transactional
	public void paySalary(EmployeeSalary employeeSalary) {
		 payrollManagementDao.paySalary(employeeSalary);
	}


	@Override
	@Transactional
	public EmployeeSalary getIndividualEmployeeSalaryInfo(int id) {
		// TODO Auto-generated method stub
		EmployeeSalary  employeeSalary = payrollManagementDao.getIndividualEmployeeSalaryInfo(id);
		
		return employeeSalary;
	}


	@Override
	public List<EmployeeSalary> getAllEmployeesSalaryInfo() {
		List<EmployeeSalary> listofempsalary =	 payrollManagementDao.getAllEmployeesSalaryInfo();
		return listofempsalary;
	}

}
