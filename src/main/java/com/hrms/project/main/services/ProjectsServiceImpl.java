package com.hrms.project.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.project.main.daos.ProjectsDao;
import com.hrms.project.main.model.EmployeeProjects;

@Service
public class ProjectsServiceImpl  implements ProjectsService{

	private ProjectsDao ProjectsDao;
	
	@Autowired
	public ProjectsServiceImpl(com.hrms.project.main.daos.ProjectsDao projectsDao) {
		ProjectsDao = projectsDao;
	}


	@Override
	@Transactional
	public void assignProject(EmployeeProjects employeeProjects) {
		// TODO Auto-generated method stub
		ProjectsDao.assignProject(employeeProjects);
	}


	@Override
	@Transactional
	public EmployeeProjects getProjectDetailsById(int id) {
		// TODO Auto-generated method stub
		EmployeeProjects employeeProjects =  ProjectsDao.getProjectDetailsById(id);
		
		return employeeProjects;
	}

}
