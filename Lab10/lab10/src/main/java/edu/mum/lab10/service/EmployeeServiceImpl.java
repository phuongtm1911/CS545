package edu.mum.lab10.service;

import edu.mum.lab10.domain.Employee;
import edu.mum.lab10.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeByNumber(Integer number) {
        return employeeRepository.locateOneEmployeeByHisNumber(number);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}
