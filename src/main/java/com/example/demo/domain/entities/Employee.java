package com.example.demo.domain.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="Employee",uniqueConstraints = @UniqueConstraint(name="email_unique_constraint",columnNames = "email"))
public class Employee {
    @Id
    @SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "employee_sequence")
    @Column(name = "employeeid")
    private Integer employeeId;
    @Column(name = "name", nullable = false, columnDefinition = "TEXT")
    private String name;
    @Column(name = "lastname", nullable = false, columnDefinition = "TEXT")
    private String lastName;
    @Temporal(TemporalType.DATE)
    @Column(name = "birthdate", nullable = false)
    private Date birthDate;
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;
    @Column(name = "cellphone", nullable = false, columnDefinition = "TEXT")
    private String cellPhone;
    @Column(name = "active", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean active;
    @OneToOne
    @JoinColumn(name="ContractTypeId")
    private ContractType contractType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }
}

