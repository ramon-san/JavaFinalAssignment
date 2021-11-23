package com.oop.fa.view;

import com.oop.fa.model.MainModel;
import com.oop.fa.model.PatientData;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;

public class MainView extends JFrame {
    int width = 1100;
    int height = 800;
    double[] data = {10, 20, 41, 51, 63, 75, 81, 83, 1, 8, 45, 85, 23, 55, 54, 45, 45, 43, 32, 23};
    HeaderPanel header = new HeaderPanel();

    /* We create our histogram graphs. */
    Histogram ageHistogram = new Histogram("Age Histogram", "Age", "Population", data, 10);
    JPanel ageHistogramGraph = new JPanel();
    ThreeButtonsVertical buttons = new ThreeButtonsVertical();
    Histogram diseaseHistogram = new Histogram("Disease Histogram", "Age", "Population", data, 15);
    JPanel diseaseHistogramGraph = new JPanel();
    TwoInputAndEnter inputs = new TwoInputAndEnter();
    NormalizedDistribution distribution = new NormalizedDistribution("Example");
    JPanel distributionGraph = new JPanel();
    SystemInstructions instructions = new SystemInstructions();

    public MainView() {
        setLayout(null);
        setSize(width, height);
        setTitle("Final Assignment");

        /* We now add the panels. */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        header.setBounds(0,0,width,150);
        add(header);
        ageHistogramGraph = ageHistogram.makeHistogram();
        ageHistogramGraph.setBounds(125, 200, 300,250);
        add(ageHistogramGraph);
        buttons.setBounds(475, 200, 150, 250);
        add(buttons);
        diseaseHistogramGraph = diseaseHistogram.makeHistogram();
        diseaseHistogramGraph.setBounds(675, 200, 300, 250);
        add(diseaseHistogramGraph);
        inputs.setBounds(125, 475, 170, 250);
        add(inputs);
        distributionGraph = distribution.makeNormalizedDistribution(0,1);
        distributionGraph.setBounds(345, 475, 300, 250);
        add(distributionGraph);
        instructions.setBounds(695, 475, 285, 250);
        add(instructions);
    }
}
