package edu.mum.lab11.repository;

import edu.mum.lab11.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "select e from Employee e where e.number = :number")
    Employee locateOneEmployeeByHisNumber(Integer number);
}
