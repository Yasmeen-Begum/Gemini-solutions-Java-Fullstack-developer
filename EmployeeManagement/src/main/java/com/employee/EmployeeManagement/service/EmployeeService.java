package com.employee.EmployeeManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.employee.EmployeeManagement.data.model.Employee;
import com.employee.EmployeeManagement.data.payload.request.EmployeeRequest;
import com.employee.EmployeeManagement.data.payload.response.MessageResponse;


@Component
public interface EmployeeService {
    MessageResponse createEmployee(EmployeeRequest employeeRequest);
    Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest);
    void deleteEmployee(Integer employeeId);
    Employee getASingleEmployee(Integer employeeId);
    List<Employee> getAllEmployee();
}
