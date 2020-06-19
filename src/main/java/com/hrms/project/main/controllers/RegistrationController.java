package com.hrms.project.main.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.project.main.form.EmployeeRegistrationForm;
import com.hrms.project.main.model.EmployeeRegistrationModel;
import com.hrms.project.main.services.RegistrationService;

@Controller
@RequestMapping("/hrms")
public class RegistrationController {

	
	private RegistrationService registrationService;
	
	@Autowired
	public RegistrationController(RegistrationService registrationService) {
		
		this.registrationService = registrationService;
	}


	@GetMapping("/showRegistrationPage")
	public ModelAndView showRegistrationPage() {
		
		ModelAndView mv = new ModelAndView();
		EmployeeRegistrationForm employeeRegistrationForm=new EmployeeRegistrationForm();
		mv.addObject("employeeRegistrationForm", employeeRegistrationForm);
		mv.setViewName("Registration/Registration");
		return mv;
	}
	
	
	@PostMapping("/registerEmployee")
	public ModelAndView registerEmployee(@Valid @ModelAttribute("employeeRegistrationForm") EmployeeRegistrationForm employeeRegistrationForm,BindingResult errors)
	{
		
		ModelAndView mv = new ModelAndView();

		if(errors.hasErrors())
		{
			mv.setViewName("Registration/Registration");

		}

	   else {
		   
			EmployeeRegistrationModel employeeRegistrationModel=new EmployeeRegistrationModel();
			employeeRegistrationModel.setEmp_name(employeeRegistrationForm.getEmp_name());
			employeeRegistrationModel.setHire_date(employeeRegistrationForm.getHire_date());
			employeeRegistrationModel.setEmail_id(employeeRegistrationForm.getEmail_id());
			employeeRegistrationModel.setDepartment(employeeRegistrationForm.getDepartment());
			employeeRegistrationModel.setSalary(employeeRegistrationForm.getSalary());
			employeeRegistrationModel.setUsername(employeeRegistrationForm.getUsername());
			employeeRegistrationModel.setPassword(employeeRegistrationForm.getPassword());
			
			registrationService.registerEmployee(employeeRegistrationModel); 
			mv.addObject("employeeRegistrationModel", employeeRegistrationModel);
			mv.setViewName("Registration/registrationSuccess");
		}
		return mv;
	}
}
