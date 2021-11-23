package com.oop.fa.model;

import java.util.ArrayList;

public class MainModel {
    private ArrayList <PatientData> fullResult = new ArrayList<>();
    double[] ageList;

    /* Getter and Setter methods. */
    public void setFullResult(ArrayList<PatientData> fullResult) {
        this.fullResult = fullResult;
    }

    public ArrayList<PatientData> getFullResult() {
        return fullResult;
    }

    public double[] ageListExtraction(ArrayList <PatientData> data) {
        int i = 0;
        double[] result = new double[data.size()];

        if (data == null){
            return(null);
        } else {
            for (PatientData pd : data) {
                result[i] = pd.getAge();
                i++;
            }
            return(result);
        }
    }
}
