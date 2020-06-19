package com.hrms.project.main.services;

import com.hrms.project.main.model.EmployeeLeaves;

public interface LeavesService {
	void applyLeave(EmployeeLeaves employeeLeaves);
	EmployeeLeaves  getEmployeeLeavesById(int id);

}
