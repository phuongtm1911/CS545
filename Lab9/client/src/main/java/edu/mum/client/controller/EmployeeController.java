package edu.mum.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

//@RestController
@Controller
public class EmployeeController {
	
//	@GetMapping("/")
//	public ModelAndView getEmployeeForm() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("employee");
//		return modelAndView;
//	}

	@GetMapping("/")
	public String getEmployeeForm() {
		return "employee";
	}
}
