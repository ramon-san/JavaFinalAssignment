package com.oop.fa.model;

public class PatientData {
    private byte age, epoc, diabetes, asma;

    public PatientData(byte age, byte epoc, byte diabetes, byte asma) {
        this.age = age;
        this.epoc = epoc;
        this.diabetes = diabetes;
        this.asma = asma;
    }

    public byte getAge() {
        return age;
    }

    public byte getEpoc() {
        return epoc;
    }

    public byte getDiabetes() {
        return diabetes;
    }

    public byte getAsma() {
        return asma;
    }

}
