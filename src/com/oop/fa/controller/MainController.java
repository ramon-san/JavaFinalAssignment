package com.oop.fa.controller;

import com.oop.fa.model.DataAnalysis;
import com.oop.fa.model.MainModel;
import com.oop.fa.model.PatientData;
import com.oop.fa.view.MainView;
import com.oop.fa.view.ThreeButtonsVertical;
import com.oop.fa.view.TwoInputAndEnter;
import sun.lwawt.macosx.CSystemTray;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainController implements ActionListener {
    private MainView mainView;
    private MainModel mainModel;

    public MainController(MainView mainFrame, MainModel mainModel) {
        this.mainView = mainFrame;
        this.mainModel = mainModel;
        ThreeButtonsVertical.buttonEpoc.addActionListener(this);
        ThreeButtonsVertical.buttonDiabetes.addActionListener(this);
        ThreeButtonsVertical.buttonAsma.addActionListener(this);
        TwoInputAndEnter.enterButton.addActionListener(this);
    }

    public void setPredefinedValues(ArrayList<PatientData> fullResult){
        ArrayList<Byte> byteResult = (DataAnalysis.listExtraction(mainModel.getFullResult(), "All"));
        double[] result = byteResult.stream().mapToDouble(Byte::doubleValue).toArray();
        mainView.ageHistogram.setValues(result);
        for(double d: result){
            System.out.println(d);
        }
        mainView.ageHistogramGraph = mainView.ageHistogram.makeHistogram();
        mainView.ageHistogramGraph.updateUI();
        //mainView.diseaseHistogram.setValues(result);
    }

    public void actionPerformed(ActionEvent buttonClick){

        if(buttonClick.getSource() == ThreeButtonsVertical.buttonEpoc){
            ArrayList<Byte> byteResult = (DataAnalysis.listExtraction(mainModel.getFullResult(), "Epoc"));
            double[] result = byteResult.stream().mapToDouble(Byte::doubleValue).toArray();
            mainView.diseaseHistogram.setValues(result);
            mainView.diseaseHistogramGraph.updateUI();
        }
    }
}
