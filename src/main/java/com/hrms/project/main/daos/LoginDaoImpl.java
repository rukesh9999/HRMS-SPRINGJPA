package com.hrms.project.main.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.project.main.model.EmployeeRegistrationModel;

@Repository
public class LoginDaoImpl implements LoginDao {

	private EntityManager entityManager;

	@Autowired
	public LoginDaoImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public EmployeeRegistrationModel login(String email) {
		// TODO Auto-generated method stub
		EmployeeRegistrationModel employeeRegistrationModel=null;
	   ArrayList<EmployeeRegistrationModel> al = (ArrayList<EmployeeRegistrationModel>) entityManager.createQuery(
		        "SELECT e FROM EmployeeRegistrationModel e  WHERE e.email_id LIKE :email_id")
		        .setParameter("email_id", email)
		        .getResultList();
		 
	   for(EmployeeRegistrationModel em:al)
	   {
		   employeeRegistrationModel=em;
	   }
	   
		    return employeeRegistrationModel;
	}

}
