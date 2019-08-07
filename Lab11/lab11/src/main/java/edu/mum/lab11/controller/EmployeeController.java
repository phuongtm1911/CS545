package edu.mum.lab11.controller;

import edu.mum.lab11.domain.Employee;
import edu.mum.lab11.domain.User;
import edu.mum.lab11.service.EmployeeService;
import edu.mum.lab11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    UserService userService;

    @GetMapping("/add_employee")
    public String createEmployee(@ModelAttribute("employee") Employee employee, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByUsername(auth.getName());
        model.addAttribute("username", "Welcome " + user.getUsername());
        model.addAttribute("adminMessage","Content Available Only for Users with Admin Role");
        return "EmployeeForm";
    }

    @PostMapping("/save_employee")
    public String saveEmployee(Employee employee) {
        employeeService.createEmployee(employee);
        Integer number = employee.getNumber();
        return "redirect:/get_employee/" + number;
    }

    @GetMapping("/get_employee/{number}")
    public String getEmployee(@PathVariable Integer number, Model model) {
        Employee employee = employeeService.getEmployeeByNumber(number);
        model.addAttribute("employee", employee);
        return "EmployeeDetail";
    }

    @GetMapping("/update_employee/{id}")
    public String updateEmployee(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return "EmployeeForm";
    }

    @PostMapping("/delete_employee/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        Employee employee = employeeService.getEmployeeById(id);
        employeeService.deleteEmployee(employee);
        return "EmployeeResult";
    }

    @GetMapping("/index")
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }

}
