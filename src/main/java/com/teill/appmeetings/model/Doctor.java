package com.teill.appmeetings.model;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @Column(name = "address", nullable = false)
    private String address;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}