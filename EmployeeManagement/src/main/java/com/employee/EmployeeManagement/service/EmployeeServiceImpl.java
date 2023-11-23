package com.employee.EmployeeManagement.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeManagement.data.model.Employee;
import com.employee.EmployeeManagement.data.payload.request.EmployeeRequest;
import com.employee.EmployeeManagement.data.payload.response.MessageResponse;
import com.employee.EmployeeManagement.data.repository.EmployeeRepository;
import com.employee.EmployeeManagement.exception.ResourceNotFoundException;
import com.employee.EmployeeManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public MessageResponse createEmployee(EmployeeRequest employeeRequest) {
        Employee newEmployee = new Employee();
        newEmployee.setName(employeeRequest.getName());
        newEmployee.setDob(employeeRequest.getDob());
        newEmployee.setCreated_date_time(employeeRequest.getCreated_date_time());
        newEmployee.setDepartment(employeeRequest.getDepartment());
        employeeRepository.save(newEmployee);
        return new MessageResponse("New Employee created successfully");

    }

    @Override
    public Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest)  throws ResourceNotFoundException{
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isEmpty()){
            throw new ResourceNotFoundException("Employee", "id", employeeId);
        }
        else
            employee.get().setName(employeeRequest.getName());
        employee.get().setDob(employeeRequest.getDob());
        employee.get().setDepartment(employeeRequest.getDepartment());
        employeeRepository.save(employee.get());
        return employee;
    }

    @Override
    public Employee getASingleEmployee(Integer employeeId) throws ResourceNotFoundException{
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "id", employeeId));
    }

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }
    @Override
    public void deleteEmployee(Integer employeeId) throws ResourceNotFoundException {
        if (employeeRepository.getById(employeeId).getId().equals(employeeId)){
            employeeRepository.deleteById(employeeId);
        }
        else throw new ResourceNotFoundException("Employee", "id", employeeId);
    }
}