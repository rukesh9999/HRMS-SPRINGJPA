package com.hrms.project.main.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.project.main.form.EmployeeRegistrationForm;
import com.hrms.project.main.model.EmployeeRegistrationModel;
import com.hrms.project.main.services.LoginService;

@Controller
@RequestMapping("/hrms")
public class LoginController {

	private LoginService loginService;

	@Autowired
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}

	@GetMapping("/login")
	public ModelAndView showLoginPage() {

		ModelAndView mv = new ModelAndView();
		EmployeeRegistrationForm employeeRegistrationForm = new EmployeeRegistrationForm();
		mv.addObject("employeeRegistrationForm", employeeRegistrationForm);
		mv.setViewName("login/login");
		return mv;
	}

	@GetMapping("/emplogin")
	public ModelAndView login(
			@Valid @ModelAttribute("employeeRegistrationForm") EmployeeRegistrationForm employeeRegistrationForm,
			BindingResult errors) {
		ModelAndView mv = new ModelAndView();

		if ((errors.hasFieldErrors("email_id")) || (errors.hasFieldErrors("username"))
				|| (errors.hasFieldErrors("password"))) {

			mv.setViewName("login/login");

		} else {

			EmployeeRegistrationModel employeeRegistrationModel = loginService
					.login(employeeRegistrationForm.getEmail_id());

			if ((employeeRegistrationModel.getUsername()).equalsIgnoreCase(employeeRegistrationForm.getUsername())
					&& (employeeRegistrationModel.getPassword())
							.equalsIgnoreCase(employeeRegistrationForm.getPassword())) {

				mv.addObject("employeeRegistrationForm", employeeRegistrationForm);
				mv.setViewName("/login/Loginsuccess");
			} else {
				mv.setViewName("login/login");
				mv.addObject("Invalid UserName And Password");
			}
		}

		return mv;
	}

}
