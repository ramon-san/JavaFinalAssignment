package com.oop.fa.controller;

import com.oop.fa.model.DataAnalysis;
import com.oop.fa.model.MainModel;
import com.oop.fa.model.PatientData;
import com.oop.fa.view.MainView;
import com.oop.fa.view.ThreeButtonsVertical;
import com.oop.fa.view.TwoInputAndEnter;

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

    public void actionPerformed(ActionEvent buttonClick){

        if(buttonClick.getSource() == ThreeButtonsVertical.buttonEpoc){
            mainView.changeHistogram("Epoc");
            mainView.epocHistogramGraph.updateUI();
        }
        if (buttonClick.getSource() == ThreeButtonsVertical.buttonAsma){
            mainView.changeHistogram("Asma");
            mainView.asmaHistogramGraph.updateUI();
        }
        if (buttonClick.getSource() == ThreeButtonsVertical.buttonDiabetes) {
            mainView.changeHistogram("Diabetes");
            mainView.diabetesHistogramGraph.updateUI();
        }
    }
}
