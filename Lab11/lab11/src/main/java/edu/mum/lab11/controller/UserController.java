package edu.mum.lab11.controller;

import edu.mum.lab11.domain.User;
import edu.mum.lab11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String admin(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        model.addAttribute("username", "Welcome " + user.getUsername());
        model.addAttribute("adminMessage","Content Available Only for Users with Admin Role");
        return "EmployeeForm";
    }
}
