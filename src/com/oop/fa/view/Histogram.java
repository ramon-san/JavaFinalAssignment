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
    private double[] values;
    int bins;

    /* Constructor. */
    public Histogram(String title, String xTitle, String yTitle, double[] values, int bins){
        super("");
        this.title = title;
        this.xTitle = xTitle;
        this.yTitle = yTitle;
        this.values = values;
        this.bins = bins;
    }

    /* Setter and Getter functions. */
    public void setValues(double[] values) {
        this.values = values;
    }

    public JPanel makeHistogram(){

        // Assign values to set
        /*for(double d: values){
            System.out.println(d);
        }*/
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Data", values, bins);

        JFreeChart histogram = ChartFactory.createHistogram(title, xTitle, yTitle, dataset, PlotOrientation.VERTICAL,
                true, true, false);
        ChartUtilities.applyCurrentTheme(histogram);
        ChartPanel chartPanel = new ChartPanel(histogram);

        return(chartPanel);
    }

}
