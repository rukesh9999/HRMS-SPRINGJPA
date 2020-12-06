package com.hrms.project.main.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.project.main.form.EmployeeCompleteInfoForm;

@Repository
public class EmployeeInformationDaoImpl implements EmployeeInformationDao {

	private EntityManager entityManager;

	@Autowired
	public EmployeeInformationDaoImpl(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	@Override
	public List<EmployeeCompleteInfoForm> getAllEmployeesInfo() {
		// TODO Auto-generated method stub
		List<EmployeeCompleteInfoForm> listOfEmployeeCompleteInfoForm = null;
		EmployeeCompleteInfoForm employeeCompleteInfoForm = null;
		listOfEmployeeCompleteInfoForm = new ArrayList<EmployeeCompleteInfoForm>();
		@SuppressWarnings("unchecked")
		List<Object[]> results = entityManager.createQuery(
				"select emp.emp_no,emp.emp_name,emp.email_id,emp.department,esal.ctc,eproj.name_of_the_project , eproj.status,epr.overall_performance,epr.type_of_band  "
						+ " from EmployeeRegistrationModel emp LEFT OUTER JOIN  EmployeeSalary esal on (emp.emp_no=esal.emp_no) LEFT OUTER JOIN EmployeeProjects eproj on (eproj.emp_no=esal.emp_no) LEFT OUTER JOIN EmployeePerformanceAndReview epr on(epr.employee_no=eproj.emp_no)")
				.getResultList();

		for (Object[] result : results) {
			System.out.println("result...."+result);
			employeeCompleteInfoForm = new EmployeeCompleteInfoForm();
			int emp_no = (int) result[0];
			String emp_name = (String) result[1];
			String email_id = (String) result[2];
			String department = (String) result[3];
			Double ctc = (Double) result[4];
			String name_of_the_project = (String) result[5];
			String project_status = (String) result[6];
			String employee_performance = (String) result[7];
			String type_of_band = (String) result[8];

			employeeCompleteInfoForm.setEmp_no(emp_no);
			employeeCompleteInfoForm.setEmp_name(emp_name);
			employeeCompleteInfoForm.setEmail_id(email_id);
			employeeCompleteInfoForm.setDepartment(department);
			employeeCompleteInfoForm.setCtc(ctc);
			employeeCompleteInfoForm.setName_of_the_project(name_of_the_project);
			employeeCompleteInfoForm.setProject_status(project_status);
			employeeCompleteInfoForm.setEmployee_performance(employee_performance);
			employeeCompleteInfoForm.setType_of_band(type_of_band);

			listOfEmployeeCompleteInfoForm.add(employeeCompleteInfoForm);

		}
		return listOfEmployeeCompleteInfoForm;

	}

	@Override
	public EmployeeCompleteInfoForm getIndividualEmployeeInfo(int empNo) {
		// TODO Auto-generated method stub
		EmployeeCompleteInfoForm employeeCompleteInfoForm = null;
		@SuppressWarnings("unchecked")
		List<Object[]> results = entityManager.createQuery(
				"select emp.emp_no,emp.emp_name,emp.email_id,emp.department,esal.ctc,eproj.name_of_the_project , eproj.status, epr.overall_performance, epr.type_of_band  "
						+ " from EmployeeRegistrationModel emp LEFT OUTER JOIN  EmployeeSalary esal on (emp.emp_no=esal.emp_no) LEFT OUTER JOIN EmployeeProjects eproj on (eproj.emp_no=esal.emp_no) LEFT OUTER JOIN EmployeePerformanceAndReview epr on (epr.employee_no=eproj.emp_no)"
						+ "  WHERE emp.emp_no=:emp_no")
				.setParameter("emp_no", empNo).getResultList();

		for (Object[] result : results) {
			employeeCompleteInfoForm = new EmployeeCompleteInfoForm();
			System.out.println("from dao..."+result);
			int emp_no = (int) result[0];
			String emp_name = (String) result[1];
			String email_id = (String) result[2];
			String department = (String) result[3];
			Double ctc = (Double) result[4];
			String name_of_the_project = (String) result[5];
			String project_status = (String) result[6];
			String employee_performance = (String) result[7];
			String type_of_band = (String) result[8];

			employeeCompleteInfoForm.setEmp_no(emp_no);
			employeeCompleteInfoForm.setEmp_name(emp_name);
			employeeCompleteInfoForm.setEmail_id(email_id);
			employeeCompleteInfoForm.setDepartment(department);
			employeeCompleteInfoForm.setCtc(ctc);
			employeeCompleteInfoForm.setName_of_the_project(name_of_the_project);
			employeeCompleteInfoForm.setProject_status(project_status);
			employeeCompleteInfoForm.setEmployee_performance(employee_performance);
			employeeCompleteInfoForm.setType_of_band(type_of_band);

		}

		return employeeCompleteInfoForm;
	}

}
