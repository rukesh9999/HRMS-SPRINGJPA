package com.hrms.project.main.daos;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.project.main.model.EmployeeLeaves;

@Repository
public class LeavesDaoImpl  implements LeavesDao{

	
private EntityManager entityManager;
	
    @Autowired
	public LeavesDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
 
    
	@Override
	public void applyLeave(EmployeeLeaves employeeLeaves) {
     
		EmployeeLeaves dBEmployee = entityManager.merge(employeeLeaves);
		employeeLeaves.setEmp_no(dBEmployee.getEmp_no());
	}
	
	@Override
	public EmployeeLeaves  getEmployeeLeavesById(int id) {

		EmployeeLeaves employeeLeaves = entityManager.find(EmployeeLeaves.class, id);
		
		return employeeLeaves;
	}


}
