package com.hrms.project.main.daos;

import com.hrms.project.main.model.EmployeeLeaves;

public interface LeavesDao {
 
	void applyLeave(EmployeeLeaves employeeLeaves);
	EmployeeLeaves  getEmployeeLeavesById(int id);

}
