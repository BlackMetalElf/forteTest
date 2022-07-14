package com.example.demo.domain.repositories;

import com.example.demo.domain.entities.ContractType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractTypeRepo extends JpaRepository<ContractType,Integer> {
}
