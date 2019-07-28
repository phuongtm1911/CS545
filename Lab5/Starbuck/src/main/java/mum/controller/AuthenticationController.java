package mum.controller;

import mum.domain.User;
import mum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@SessionAttributes("user")
public class AuthenticationController {
	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String index(Map map, Model model) {
		String disabledLogin = "";
		String disabledAdvice = "";
		User user = (User) map.get("user");
		if (user == null) {
			disabledAdvice = "display: none";
		} else {
			disabledLogin = "display: none";
		}
		model.addAttribute("disabledLogin", disabledLogin);
		model.addAttribute("disabledAdvice", disabledAdvice);
		return "index";
	}

	@RequestMapping("/login.do")
	public String login(@RequestParam String name, @RequestParam String password, Model model) {
		String expectedPassword = userService.findPassword(name);
		if(expectedPassword == null || !expectedPassword.equals(password)) {
			return "index";
		} else {
			User user = new User(name, password);
			model.addAttribute("user", user);
			return "LoginSuccessful";
		}
	}

	@RequestMapping("/logout.do")
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:/";
	}

}
