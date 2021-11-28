package com.oop.fa.view;

import com.oop.fa.model.DataAnalysis;
import com.oop.fa.model.MainModel;
import com.oop.fa.model.Probability;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;

public class MainView extends JFrame {
    MainModel mainModel;
    int width = 1100;
    int height = 800;
    HeaderPanel header = new HeaderPanel();
    ThreeButtonsVertical buttons = new ThreeButtonsVertical();
    SystemInstructions instructions = new SystemInstructions();
    TwoInputAndEnter inputs = new TwoInputAndEnter();

    /* We create our graphs. */
    public Histogram allHistogram, epocHistogram, diabetesHistogram, asmaHistogram;
    public NormalizedDistribution distribution = new NormalizedDistribution("Normalized Graph");
    public JPanel allHistogramGraph, epocHistogramGraph, diabetesHistogramGraph, asmaHistogramGraph, distributionGraph;

    public MainView(MainModel mainModel) {
        setLayout(null);
        setSize(width, height);
        setTitle("Final Assignment");

        this.mainModel = mainModel;
        /* We now add the panels. */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        header.setBounds(0,0,width,150);
        add(header);
        buttons.setBounds(475, 200, 150, 250);
        add(buttons);
        inputs.setBounds(125, 475, 170, 250);
        add(inputs);
        instructions.setBounds(695, 475, 285, 250);
        add(instructions);
    }

    /**
     * In this function we create all our static graphs.
     *
     */
    public void makeGraphs () {
        /* Epoc histogram creation and implementation. */
        ArrayList<Byte> epocByteResult = (DataAnalysis.listExtraction(mainModel.getFullResult(), "Epoc"));
        double[] epocResult = epocByteResult.stream().mapToDouble(Byte::doubleValue).toArray();
        epocHistogram = new Histogram("Epoc Histogram", "Age", "Population", epocResult, 10);
        epocHistogramGraph = epocHistogram.makeHistogram();

        /* Asma histogram creation. */
        ArrayList<Byte> asmaByteResult = (DataAnalysis.listExtraction(mainModel.getFullResult(), "Asma"));
        double[] asmaResult = asmaByteResult.stream().mapToDouble(Byte::doubleValue).toArray();
        asmaHistogram = new Histogram("Asma Histogram", "Age", "Population", asmaResult, 10);
        asmaHistogramGraph = asmaHistogram.makeHistogram();

        /* Diabetes histogram creation. */
        ArrayList<Byte> diabetesByteResult = (DataAnalysis.listExtraction(mainModel.getFullResult(), "Diabetes"));
        double[] diabetesResult = diabetesByteResult.stream().mapToDouble(Byte::doubleValue).toArray();
        diabetesHistogram = new Histogram("Diabetes Histogram", "Age", "Population", diabetesResult, 10);
        diabetesHistogramGraph = diabetesHistogram.makeHistogram();

        /* Basic histogram created and added to the interface. */
        ArrayList<Byte> allByteResult = (DataAnalysis.listExtraction(mainModel.getFullResult(), "All"));
        double[] allResult = allByteResult.stream().mapToDouble(Byte::doubleValue).toArray();
        allHistogram = new Histogram("Patient Histogram", "Age", "Population", allResult, 10);
        allHistogramGraph = allHistogram.makeHistogram();
        allHistogramGraph.setBounds(125, 200, 300,250);
        add(allHistogramGraph);
    }

    /**
     * In this function we create our first normalized graph and assign values to our mean, stdev, and dataSize
     * attributes from the mainModel instance.
     *
     */
    public void makeNormalizedGraph () {
        Probability probability = new Probability();
        ArrayList<Byte> allByteResult = (DataAnalysis.listExtraction(mainModel.getFullResult(), "All"));
        double[] allResult = allByteResult.stream().mapToDouble(Byte::doubleValue).toArray();
        mainModel.setMean(probability.mean(allResult));
        mainModel.setStdev(probability.stdev(allResult));
        mainModel.setDataSize(allByteResult.size());
        distributionGraph = distribution.makeNormalizedDistribution(mainModel.getMean(), mainModel.getStdev(),
                mainModel.getDataSize());
        distributionGraph.setBounds(345, 475, 300, 250);
        add(distributionGraph);
    }

    /**
     * This function changes the normalized graph in display.
     *
     * @param newGraph that we want to display.
     */
    public void changeNormalizedGraph(JPanel newGraph) {
        remove(distributionGraph);
        distributionGraph = newGraph;
        distributionGraph.setBounds(345, 475, 300, 250);
        add(distributionGraph);
    }
}
