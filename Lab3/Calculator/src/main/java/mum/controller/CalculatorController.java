package mum.controller;

import mum.domain.Calculator;
import mum.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @GetMapping(value = {"/"})
    public String index() {
        return "index";
    }

    @PostMapping(value = {"/calc"})
    public String calculator() {
        return "calculator";
    }

    @PostMapping(value = {"/calc2"})
    public String result(Calculator calculator, Model model) {
        List<String> errors = calculatorService.validate(calculator);
        if (errors.isEmpty()) {
            model.addAttribute("calculator", calculator);
            return "result";
        } else {
            model.addAttribute("errors", errors);
            model.addAttribute("form", calculator);
            return "calculator";
        }
    }

}
