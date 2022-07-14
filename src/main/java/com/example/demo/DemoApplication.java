package com.example.demo;

import com.example.demo.domain.entities.ContractType;
import com.example.demo.domain.repositories.ContractTypeRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContractTypeRepo contractTypeRepo){
		return args->{
			ContractType permanentContract=new ContractType("Permanent","Permanent");
			ContractType fixedTermContract=new ContractType("FixedTerm","FixedTerm");
			ContractType externalContract=new ContractType("External","External");

			contractTypeRepo.save(permanentContract);
			contractTypeRepo.save(fixedTermContract);
			contractTypeRepo.save(externalContract);
		};

	}
}
