package com.JFSDS25.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.JFSDS25.model.Employee;
import com.JFSDS25.service.EmployeeService;

public class EmployeeController {
	@Autowired
	public EmployeeService emSer;
	
	@PostMapping("addEmployee")
	public String insertEmployee(@ModelAttribute("employee") Employee emp) {
		 // Use StudentService to add the student
		 emSer.addNewEmployee(emp);
		 return "insertSuccessView";
		 }
	
	@GetMapping("/")
	public ModelAndView demo()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addEmployeeView");
		return mv;
	}
	@GetMapping("addEmployee")
	 public ModelAndView redirectToAddStudent() {
	 ModelAndView mv = new ModelAndView();
	 mv.setViewName("home");
	 return mv;
	 }

}
