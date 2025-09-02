package com.tarifi.smart_healthcare_appointment_system.document;

import com.tarifi.smart_healthcare_appointment_system.repository.MedicalRecordRepository;
import com.tarifi.smart_healthcare_appointment_system.repository.PrescriptionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class MongoDataInitializer implements CommandLineRunner {

    private final PrescriptionRepository prescriptionRepository;
    private final MedicalRecordRepository medicalRecordRepository;

    public MongoDataInitializer(PrescriptionRepository prescriptionRepository,
                                MedicalRecordRepository medicalRecordRepository) {
        this.prescriptionRepository = prescriptionRepository;
        this.medicalRecordRepository = medicalRecordRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Save a sample prescription
        Prescription p = new Prescription();
        p.setDoctorId(1L);
        p.setPatientId(2L);
        p.setTime(LocalDateTime.now());
        p.setMedicines(List.of("Medicine A", "Medicine B"));
        p.setNotes("Take medicines twice daily");
        prescriptionRepository.save(p);

        // Save a sample medical record
        MedicalRecord r = new MedicalRecord();
        r.setPatientId(2L);
        r.setDescription("Blood test results");
        r.setLabResults("Normal");
        r.setRecordDate(LocalDateTime.now());
        medicalRecordRepository.save(r);

        System.out.println("Sample MongoDB data inserted!");
    }
}

