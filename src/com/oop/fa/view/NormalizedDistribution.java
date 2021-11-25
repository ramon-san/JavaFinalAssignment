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
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

import javax.swing.JPanel;

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
     * @param size of the array we are using (data points).
     * @return graph panel or null if not a valid graph.
     */
    public JPanel makeNormalizedDistribution(double mean, double stdev, int size){

        // Assign plot
        NumberAxis xAxis = new NumberAxis("Age");
        xAxis.setAutoRangeIncludesZero(false);
        NumberAxis yAxis = new NumberAxis("Probability");
        yAxis.setAutoRangeIncludesZero(false);

        // Assign plot type.
        Function2D normal = new NormalDistributionFunction2D(mean, stdev);
        XYDataset dataset = DatasetUtilities.sampleFunction2D(normal, -10, 100, size, "Patient distribution");
        /*XYSeries cutLine = new XYSeries("cutLine");
        cutLine.add(40,0);
        ((XYSeriesCollection) dataset).addSeries(cutLine);*/
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        JFreeChart chart = new JFreeChart(title, JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        ChartUtilities.applyCurrentTheme(chart);
        ChartPanel chartPanel = new ChartPanel(chart);

        return (chartPanel);
    }
}
