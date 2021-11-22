package com.oop.fa.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame {
    int width = 1100;
    int height = 800;
    HeaderPanel header = new HeaderPanel();
    ThreeButtonsVertical buttons = new ThreeButtonsVertical();
    double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 13, 67,
            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
            77, 44, 58, 91, 10, 67, 57, 19, 88, 84
    };
    Histogram ageHistogram = new Histogram("Age Histogram", "Age", "Population", values, 10);
    JPanel ageHistogramGraph = new JPanel();
    Histogram diseaseHistogram = new Histogram("Diseas Histogram", "Age", "Population", values, 15);
    JPanel diseaseHistogramGraph = new JPanel();
    TwoInputAndEnter inputs = new TwoInputAndEnter();
    NormalizedDistribution distribution = new NormalizedDistribution("Example");
    JPanel distributionGraph = new JPanel();
    SystemInstructions instructions = new SystemInstructions();

    public MainView() {
        setLayout(null);
        setSize(width, height);
        setTitle("Proyecto Final");

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
