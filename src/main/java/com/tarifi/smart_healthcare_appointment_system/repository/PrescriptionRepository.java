package com.tarifi.smart_healthcare_appointment_system.repository;

import com.tarifi.smart_healthcare_appointment_system.document.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionRepository extends MongoRepository<Prescription, String> {
}

