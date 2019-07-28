package com.students.controller;

import com.students.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class StudentController {

	@RequestMapping(value = "/registration", method= RequestMethod.GET)
	public String inputEmployee(@ModelAttribute("student") Student student) {
		return "registration";
	}

	@RequestMapping(value = "/registration", method=RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "registration";
		}

		model.addAttribute("student", student);

		return "success";
	}

}
