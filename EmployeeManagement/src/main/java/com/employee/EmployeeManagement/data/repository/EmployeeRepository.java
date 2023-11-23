package com.employee.EmployeeManagement.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.EmployeeManagement.data.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Employee getById(Integer employeeId);

}
