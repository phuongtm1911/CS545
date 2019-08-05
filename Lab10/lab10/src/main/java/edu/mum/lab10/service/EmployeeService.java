package edu.mum.lab10.service;

import edu.mum.lab10.domain.Employee;

public interface EmployeeService {
    public Employee getEmployeeByNumber(Integer number);
    public Employee getEmployeeById(Long id);
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
}
