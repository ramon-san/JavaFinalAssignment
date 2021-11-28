package com.oop.fa.controller;

import com.oop.fa.model.MainModel;
import com.oop.fa.view.MainView;
import com.oop.fa.view.NormalizedDistribution;

import javax.swing.JPanel;

public class InputProbability {
    private MainView mainView;
    private MainModel mainModel;

    /* Constructor. */
    public InputProbability(MainView mainView, MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }

    /**
     * This function gets the probability graph for the given inputs and displays it in the UI.
     *
     * @param lowerBound of our probability.
     * @param upperBound of our probability.
     */
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
