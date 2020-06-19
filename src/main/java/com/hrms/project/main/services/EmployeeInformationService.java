package com.hrms.project.main.services;

import java.util.List;

import com.hrms.project.main.form.EmployeeCompleteInfoForm;

public interface EmployeeInformationService {
	List<EmployeeCompleteInfoForm>  getAllEmployeesInfo();
	EmployeeCompleteInfoForm getIndividualEmployeeInfo(int empNo);
}
