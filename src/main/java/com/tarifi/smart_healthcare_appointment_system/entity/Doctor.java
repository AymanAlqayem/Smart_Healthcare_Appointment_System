package com.tarifi.smart_healthcare_appointment_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "doctors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    private Long id; // same as User id

    private String specialty;
    private String phone;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;
}