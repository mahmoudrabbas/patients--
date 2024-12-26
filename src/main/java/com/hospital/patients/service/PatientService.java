package com.hospital.patients.service;


import com.hospital.patients.model.Patient;
import com.hospital.patients.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;

    // get patient
    public Patient getPatientById(String id){
        return getAllPatients().get(getIndex(id));
    }
    // get all patients
    public List<Patient> getAllPatients(){
        return patientRepo.getAllPatients();
    }

    // create Patient
    public Patient createPatient(Patient patient){
        return patientRepo.savePatient(patient);
    }

    // update Patient
    public Patient updatePatient(String id, Patient patient){
        Patient originalPatient = getPatientById(id);
        originalPatient.setName(patient.getName());
        originalPatient.setDisease(patient.getDisease());
        return patientRepo.updatePatientByIndex(getIndex(id), originalPatient);
    }

    // delete Patient
    public void deletePatient(String id){
        patientRepo.removePatientByIndex(getIndex(id));
    }

    // get index
    public int getIndex(String id){
        for (int i = 0; i < getAllPatients().size(); i++) {
            if(getAllPatients().get(i).getId().equals(id)) return i;
        }
        return -1;
    }
}


