package com.oop.fa.controller;

import com.oop.fa.Main;
import com.oop.fa.model.MainModel;
import com.oop.fa.view.MainView;
import com.oop.fa.view.NormalizedDistribution;
import com.oop.fa.view.TwoInputAndEnter;

import javax.swing.JPanel;

public class InputProbability {
    private MainView mainView;
    private MainModel mainModel;

    /* Constructor. */
    public InputProbability(MainView mainView, MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }

    public static void getProbabilityGraph (MainModel dataBank, int lowerBound, int upperBound) {

        TwoInputAndEnter.message.setText("Probability function.");

        //JPanel probabilityGraph = NormalizedDistribution(mean, stdev, size);

        //return(probabilityGraph);
    }

}
