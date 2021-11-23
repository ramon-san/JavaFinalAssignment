package com.oop.fa.model;

import java.util.ArrayList;

public class MainModel {
    private ArrayList<PatientData> fullResult = new ArrayList<>();

    /* Getter and Setter methods. */
    public void setFullResult(ArrayList<PatientData> fullResult) {
        this.fullResult = fullResult;
    }
    public ArrayList<PatientData> getFullResult() {
        return fullResult;
    }

}
