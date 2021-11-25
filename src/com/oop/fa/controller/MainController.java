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
            String input1 = TwoInputAndEnter.field1.getText();
            String input2 = TwoInputAndEnter.field2.getText();

            if (input1.equals("") && input2.equals("")) {
                TwoInputAndEnter.message.setText("Enter one input.");
            } else if (input1.equals("") && !input2.equals("")) {
                TwoInputAndEnter.message.setText("Calculating < " + TwoInputAndEnter.field2.getText());
            } else if (!input1.equals("") && input2.equals("")) {
                TwoInputAndEnter.message.setText("Calculating > " + TwoInputAndEnter.field1.getText());
            } else {
                TwoInputAndEnter.message.setText("One I said!");
            }
        }
    }
}
