package com.oop.fa.model;

public class Probability {
    private float mean;

    /* Setters and Getters. */
    public void setMean(float mean) {
        this.mean = mean;
    }

    /**
     * This is a function that calculates the mean.
     *
     * @param values the array for which we're calculating the mean.
     * @return result of the mean.
     */
    public double mean(double ... values) {
        float sum = 0, mean = 0;

        for(double i: values){
            sum += i;
        }
        try {
            if (values.length == 0) {
                throw new Exception();
            } else {
                mean = sum/values.length;
            }
        } catch (Exception error) {
            System.out.println("Type: " + error.toString() + " (can't divide by zero, void array)");
        }
        setMean(mean);

        return(mean);
    }

    /**
     * This function calculates the standard deviation.
     *
     * @param values numbers of our data set.
     * @return standard deviation of these calculations.
     */
    public double stdev(double ... values) {
        double sum = 0, stdev = 0;

        for (double i: values) {
            sum += Math.pow((i-mean), 2);
        }
        stdev = Math.sqrt(sum/(values.length-1));

        return(stdev);
    }

    /**
     * This method calculates the density function of the given data. The result is given as a percentage.
     *
     * @param mean of our data set.
     * @param stdev of our data set.
     * @param lowerLimit of our probability.
     * @param upperLimit of our probability.
     * @return result of our density function as a percentage, this is the probability.
     */
    public static double densityFunction(double mean, double stdev, int lowerLimit, int upperLimit) {
        double delta = .001, integral = 0, result = 0, zValue = 0;

        for (double i = lowerLimit; i <= upperLimit; i += delta) {
            zValue = (i-mean)/stdev;
            integral += (Math.exp(-.5*(Math.pow(zValue, 2))));
        }
        result = ((1/(stdev*Math.sqrt(2*Math.PI)))*integral)/10;

        return(result);
    }
}
