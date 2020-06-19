package com.hrms.project.main.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.project.main.form.EmployeeSalaryForm;
import com.hrms.project.main.model.EmployeeSalary;
import com.hrms.project.main.services.PayrollManagementService;

@Controller
@RequestMapping("/hrms")
public class PayrollManagementController {

	private PayrollManagementService payrollManagementService;

	@Autowired
	public PayrollManagementController(PayrollManagementService payrollManagementService) {

		this.payrollManagementService = payrollManagementService;
	}

	@RequestMapping("/payrollmanagement")
	public ModelAndView showpayrollmanagementPage() {
		ModelAndView mv = new ModelAndView();
		EmployeeSalaryForm employeeSalaryForm = new EmployeeSalaryForm();
		mv.addObject("employeeSalaryForm", employeeSalaryForm);
		mv.setViewName("payrollmanagement/payrollmanagement");
		return mv;
	}

	@RequestMapping("/showPaySalaryForm")
	public ModelAndView showPaySalaryPage() {
		ModelAndView mv = new ModelAndView();
		EmployeeSalaryForm employeeSalaryForm = new EmployeeSalaryForm();
		mv.addObject("employeeSalaryForm", employeeSalaryForm);
		mv.setViewName("payrollmanagement/paysalary");
		return mv;
	}

	@PostMapping("/paysalary")
	public ModelAndView paySalary(@Valid @ModelAttribute("employeeSalaryForm") EmployeeSalaryForm employeeSalaryForm,
			BindingResult errors) {

		ModelAndView mv = new ModelAndView();

		if (errors.hasErrors()) {
			mv.setViewName("payrollmanagement/paysalary");
		}

		else {
			EmployeeSalary employeeSalary = new EmployeeSalary();
			employeeSalary.setBasicsalary(employeeSalaryForm.getBasicsalary());
			employeeSalary.setCtc(employeeSalaryForm.getCtc());
			employeeSalary.setDeductions(employeeSalaryForm.getDeductions());
			employeeSalary.setEmp_no(employeeSalaryForm.getEmp_no());
			employeeSalary.setGrosssalary(employeeSalaryForm.getGrosssalary());
			employeeSalary.setHra(employeeSalaryForm.getHra());
			employeeSalary.setNetpay(employeeSalaryForm.getNetpay());
			employeeSalary.setOtherallowances(employeeSalaryForm.getOtherallowances());
			employeeSalary.setPf(employeeSalaryForm.getPf());
			payrollManagementService.paySalary(employeeSalary);
			mv.addObject("employeeSalary", employeeSalary);
			mv.setViewName("payrollmanagement/paysalarysuccess");
		}

		return mv;

	}

	@RequestMapping("/getSalaryDetails")
	public ModelAndView showGetSalaryDetailsPage() {
		ModelAndView mv = new ModelAndView();
		EmployeeSalaryForm employeeSalaryForm = new EmployeeSalaryForm();
		mv.addObject("employeeSalaryForm", employeeSalaryForm);
		mv.setViewName("payrollmanagement/getSalaryDetails");
		return mv;
	}

	@RequestMapping("/showGetIndividualEmployeeSalaryInfoForm")
	public ModelAndView showGetIndividualEmployeeSalaryInfoPage() {
		ModelAndView mv = new ModelAndView();
		EmployeeSalaryForm employeeSalaryForm = new EmployeeSalaryForm();
		mv.addObject("employeeSalaryForm", employeeSalaryForm);
		mv.setViewName("payrollmanagement/getIndividualEmployeeSalaryInfo");
		return mv;
	}

	@PostMapping("/getIndividualEmployeeSalaryInfo")
	public ModelAndView getIndividualEmployeeSalaryInfo(
			@Valid @ModelAttribute("employeeSalaryForm") EmployeeSalaryForm employeeSalarys, BindingResult errors) {
		ModelAndView mv = new ModelAndView();
		if (errors.hasFieldErrors("emp_no")) {

			mv.setViewName("payrollmanagement/getIndividualEmployeeSalaryInfo");

		} else {
			EmployeeSalary employeeSalary = payrollManagementService
					.getIndividualEmployeeSalaryInfo(employeeSalarys.getEmp_no());
			mv.addObject("employeeSalary", employeeSalary);
			mv.setViewName("payrollmanagement/IndividualEmployeeSalaryDetails");

		}
		return mv;
	}

	@RequestMapping("/showGetAllEmployeesSalaryInfoForm")
	public ModelAndView showGetAllEmployeesSalaryInfoPage() {
		ModelAndView mv = new ModelAndView();
		EmployeeSalaryForm employeeSalaryForm = new EmployeeSalaryForm();
		mv.addObject("employeeSalaryForm", employeeSalaryForm);
		mv.setViewName("payrollmanagement/getAllEmployeesSalaryInfo");
		return mv;
	}

	@GetMapping("/getAllEmployeesSalaryInfo")
	public ModelAndView getAllEmployeesSalaryInfo() {
		ModelAndView mv = new ModelAndView();
		List<EmployeeSalary> listofempsalary = payrollManagementService.getAllEmployeesSalaryInfo();
		mv.addObject("listofempsalary", listofempsalary);
		mv.setViewName("payrollmanagement/AllEmployeeSalaryDetails");
		return mv;
	}

}
