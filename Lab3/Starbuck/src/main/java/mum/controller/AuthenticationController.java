package mum.controller;

import mum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/login.do")
	public String login(@RequestParam String name, @RequestParam String password) {
		String expectedPassword = userService.findPassword(name);
		if(expectedPassword == null || !expectedPassword.equals(password)) {
			return "login";
		} else {
			return "LoginSuccessful";
		}
	}


}
