package com.hrms.project.main.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hrms.project.main.form.RecruitedCandidateForm;
import com.hrms.project.main.model.RecruitedCandidate;
import com.hrms.project.main.services.CandidateRecruitingService;

@Controller
@RequestMapping("/hrms")
public class CandidateRecruitingController {

	private CandidateRecruitingService candidateRecruitingService;

	@Autowired
	public CandidateRecruitingController(CandidateRecruitingService candidateRecruitingService) {

		this.candidateRecruitingService = candidateRecruitingService;
	}

	@RequestMapping("/CandidateRecruiting")
	public ModelAndView showCandidateRecruitingPage() {
		ModelAndView mv = new ModelAndView();
		RecruitedCandidateForm recruitedCandidateForm = new RecruitedCandidateForm();
		mv.addObject("recruitedCandidateForm", recruitedCandidateForm);
		mv.setViewName("CandidateRecruiting/CandidateRecruiting");
		return mv;
	}

	@RequestMapping("/showAddRecruitedCandidateForm")
	public ModelAndView showAddRecruitedCandidateForm() {
		ModelAndView mv = new ModelAndView();
		RecruitedCandidateForm recruitedCandidateForm = new RecruitedCandidateForm();
		mv.addObject("recruitedCandidateForm", recruitedCandidateForm);
		mv.setViewName("CandidateRecruiting/AddRecruitedCandidate");
		return mv;
	}

	@PostMapping("/AddRecruitedCandidate")
	public ModelAndView AddRecruitedCandidate(
			@Valid @ModelAttribute("recruitedCandidateForm") RecruitedCandidateForm recruitedCandidateForm,
			BindingResult errors) {

		ModelAndView mv = new ModelAndView();

		if (errors.hasErrors()) {
			mv.setViewName("CandidateRecruiting/AddRecruitedCandidate");
		} else {
			RecruitedCandidate recruitedCandidate = new RecruitedCandidate();
			recruitedCandidate.setId(recruitedCandidateForm.getId());
			recruitedCandidate.setBranch(recruitedCandidateForm.getBranch());
			recruitedCandidate.setFull_name(recruitedCandidateForm.getFull_name());
			recruitedCandidate.setPercentage(recruitedCandidateForm.getPercentage());
			recruitedCandidate.setYear_of_passed_out(recruitedCandidateForm.getYear_of_passed_out());
			candidateRecruitingService.AddRecruitedCandidate(recruitedCandidate);

			mv.addObject("recruitedCandidate", recruitedCandidate);

			mv.setViewName("CandidateRecruiting/AddRecruitedCandidateSuccess");

		}

		return mv;
	}

	@RequestMapping("/showGetRecruitedCandidateDetails")
	public ModelAndView showGetRecruitedCandidateDetails() {
		ModelAndView mv = new ModelAndView();
		RecruitedCandidate recruitedCandidate = new RecruitedCandidate();
		mv.addObject("recruitedCandidate", recruitedCandidate);
		mv.setViewName("CandidateRecruiting/getAllRecruitedCandidateDetails");
		return mv;
	}

	@GetMapping("/getAllRecruitedCandidatesDeatils")
	public ModelAndView getAllRecruitedCandidatesDeatils() {
		ModelAndView mv = new ModelAndView();
		List<RecruitedCandidate> listofRecruitedCandidate = candidateRecruitingService
				.getAllRecruitedCandidatesDeatils();
		mv.addObject("listofRecruitedCandidate", listofRecruitedCandidate);
		mv.setViewName("CandidateRecruiting/AllRecruitedCandidatesDeatils");
		return mv;
	}

	@GetMapping("/showEditRecruitedCandidateForm/{id}")
	public ModelAndView showEditRecruitedCandidateForm(@PathVariable(name = "id") int id) {
		ModelAndView mv = new ModelAndView();
		RecruitedCandidate recruitedCandidate = candidateRecruitingService.getRecruitedCandidateById(id);
		mv.addObject("recruitedCandidate", recruitedCandidate);
		mv.setViewName("CandidateRecruiting/editRecruitedCandidate");
		return mv;
	}

	@PostMapping("/updateRecruitedCandidate")
	public ModelAndView updateRecruitedCandidate(
			@ModelAttribute("recruitedCandidateForm") RecruitedCandidateForm recruitedCandidateForm,
			BindingResult errors) {

		ModelAndView mv = new ModelAndView();

		RecruitedCandidate recruitedCandidate = new RecruitedCandidate();
		recruitedCandidate.setId(recruitedCandidateForm.getId());
		recruitedCandidate.setBranch(recruitedCandidateForm.getBranch());
		recruitedCandidate.setFull_name(recruitedCandidateForm.getFull_name());
		recruitedCandidate.setPercentage(recruitedCandidateForm.getPercentage());
		recruitedCandidate.setYear_of_passed_out(recruitedCandidateForm.getYear_of_passed_out());
		candidateRecruitingService.AddRecruitedCandidate(recruitedCandidate);

		mv.addObject("recruitedCandidate", recruitedCandidate);
		mv.setViewName("CandidateRecruiting/AddRecruitedCandidateSuccess");

		return mv;
	}

	@GetMapping("/deleteRecruitedCandidate/{id}")
	public ModelAndView deleteRecruitedCandidate(@PathVariable(name = "id") int id) {
		candidateRecruitingService.deleteRecruitedCandidate(id);

		ModelAndView mv = new ModelAndView();
		List<RecruitedCandidate> listofRecruitedCandidate = candidateRecruitingService
				.getAllRecruitedCandidatesDeatils();
		mv.addObject("listofRecruitedCandidate", listofRecruitedCandidate);
		mv.setViewName("CandidateRecruiting/AllRecruitedCandidatesDeatils");
		return mv;
	}

}
