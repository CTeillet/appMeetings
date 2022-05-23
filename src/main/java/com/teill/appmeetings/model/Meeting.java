package com.teill.appmeetings.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "meeting_date", nullable = false)
    private Date meetingDate;

    @Column(name = "meeting_duration", nullable = false)
    private int meetingDuration;

    @Column(name = "meeting_status", nullable = false)
    private String meetingStatus;

    @Column(name = "meeting_place", nullable = false)
    private String meetingPlace;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "collaborator_id")
    private Collaborator collaborator;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "laboratory_contract_id")
    private LaboratoryContract laboratoryContract;

    public LaboratoryContract getLaboratoryContract() {
        return laboratoryContract;
    }

    public void setLaboratoryContract(LaboratoryContract laboratoryContract) {
        this.laboratoryContract = laboratoryContract;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}