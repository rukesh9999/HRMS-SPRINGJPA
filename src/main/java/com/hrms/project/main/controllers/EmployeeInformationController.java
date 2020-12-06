package com.hrms.project.main.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.project.main.form.EmployeeCompleteInfoForm;
import com.hrms.project.main.services.EmployeeInformationService;

@Controller
@RequestMapping("/hrms")
public class EmployeeInformationController {

	private EmployeeInformationService employeeInformationService;

	public EmployeeInformationController(EmployeeInformationService employeeInformationService) {

		this.employeeInformationService = employeeInformationService;
	}

	@RequestMapping("/employeeInfo")
	public ModelAndView showCandidateRecruitingPage() {
		ModelAndView mv = new ModelAndView();
		EmployeeCompleteInfoForm employeeCompleteInfoForm = new EmployeeCompleteInfoForm();
		mv.addObject("employeeCompleteInfoForm", employeeCompleteInfoForm);
		mv.setViewName("EmployeeInformation/employeeInfo");
		return mv;
	}

	@RequestMapping("/showGetIndividualEmployeeInfoForm")
	public ModelAndView showGetIndividualEmployeeInfoForm() {
		ModelAndView mv = new ModelAndView();
		EmployeeCompleteInfoForm employeeCompleteInfoForm = new EmployeeCompleteInfoForm();
		mv.addObject("employeeCompleteInfoForm", employeeCompleteInfoForm);
		mv.setViewName("EmployeeInformation/getIndividualEmployeeInfo");
		return mv;
	}

	@RequestMapping("/showGetAllEmployeesInfoForm")
	public ModelAndView showGetAllEmployeesInfoForm() {
		ModelAndView mv = new ModelAndView();
		EmployeeCompleteInfoForm employeeCompleteInfoForm = new EmployeeCompleteInfoForm();
		mv.addObject("employeeCompleteInfoForm", employeeCompleteInfoForm);
		mv.setViewName("EmployeeInformation/getAllEmployeesInfo");
		return mv;
	}

	@PostMapping("/IndividualEmployeeInfo")
	public ModelAndView GetIndividualEmployeeInfo(
			@Valid @ModelAttribute("employeeCompleteInfoForm") EmployeeCompleteInfoForm employeeCompleteInfoForms,
			BindingResult errors) {
		ModelAndView mv = new ModelAndView();
		if (errors.hasErrors()) {
			mv.setViewName("EmployeeInformation/getIndividualEmployeeInfo");
		} else {
			EmployeeCompleteInfoForm employeeCompleteInfoForm = employeeInformationService.getIndividualEmployeeInfo(employeeCompleteInfoForms.getEmp_no());
			System.out.println("employeeCompleteInfoForm..........."+employeeCompleteInfoForm);
			mv.addObject("employeeCompleteInfoForm", employeeCompleteInfoForm);
			mv.setViewName("EmployeeInformation/IndividualEmployeeInfo");
		}

		return mv;
	}

	
	@GetMapping("/AllEmployeesInfo")
	public ModelAndView GetAllEmployeesInfo() {
		ModelAndView mv = new ModelAndView();
		List<EmployeeCompleteInfoForm> listOfEmployeeCompleteInfoForm = employeeInformationService.getAllEmployeesInfo();
		mv.addObject("listOfEmployeeCompleteInfoForm", listOfEmployeeCompleteInfoForm);
		System.out.println("listOfEmployeeCompleteInfoForm...."+listOfEmployeeCompleteInfoForm);
		mv.setViewName("EmployeeInformation/AllEmployeesInfo");
		return mv;
	}

}
