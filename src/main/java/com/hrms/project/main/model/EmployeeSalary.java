package com.hrms.project.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_salary")
public class EmployeeSalary {
    
	@Id
	protected int emp_no;
	protected double basicsalary ;
	protected double hra ;
	protected double otherallowances;
	protected double grosssalary ;
	protected double pf ;
	protected double ctc;
	protected double deductions ;
	protected double netpay;
	
	
	
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getOtherallowances() {
		return otherallowances;
	}
	public void setOtherallowances(double otherallowances) {
		this.otherallowances = otherallowances;
	}
	public double getGrosssalary() {
		return grosssalary;
	}
	public void setGrosssalary(double grosssalary) {
		this.grosssalary = grosssalary;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	public double getNetpay() {
		return netpay;
	}
	public void setNetpay(double netpay) {
		this.netpay = netpay;
	}
	
	@Override
	public String toString() {
		return "EmployeeSalary [emp_no=" + emp_no + ", basicsalary=" + basicsalary + ", hra=" + hra
				+ ", otherallowances=" + otherallowances + ", grosssalary=" + grosssalary + ", pf=" + pf + ", ctc="
				+ ctc + ", deductions=" + deductions + ", netpay=" + netpay + "]";
	}
	
	
	
}
