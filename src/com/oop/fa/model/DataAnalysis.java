package com.oop.fa.model;

import java.util.ArrayList;

public class DataAnalysis {

    /**
     * We analyse the data obtained from our DB and arrange it according to the searched attribute.
     *
     * @param data result set of our query.
     * @param search value we want to obtain.
     * @return ArrayList of the filtered data according to the search field.
     */
    public static ArrayList <Byte> listExtraction(ArrayList<PatientData> data, String search) {
        ArrayList <Byte> result  = new ArrayList<>();

        if (data == null){
            return(null);
        } else {
            switch (search){
                case "All":
                    for (PatientData pd : data) {
                        result.add(pd.getAge());
                    }
                    return(result);
                case "Epoc":
                    for (PatientData pd : data) {
                        if(pd.getEpoc() == 1) {
                            result.add(pd.getAge());
                            result.size();
                        }
                    }
                    return(result);
                case "Diabetes":
                    for (PatientData pd : data) {
                        if(pd.getDiabetes() == 1) {
                            result.add(pd.getAge());
                            result.size();
                        }
                    }
                    return(result);
                case "Asma":
                    for (PatientData pd : data) {
                        if(pd.getAsma() == 1) {
                            result.add(pd.getAge());
                            result.size();
                        }
                    }
                    return(result);
                default:
                    System.out.println("The search for " + search + " was not successful.");
                    return(null);
            }
        }
    }
}
