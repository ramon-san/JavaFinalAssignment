package com.oop.fa.model.DBMS;

import com.oop.fa.model.PatientData;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QueriesDB {

    /**
     * This function gets the full result set of our DB. In this particular use case we get all patients with valid
     * ages. The query used for this result set can be seen inside of this function's code.
     *
     * @param connection to our DB.
     * @return result set of our query given as a PatientData ArrayList.
     */
    public ArrayList<PatientData> getFullResultSet(ConnectDB connection) {
        ArrayList <PatientData> list = new ArrayList<>();

        try{
            Statement fullResult = connection.conn.createStatement();
            fullResult.execute("SELECT * FROM originaldata WHERE Age <= 100");
            ResultSet resultSet = fullResult.getResultSet();
            while (resultSet.next()) {
                byte age = resultSet.getByte(1);
                byte diabetes = resultSet.getByte(2);
                byte epoc = resultSet.getByte(3);
                byte asma = resultSet.getByte(4);
                PatientData tempPatient = new PatientData(age, epoc, diabetes, asma);
                list.add(tempPatient);
            }
            System.out.println("DB full result was retrieved successfully.");
        } catch (SQLException e) {
            System.out.println("Error retrieving DB full result.");
        }

        return(list);
    }
}
