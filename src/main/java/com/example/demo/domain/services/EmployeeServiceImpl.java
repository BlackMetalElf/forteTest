package com.example.demo.domain.services;

import com.example.demo.domain.entities.Employee;
import com.example.demo.domain.repositories.EmployeeRepo;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    EmployeeRepo employeeRepo;
    @Override
    public List<Employee> getAllActiveEmployees() {
        List<Employee> list= employeeRepo.findByActiveTrue();
        return list;
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees=employeeRepo.findAll();
        return employees;
    }

    @Override
    public Employee getEmployeeById(){
        Employee emp=employeeRepo.findByEmployeeId(1);
        return emp;
    }
    @Override
    public void addNewEmployee(Employee employee) throws Exception {
        Employee emp=employeeRepo.findByEmail(employee.getEmail());
        if(emp==null){
            employeeRepo.save(employee);
        }
        else{
            throw new Exception("User Already Exists");
        }
    }
    @Override
    public void updateEmployee(Employee employee) throws Exception {
        Employee emp=employeeRepo.findByEmail(employee.getEmail());
        if(emp==null){
            employeeRepo.save(employee);
        }
        else{
            throw new Exception("User Already Exists");
        }
    }
    @Override
    public void deleteEmployee(Employee employee) throws Exception {
        Employee emp=employeeRepo.findByEmail(employee.getEmail());
        if(emp==null){
            throw new Exception("User Do not Exists");
        }else{
            emp.setActive(false);
            employeeRepo.save(emp);
        }
    }

}
