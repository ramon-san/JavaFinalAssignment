package com.oop.fa.view;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.ui.ApplicationFrame;
import javax.swing.JPanel;

public class Histogram extends ApplicationFrame {
    String title, xTitle, yTitle;
    double[] values;
    int bins;

    public Histogram(String title, String xTitle, String yTitle, double[] values, int bins){
        super("");
        this.title = title;
        this.xTitle = xTitle;
        this.yTitle = yTitle;
        this.values = values;
        this.bins = bins;
        makeHistogram();
    }

    public JPanel makeHistogram(){

        // Assign values to set
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Data", values, 10);

        JFreeChart histogram = ChartFactory.createHistogram(title, xTitle, yTitle, dataset, PlotOrientation.VERTICAL,
                true, true, false);
        ChartUtilities.applyCurrentTheme(histogram);
        ChartPanel chartPanel = new ChartPanel(histogram);

        return(chartPanel);
    }

}
