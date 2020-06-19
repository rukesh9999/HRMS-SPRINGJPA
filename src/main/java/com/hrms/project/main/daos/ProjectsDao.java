package com.hrms.project.main.daos;

import com.hrms.project.main.model.EmployeeProjects;

public interface ProjectsDao {

	void assignProject(EmployeeProjects employeeProjects);
	EmployeeProjects getProjectDetailsById(int id);

}
