package com.tarifi.smart_healthcare_appointment_system.document;


import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "medical_records")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecord {
    @Id
    private String id;

    private Long patientId;
    private String description;
    private String labResults;
    private LocalDateTime recordDate;
}
