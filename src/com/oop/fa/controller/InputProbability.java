package com.oop.fa.controller;

import com.oop.fa.Main;
import com.oop.fa.model.DataAnalysis;
import com.oop.fa.model.MainModel;
import com.oop.fa.model.Probability;
import com.oop.fa.view.MainView;
import com.oop.fa.view.NormalizedDistribution;
import com.oop.fa.view.TwoInputAndEnter;

import javax.swing.JPanel;
import java.util.ArrayList;

public class InputProbability {
    private MainView mainView;
    private MainModel mainModel;

    /* Constructor. */
    public InputProbability(MainView mainView, MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }

    public void getProbabilityGraph (int lowerBound, int upperBound) {
        System.out.println("Calculation with lower value " + lowerBound + " and upper value " + upperBound);
        String newTitle = ("Graph from " + lowerBound + " - " + upperBound);
        NormalizedDistribution distribution = new NormalizedDistribution(newTitle);
        JPanel newGraph = distribution.makeNormalizedDistribution(mainModel.getMean(), mainModel.getStdev(),
                mainModel.getDataSize(), lowerBound, upperBound);
        mainView.changeNormalizedGraph(newGraph);
        mainView.distributionGraph.updateUI();
    }

}
