package com.hrms.project.main.services;

import com.hrms.project.main.model.EmployeeProjects;

public interface ProjectsService {
	void assignProject(EmployeeProjects employeeProjects);
	EmployeeProjects getProjectDetailsById(int id);
}
