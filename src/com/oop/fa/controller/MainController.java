package com.oop.fa.controller;

import com.oop.fa.model.MainModel;
import com.oop.fa.model.ValidateInput;
import com.oop.fa.view.MainView;
import com.oop.fa.view.ThreeButtonsVertical;
import com.oop.fa.view.TwoInputAndEnter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener {
    private MainView mainView;
    private MainModel mainModel;
    public SwitchHistograms switcher;
    public InputProbability dataInput;

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

    public void setMainModel(MainModel mainModel) {
        this.mainModel = mainModel;
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
        if (buttonClick.getSource() == TwoInputAndEnter.enterButton) {
            String inputA = TwoInputAndEnter.fieldA.getText();
            String inputB = TwoInputAndEnter.fieldB.getText();
            boolean stateA = false;
            boolean stateB = false;

            if (!inputA.equals("") && !inputB.equals("")) {
                int numberInputA = ValidateInput.validateInt(inputA);
                int numberInputB = ValidateInput.validateInt(inputB);

                if (numberInputA >= 0 && numberInputA <= 100) {
                    stateA = true;
                } else { TwoInputAndEnter.message.setText("A is not valid."); }
                if (numberInputB >= 0 && numberInputB <= 100 && numberInputB > numberInputA) {
                    stateB = true;
                } else { TwoInputAndEnter.message.setText("B is not valid."); }

                if (stateA && stateB) {
                    InputProbability.getProbabilityGraph(mainModel, numberInputA, numberInputB);
                }
            } else {
                TwoInputAndEnter.message.setText("Enter (A < B).");
            }
        }
    }
}
