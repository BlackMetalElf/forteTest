package com.example.demo.domain.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="ContractType")
@Table
public class ContractType {
    public ContractType(String name, String description) {
        Name = name;
        Description = description;
    }
    @Id
    @SequenceGenerator(name = "contract_type_sequence", sequenceName = "contract_type_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "contract_type_sequence")
    @Column(name = "ContractTypeId")
    private Integer ContractTypeId;
    @Column(name = "name", nullable = false, columnDefinition = "TEXT")
    private String Name;
    @Column(name = "description", nullable = true, columnDefinition = "TEXT")
    private String Description;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}