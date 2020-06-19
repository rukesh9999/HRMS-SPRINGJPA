package com.hrms.project.main.services;

import java.util.List;

import com.hrms.project.main.model.EmployeeSalary;

public interface PayrollManagementService {
	void paySalary(EmployeeSalary employeeSalary);
	EmployeeSalary getIndividualEmployeeSalaryInfo(int id);
	List<EmployeeSalary> getAllEmployeesSalaryInfo();

}
