package edu.mum.lab10.controller;

import edu.mum.lab10.domain.Employee;
import edu.mum.lab10.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String createEmployee(@ModelAttribute("employee") Employee employee) {
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

}
