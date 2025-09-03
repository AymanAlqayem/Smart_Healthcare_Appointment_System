package com.tarifi.smart_healthcare_appointment_system.controller;

import com.tarifi.smart_healthcare_appointment_system.entity.Doctor;
import com.tarifi.smart_healthcare_appointment_system.service.DoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("api")
public class DoctorController {
    DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
}
