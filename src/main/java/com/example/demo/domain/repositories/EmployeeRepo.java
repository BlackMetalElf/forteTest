package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    List<Employee> findByActiveTrue();
    Employee findByEmployeeId(int id);
    Employee findByEmail(String email);
}
