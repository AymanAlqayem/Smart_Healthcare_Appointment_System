package com.tarifi.smart_healthcare_appointment_system.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "prescriptions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {
    @Id
    private String id;

    private Long doctorId;
    private Long patientId;
    private LocalDateTime time;

    private List<String> medicines;
    private String notes;
}
