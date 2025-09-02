package com.tarifi.smart_healthcare_appointment_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    private Long id; // same as User id

    private String phone;
    private String address;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;
}