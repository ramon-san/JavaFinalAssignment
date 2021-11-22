package com.oop.fa.view;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.NormalDistributionFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;

public class NormalizedDistribution extends ApplicationFrame {
    String title;

    public NormalizedDistribution(String title) {
        super("");
        this.title = title;
    }

    /**
     * This function makes a normalized distribution graph.
     *
     * @param mean of the data points we're using.
     * @param stdev of the data points we're using.
     * @return graph panel or null if not a valid graph.
     */
    public JPanel makeNormalizedDistribution(double mean, double stdev){

        // Assign plot
        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setAutoRangeIncludesZero(false);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setAutoRangeIncludesZero(false);

        // Assign plot type.
        Function2D normal = new NormalDistributionFunction2D(mean, stdev);
        XYDataset dataset = DatasetUtilities.sampleFunction2D(normal, -5, 5, 100, "Series #");
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        JFreeChart chart = new JFreeChart(title, JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        ChartUtilities.applyCurrentTheme(chart);
        ChartPanel chartPanel = new ChartPanel(chart);

        return (chartPanel);
    }
}
