package com.tarifi.smart_healthcare_appointment_system.repository;

import com.tarifi.smart_healthcare_appointment_system.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
