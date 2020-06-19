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

import com.hrms.project.main.form.EmployeeLeavesForm;
import com.hrms.project.main.model.EmployeeLeaves;
import com.hrms.project.main.services.LeavesService;

@Controller
@RequestMapping("/hrms")
public class LeavesController {

	private LeavesService leavesService;
	
	@Autowired
	public LeavesController(LeavesService leavesService) {
		this.leavesService = leavesService;
	}


	@GetMapping("/leaves")
	public ModelAndView showleavesPage() {
		
		ModelAndView mv = new ModelAndView();
		EmployeeLeavesForm employeeLeavesForm=new EmployeeLeavesForm();
		mv.addObject("employeeLeavesForm", employeeLeavesForm);
		mv.setViewName("leaves/leaves");
		return mv;
	}
	
	
	@GetMapping("/showapplyleavePage")
	public ModelAndView showapplyleavePage() {
		
		ModelAndView mv = new ModelAndView();
		EmployeeLeavesForm employeeLeavesForm=new EmployeeLeavesForm();
		mv.addObject("employeeLeavesForm", employeeLeavesForm);
		mv.setViewName("leaves/applyLeave");
		return mv;
	}
	
	
	@PostMapping("/applyleave")
	public ModelAndView applyLeave(@Valid @ModelAttribute("employeeLeavesForm") EmployeeLeavesForm employeeLeavesForm,BindingResult errors)
	{
		ModelAndView mv = new ModelAndView();
		
		if(errors.hasErrors())
		{
			mv.setViewName("leaves/applyLeave");
		}
		
		else {
			EmployeeLeaves employeeLeaves = new EmployeeLeaves();
			employeeLeaves.setEmp_no(employeeLeavesForm.getEmp_no());
			employeeLeaves.setEnd_date(employeeLeavesForm.getEnd_date());
			employeeLeaves.setNo_of_leaves(employeeLeavesForm.getNo_of_leaves());
			employeeLeaves.setStart_date(employeeLeavesForm.getStart_date());
			employeeLeaves.setType_of_leave(employeeLeavesForm.getType_of_leave());
			
			leavesService.applyLeave(employeeLeaves);
			
			mv.addObject("employeeLeaves", employeeLeaves);
			mv.setViewName("leaves/leavesuccess");

		}
		
		
		return mv;
	}
	
	
	
	@GetMapping("/showGetLeaveDetailsPage")
	public ModelAndView showGetLeaveDetailsPage() {
		
		ModelAndView mv = new ModelAndView();
		EmployeeLeavesForm employeeLeavesForm=new EmployeeLeavesForm();
		mv.addObject("employeeLeavesForm", employeeLeavesForm);
		mv.setViewName("leaves/getLeaveDetails");
		return mv;
	}
	
	
	@PostMapping("/getleavedetails")
	public ModelAndView getLeaveDetails(@Valid @ModelAttribute("employeeLeavesForm") EmployeeLeavesForm employeeLeavesForm,BindingResult errors)
	{
		ModelAndView mv = new ModelAndView();

		if(errors.hasFieldErrors("emp_no"))
		{
		  mv.setViewName("leaves/getLeaveDetails");	
		}
		else {
			EmployeeLeaves empLeaves = leavesService.getEmployeeLeavesById(employeeLeavesForm.getEmp_no());
			mv.addObject("empLeaves", empLeaves);
			mv.setViewName("leaves/employeeLeaveInfo");

		}
		   return mv;
	}

	
	
}
