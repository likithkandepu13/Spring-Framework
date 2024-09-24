package com.JFSDS25.Spring_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController 
{
	@GetMapping("/")
	public ModelAndView demo()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

}
