package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Patient {
    private String id;
    private String name;
    private String disease;

    public Patient(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
