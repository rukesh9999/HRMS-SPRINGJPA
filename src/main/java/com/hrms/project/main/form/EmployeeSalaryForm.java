package com.hrms.project.main.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class EmployeeSalaryForm {
    
	@NotNull(message = "please enter Employee Number")
	protected Integer emp_no;
	
    @Range(min = (long) 10000.0, max = (long) 80000.0)
    @NotNull(message = "please enter salary")
	protected double basicsalary ;
    @Range(min = (long) 10000.0, max = (long) 80000.0)
	protected double hra ;
    @Range(min = (long) 500.0, max = (long) 80000.0)
	protected double otherallowances;
    @Range(min = (long) 1000.0, max = (long) 80000.0)
	protected double grosssalary ;
    @Range(min = (long) 500.0, max = (long) 80000.0)
	protected double pf ;
    @Range(min = (long) 10000.0, max = (long) 80000.0)
	protected double ctc;
    @Range(min = (long) 10000.0, max = (long) 80000.0)
	protected double deductions ;
    @Range(min = (long) 500.0, max = (long) 80000.0)
	protected double netpay;
	
	
	
	public Integer getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(Integer emp_no) {
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
