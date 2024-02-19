package com.example.neuropredict;

public class User {
    private String patient_id;

    public String getPatient_id() {
        return patient_id;
    }

    public User(String patient_id) {
        this.patient_id = patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }
}