package com.hrms.project.main.daos;

import com.hrms.project.main.model.EmployeeRegistrationModel;

public interface LoginDao {
	 EmployeeRegistrationModel login(String email);
}
