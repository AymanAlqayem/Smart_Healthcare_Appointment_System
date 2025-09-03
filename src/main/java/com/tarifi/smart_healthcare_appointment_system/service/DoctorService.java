package com.tarifi.smart_healthcare_appointment_system.service;

import com.tarifi.smart_healthcare_appointment_system.entity.Doctor;
import com.tarifi.smart_healthcare_appointment_system.repository.DoctorRepository;

import java.util.List;

public class DoctorService {
    DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
