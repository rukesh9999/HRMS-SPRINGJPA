package com.hrms.project.main.daos;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.project.main.model.EmployeeProjects;
@Repository
public class ProjectsDaoImpl  implements ProjectsDao{

	private EntityManager entityManager;
	
	@Autowired
	public ProjectsDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public void assignProject(EmployeeProjects employeeProjects) {
       
		EmployeeProjects dbEmployeeProjects = entityManager.merge(employeeProjects);
		employeeProjects.setEmp_no(dbEmployeeProjects.getEmp_no());
	}


	@Override
	public EmployeeProjects getProjectDetailsById(int id) {
		
		EmployeeProjects  employeeProjects  = entityManager.find(EmployeeProjects.class, id);
		
		return employeeProjects;
	}

}
