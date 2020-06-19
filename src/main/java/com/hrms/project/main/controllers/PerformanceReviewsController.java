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

import com.hrms.project.main.form.EmployeePerformanceAndReviewForm;
import com.hrms.project.main.model.EmployeePerformanceAndReview;
import com.hrms.project.main.services.PerformanceReviewsService;

@Controller
@RequestMapping("/hrms")
public class PerformanceReviewsController {

	private PerformanceReviewsService PerformanceReviewsService;

	@Autowired
	public PerformanceReviewsController(PerformanceReviewsService PerformanceReviewsService) {

		this.PerformanceReviewsService = PerformanceReviewsService;
	}

	@RequestMapping("/PerformanceReviews")
	public ModelAndView showPerformanceReviewsPage() {
		ModelAndView mv = new ModelAndView();
		EmployeePerformanceAndReviewForm employeePerformanceAndReviewForm = new EmployeePerformanceAndReviewForm();
		mv.addObject("employeePerformanceAndReviewForm", employeePerformanceAndReviewForm);
		mv.setViewName("PerformanceReviews/PerformanceReviews");
		return mv;
	}

	@RequestMapping("/showAddPerformanceForm")
	public ModelAndView showAddPerformanceForm() {
		ModelAndView mv = new ModelAndView();
		EmployeePerformanceAndReviewForm employeePerformanceAndReviewForm = new EmployeePerformanceAndReviewForm();
		mv.addObject("employeePerformanceAndReviewForm", employeePerformanceAndReviewForm);
		mv.setViewName("PerformanceReviews/addperformance");
		return mv;
	}

	@PostMapping("/addperformance")
	public ModelAndView addperformance(
			@Valid @ModelAttribute("employeePerformanceAndReviewForm") EmployeePerformanceAndReviewForm employeePerformanceAndReviewForm,
			BindingResult errors) {

		ModelAndView mv = new ModelAndView();
		if (errors.hasErrors()) {
			mv.setViewName("PerformanceReviews/addperformance");
		} else {
			EmployeePerformanceAndReview employeePerformanceAndReview = new EmployeePerformanceAndReview();
			employeePerformanceAndReview.setAttendance(employeePerformanceAndReviewForm.getAttendance());
			employeePerformanceAndReview.setCoding_skills(employeePerformanceAndReviewForm.getCoding_skills());
			employeePerformanceAndReview.setCommunication(employeePerformanceAndReviewForm.getCommunication());
			employeePerformanceAndReview.setEmployee_no(employeePerformanceAndReviewForm.getEmployee_no());
			employeePerformanceAndReview.setGoal_setting(employeePerformanceAndReviewForm.getGoal_setting());
			employeePerformanceAndReview.setLeadership(employeePerformanceAndReviewForm.getLeadership());
			employeePerformanceAndReview
					.setOverall_performance(employeePerformanceAndReviewForm.getOverall_performance());
			employeePerformanceAndReview.setTeamwork(employeePerformanceAndReviewForm.getTeamwork());
			employeePerformanceAndReview.setTimemanagement(employeePerformanceAndReviewForm.getTimemanagement());
			employeePerformanceAndReview.setType_of_band(employeePerformanceAndReviewForm.getType_of_band());
			employeePerformanceAndReview.setGoal_setting(employeePerformanceAndReviewForm.getGoal_setting());

			PerformanceReviewsService.addPerformance(employeePerformanceAndReview);

			mv.addObject("employeePerformanceAndReview", employeePerformanceAndReview);
			mv.setViewName("PerformanceReviews/addPerformanceAndreviewSuccess");

		}

		return mv;

	}

	@RequestMapping("/showGetPerformanceDetailsPage")
	public ModelAndView showGetPerformanceDetailsPage() {
		ModelAndView mv = new ModelAndView();
		EmployeePerformanceAndReviewForm employeePerformanceAndReviewForm = new EmployeePerformanceAndReviewForm();
		mv.addObject("employeePerformanceAndReviewForm", employeePerformanceAndReviewForm);
		mv.setViewName("PerformanceReviews/getPerformanceDetails");
		return mv;
	}

	@RequestMapping("/showGetIndividualEmployeePerformanceInfoForm")
	public ModelAndView showGetIndividualEmployeePerformanceInfoForm() {
		ModelAndView mv = new ModelAndView();
		EmployeePerformanceAndReviewForm employeePerformanceAndReviewForm  = new EmployeePerformanceAndReviewForm();
		mv.addObject("employeePerformanceAndReviewForm", employeePerformanceAndReviewForm);
		mv.setViewName("PerformanceReviews/getIndividualEmployeePerformanceInfo");
		return mv;
	}

	@PostMapping("/getIndividualEmployeePerformanceInfo")
	public ModelAndView getIndividualEmployeePerformanceInfo(
			@Valid @ModelAttribute("employeePerformanceAndReviewForm") EmployeePerformanceAndReviewForm employeePerformanceAndReviews,
			BindingResult errors) {
		ModelAndView mv = new ModelAndView();
		if (errors.hasFieldErrors("employee_no")) {
			mv.setViewName("PerformanceReviews/getIndividualEmployeePerformanceInfo");
		} else {
			EmployeePerformanceAndReview employeePerformanceAndReview = PerformanceReviewsService
					.getIndividualEmployeePerformanceInfo(employeePerformanceAndReviews.getEmployee_no());
			mv.addObject("employeePerformanceAndReview", employeePerformanceAndReview);
			mv.setViewName("PerformanceReviews/individualEmployeePerformanceInfo");
		}

		return mv;
	}

	@RequestMapping("/showGetAllEmployeesPerformanceInfoForm")
	public ModelAndView showGetAllEmployeesPerformanceInfoForm() {
		ModelAndView mv = new ModelAndView();
		EmployeePerformanceAndReviewForm employeePerformanceAndReviewForm = new EmployeePerformanceAndReviewForm();
		mv.addObject("employeePerformanceAndReviewForm", employeePerformanceAndReviewForm);
		mv.setViewName("PerformanceReviews/getAllEmployeesPerformanceInfo");
		return mv;
	}

	@GetMapping("/getAllEmployeesPerformanceInfo")
	public ModelAndView getAllEmployeesPerformanceInfo() {
		ModelAndView mv = new ModelAndView();
		List<EmployeePerformanceAndReview> listofemployeePerformanceAndReview = PerformanceReviewsService
				.getAllEmployeesPerformanceInfo();
		mv.addObject("listofemployeePerformanceAndReview", listofemployeePerformanceAndReview);
		mv.setViewName("PerformanceReviews/AllEmployeePerformanceDetails");
		return mv;
	}

}
