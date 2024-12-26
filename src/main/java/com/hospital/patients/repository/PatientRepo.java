package com.hospital.patients.repository;

import com.hospital.patients.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepo {
    List<Patient> patients = new ArrayList<>();


    public Patient getPatientByIndex(int index){
        return patients.get(index);
    }

    public List<Patient> getAllPatients(){
        return patients;
    }

    public Patient savePatient(Patient patient){
        patients.add(patient);
        return patient;
    }

    public Patient updatePatientByIndex(int index, Patient patient){
         return patients.set(index, patient);
    }

    public void removePatientByIndex(int index){
        patients.remove(index);
    }
}