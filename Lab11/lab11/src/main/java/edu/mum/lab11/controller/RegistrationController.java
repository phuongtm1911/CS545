package edu.mum.lab11.controller;

import edu.mum.lab11.domain.Role;
import edu.mum.lab11.domain.User;
import edu.mum.lab11.service.RoleService;
import edu.mum.lab11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @ModelAttribute("roles")
    public List<Role> getRoles() {
        return roleService.findAll();
    }

    @GetMapping("/registration")
    public String registration(@ModelAttribute("user") User user) {
        return "registration";
    }

    @PostMapping("/registration")
    public String createUser(@Valid User user, BindingResult bindingResult, Model model) {
        User existedUser = userService.findUserByEmail(user.getEmail());
        if (existedUser != null) {
            bindingResult.rejectValue("email","error.user","There is already a user registered with provided email");
        }
        if (bindingResult.hasErrors()) {
            return "registration";
        } else {
            userService.saveUser(user);
            model.addAttribute("successMessage", "User has been registered successfully");
            model.addAttribute("user", new User());
            return "registration";
        }

    }
}
