package com.oop.fa.controller;

import com.oop.fa.model.MainModel;
import com.oop.fa.view.MainView;
import com.oop.fa.view.ThreeButtonsVertical;
import com.oop.fa.view.TwoInputAndEnter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener {
    private MainView mainView;
    private MainModel mainModel;
    public SwitchHistograms switcher;

    /* Constructor. */
    public MainController(MainView mainView, MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
        ThreeButtonsVertical.buttonEpoc.addActionListener(this);
        ThreeButtonsVertical.buttonDiabetes.addActionListener(this);
        ThreeButtonsVertical.buttonAsma.addActionListener(this);
        TwoInputAndEnter.enterButton.addActionListener(this);
        switcher = new SwitchHistograms(this.mainView, this.mainModel);
    }

    public void actionPerformed(ActionEvent buttonClick){

        if(buttonClick.getSource() == ThreeButtonsVertical.buttonEpoc){
            switcher.changeHistogram("Epoc");
            mainView.epocHistogramGraph.updateUI();
        }
        if (buttonClick.getSource() == ThreeButtonsVertical.buttonAsma){
            switcher.changeHistogram("Asma");
            mainView.asmaHistogramGraph.updateUI();
        }
        if (buttonClick.getSource() == ThreeButtonsVertical.buttonDiabetes) {
            switcher.changeHistogram("Diabetes");
            mainView.diabetesHistogramGraph.updateUI();
        }
    }
}
