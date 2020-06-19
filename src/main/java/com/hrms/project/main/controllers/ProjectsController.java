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

import com.hrms.project.main.form.EmployeeProjectsForm;
import com.hrms.project.main.model.EmployeeProjects;
import com.hrms.project.main.services.ProjectsService;

@Controller
@RequestMapping("/hrms")
public class ProjectsController {

	private ProjectsService ProjectsService;

	@Autowired
	public ProjectsController(com.hrms.project.main.services.ProjectsService projectsService) {

		ProjectsService = projectsService;
	}

	@GetMapping("/projects")
	public ModelAndView showProjectsPage() {
		ModelAndView mv = new ModelAndView();
		EmployeeProjectsForm employeeProjectsForm = new EmployeeProjectsForm();
		mv.addObject("employeeProjectsForm", employeeProjectsForm);
		mv.setViewName("projects/projects");
		return mv;
	}

	@GetMapping("/showAssignProjectForm")
	public ModelAndView showAssignProjectForm() {
		ModelAndView mv = new ModelAndView();
		EmployeeProjectsForm employeeProjectsForm = new EmployeeProjectsForm();
		mv.addObject("employeeProjectsForm", employeeProjectsForm);
		mv.setViewName("projects/assignProject");
		return mv;
	}

	@PostMapping("/assignProject")
	public ModelAndView assignProject(
			@Valid @ModelAttribute("employeeProjectsForm") EmployeeProjectsForm employeeProjectsForm,
			BindingResult errors) {

		ModelAndView mv = new ModelAndView();

		if (errors.hasErrors()) {
			mv.setViewName("projects/assignProject");
		}

		else {
			EmployeeProjects employeeProjects = new EmployeeProjects();
			employeeProjects.setEmp_no(employeeProjectsForm.getEmp_no());
			employeeProjects.setName_of_the_project(employeeProjectsForm.getName_of_the_project());
			employeeProjects.setType_of_the_project(employeeProjectsForm.getType_of_the_project());
			employeeProjects.setStatus(employeeProjectsForm.getStatus());
			employeeProjects.setStart_date(employeeProjectsForm.getStart_date());
			employeeProjects.setEnd_date(employeeProjectsForm.getEnd_date());
			ProjectsService.assignProject(employeeProjects);
			mv.addObject("employeeProjectsForm", employeeProjectsForm);
			mv.setViewName("projects/assignedprojectsuccess");

		}

		return mv;

	}

	@GetMapping("/showgetProjectDetailsForm")
	public ModelAndView showGetProjectDetailsForm() {
		ModelAndView mv = new ModelAndView();
		EmployeeProjects employeeProjects = new EmployeeProjects();
		mv.addObject("employeeProjects", employeeProjects);
		mv.setViewName("projects/getProjectDetails");
		return mv;
	}

	@PostMapping("/getProjectDetails")
	public ModelAndView getProjectDetailsById(
			@Valid @ModelAttribute("employeeProjects") EmployeeProjectsForm employeeProjectss, BindingResult errors) {
		ModelAndView mv = new ModelAndView();
		if (errors.hasFieldErrors("emp_no")) {
			mv.setViewName("projects/getProjectDetails");
		} else {
			EmployeeProjects employeeProjects = ProjectsService.getProjectDetailsById(employeeProjectss.getEmp_no());
			mv.addObject("employeeProjects", employeeProjects);
			mv.setViewName("projects/employeeprojectsInfo");

		}
		return mv;

	}

}
