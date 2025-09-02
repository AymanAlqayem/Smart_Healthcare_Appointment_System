package com.tarifi.smart_healthcare_appointment_system.repository;

import com.tarifi.smart_healthcare_appointment_system.document.MedicalRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicalRecordRepository extends MongoRepository<MedicalRecord, String> {
}
