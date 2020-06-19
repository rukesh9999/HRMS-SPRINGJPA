package com.hrms.project.main.daos;

import java.util.List;

import com.hrms.project.main.model.EmployeeSalary;

public interface PayrollManagementDao {
   void paySalary(EmployeeSalary employeeSalary);
   EmployeeSalary getIndividualEmployeeSalaryInfo(int id);
   List<EmployeeSalary> getAllEmployeesSalaryInfo();
}
