package mum.controller;

import mum.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.validator.CalculatorValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CalculatorController {
    @AutoWired
    CalculatorValidator calculatorValidator;

    @RequestMapping(value = {"/"})
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/jsp/index.jsp";
    }

    @RequestMapping(value = {"/calc"})
    public String calculator(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/jsp/calculator.jsp";
    }

    @RequestMapping(value = {"/calc2"})
    public String result(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {
        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/jsp/result.jsp";
        } else {
            request.setAttribute("errors", errors);
            request.setAttribute("form", calculator);
            return "/WEB-INF/jsp/calculator.jsp";
        }
    }

}
