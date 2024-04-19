package in.antony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.antony.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
