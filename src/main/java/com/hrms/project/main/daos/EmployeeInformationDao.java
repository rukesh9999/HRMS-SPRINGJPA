package com.hrms.project.main.daos;

import java.util.List;

import com.hrms.project.main.form.EmployeeCompleteInfoForm;

public interface EmployeeInformationDao {
	List<EmployeeCompleteInfoForm> getAllEmployeesInfo();
	EmployeeCompleteInfoForm getIndividualEmployeeInfo(int empNo);
	
}
