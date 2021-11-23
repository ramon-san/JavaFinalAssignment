package com.oop.fa.controller;

import com.oop.fa.model.MainModel;
import com.oop.fa.view.MainView;

public class SwitchHistograms {
    private MainView mainView;
    private MainModel mainModel;

    public SwitchHistograms(MainView mainView, MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }

   public void changeHistogram(String select){
        switch (select){
            case ("Epoc"):
                System.out.println("Epoc button was clicked.");
                mainView.remove(mainView.diabetesHistogramGraph);
                mainView.remove(mainView.asmaHistogramGraph);
                mainView.epocHistogramGraph.setBounds(675, 200, 300, 250);
                mainView.add(mainView.epocHistogramGraph);
                break;
            case ("Diabetes"):
                System.out.println("Diabetes button was clicked.");
                mainView.remove(mainView.epocHistogramGraph);
                mainView.remove(mainView.asmaHistogramGraph);
                mainView.diabetesHistogramGraph.setBounds(675, 200, 300, 250);
                mainView.add(mainView.diabetesHistogramGraph);
                break;
            case ("Asma"):
                System.out.println("Asma button was clicked.");
                mainView.remove(mainView.epocHistogramGraph);
                mainView.remove(mainView.diabetesHistogramGraph);
                mainView.asmaHistogramGraph.setBounds(675, 200, 300, 250);
                mainView.add(mainView.asmaHistogramGraph);
                break;
            default:
                System.out.println("Something went wrong in the process.");
                break;
        }
    }

}
