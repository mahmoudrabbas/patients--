package com.hospital.patients.controller;


import com.hospital.patients.model.Patient;
import com.hospital.patients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // get patient by id
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable("id") String id){
        return patientService.getPatientById(id);
    }


    // get all patients
    @GetMapping("/")
    public List<Patient> getPatientById(){
        return patientService.getAllPatients();
    }


    // create patient
    @PostMapping("/")
    public Patient createPatient(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }


    // update patient

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable("id") String id, @RequestBody Patient patient){
        return patientService.updatePatient(id, patient);
    }


    // delete patient
    @DeleteMapping("/{id}")
    public void removePatientById(@PathVariable("id") String id){
        patientService.deletePatient(id);
    }
}
