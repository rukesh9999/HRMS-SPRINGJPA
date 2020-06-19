package com.hrms.project.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hrms")
public class HomeController {

	
	@RequestMapping("/home")
	public ModelAndView homeController()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home/index");
	  	return mv;
	}
	
	
	@RequestMapping("/About-Us")
	public ModelAndView aboutUsController()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home/About-Us");
	  	return mv;
	}
	
	
	@RequestMapping("/Contact-Us")
	public ModelAndView contactUsController()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home/Contact-Us");
	  	return mv;
	}
	
	
}
