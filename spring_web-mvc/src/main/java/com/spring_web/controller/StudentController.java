package com.spring_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring_web.model.Student;
import com.spring_web.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService stSer;
	
	//@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@PostMapping("addStudent")
    public String insertStudent(@ModelAttribute("student") Student student) {
        stSer.addNewStudent(student);
        return "index";
    }
	
	public String testingController(Student st) {
		stSer.addNewStudent(st);
		return "Ok ok";
	}
	
	@GetMapping("/")
	public ModelAndView demo() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
}
