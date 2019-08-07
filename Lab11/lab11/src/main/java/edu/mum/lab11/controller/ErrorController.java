package edu.mum.lab11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/error")
public class ErrorController {
    @GetMapping("/access-denied")
    public String accessDenied() {
        return "403";
    }
}
