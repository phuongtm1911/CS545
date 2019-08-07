package edu.mum.lab11.service;

import edu.mum.lab11.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee getEmployeeByNumber(Integer number);
    public Employee getEmployeeById(Long id);
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
