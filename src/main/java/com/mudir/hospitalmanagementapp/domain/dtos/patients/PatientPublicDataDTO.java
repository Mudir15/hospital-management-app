package com.mudir.hospitalmanagementapp.domain.dtos.patients;

import com.mudir.hospitalmanagementapp.domain.entities.Patient;

public record PatientPublicDataDTO(String name, String email, String cpf){

	public PatientPublicDataDTO(Patient patient){
        this(patient.getName(), patient.getEmail(), patient.getCpf());
    }
}
