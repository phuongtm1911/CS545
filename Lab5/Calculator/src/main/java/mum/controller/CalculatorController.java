package mum.controller;

import mum.domain.Calculator;
import mum.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @GetMapping(value = {"/"})
    public String index() {
        return "index";
    }

    @GetMapping(value = {"/calc"})
    public String calculator() {
        return "calculator";
    }

    @PostMapping(value = {"/calc2"})
    public String calculate(Calculator calculator, Model model, RedirectAttributes redirectAttributes) {
        List<String> errors = calculatorService.validate(calculator);
        if (errors.isEmpty()) {
            redirectAttributes.addFlashAttribute("calculator", calculator);
            redirectAttributes.addAttribute("greeting", "Greeting");
            return "redirect:/result";
        } else {
            redirectAttributes.addFlashAttribute("errors", errors);
            redirectAttributes.addFlashAttribute("form", calculator);
            return "redirect:/calc";
        }
    }

    @GetMapping(value = {"/result"})
    public String result(@RequestParam String greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }

}
