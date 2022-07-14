package com.example.demo.domain.services;

import com.example.demo.domain.entities.Employee;

import java.sql.SQLDataException;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllActiveEmployees();
    List<Employee> getEmployees();
    Employee getEmployeeById();
    void addNewEmployee(Employee employee) throws Exception;
    void updateEmployee(Employee employee) throws Exception;
    void deleteEmployee(Employee employee) throws Exception;

}
