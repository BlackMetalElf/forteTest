package com.example.demo.domain.controller;


import com.example.demo.domain.entities.Employee;
import com.example.demo.domain.services.EmployeeServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    EmployeeServiceImpl employeeService;
    @GetMapping(path="/")
    public ResponseEntity<List<Employee>> getEmployees(){
        return ResponseEntity.ok().body(employeeService.getEmployees());
    }
    @GetMapping(path="/activeEmployees")
    public ResponseEntity<List<Employee>> getActiveEmployees(){
        return ResponseEntity.ok().body(employeeService.getAllActiveEmployees());
    }
    @PostMapping(path="/")
    public ResponseEntity<String> addNewEmployee(@RequestBody Employee employee){
        String message="";
        try {
            employeeService.addNewEmployee(employee);
            message="Added";
        }catch(Exception ex){
            message="Cannot process your request";
        }finally {
            return ResponseEntity.ok().body(message);
        }

    }
    @PostMapping(path="/updateEmployee")
    public ResponseEntity<String> updateEmployee( @RequestBody Employee employee){
        String message="";
        try {
            employeeService.updateEmployee(employee);
            message="Added";
        }catch(Exception ex){
            message="Cannot process your request";
        }finally {
            return ResponseEntity.ok().body(message);
        }
    }
    @DeleteMapping(path="/")
    public ResponseEntity<String> deleteEmployee( @RequestBody Employee employee){
        String message="";
        try {
            employeeService.deleteEmployee(employee);
            message="Added";
        }catch(Exception ex){
            message="Cannot process your request";
        }finally {
            return ResponseEntity.ok().body(message);
        }
    }
}
