package com.oop.fa.model;

import java.util.ArrayList;

public class MainModel {
    private ArrayList<PatientData> fullResult = new ArrayList<>();
    private double mean, stdev;
    private int dataSize;

    /* Getter and Setter methods. */
    public void setFullResult(ArrayList<PatientData> fullResult) {
        this.fullResult = fullResult;
    }
    public ArrayList<PatientData> getFullResult() {
        return fullResult;
    }

    public double getMean() { return mean; }
    public void setMean(double mean) { this.mean = mean; }

    public double getStdev() { return stdev; }
    public void setStdev(double stdev) { this.stdev = stdev; }

    public int getDataSize() { return dataSize; }
    public void setDataSize(int dataSize) { this.dataSize = dataSize; }
}
