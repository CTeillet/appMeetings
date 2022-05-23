package com.teill.appmeetings.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "laboratory_contract_id")
    private LaboratoryContract laboratoryContract;

    public LaboratoryContract getLaboratoryContract() {
        return laboratoryContract;
    }

    public void setLaboratoryContract(LaboratoryContract laboratoryContract) {
        this.laboratoryContract = laboratoryContract;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}