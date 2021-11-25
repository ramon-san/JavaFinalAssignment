package com.oop.fa.model;

public class Probability {
    private float mean;

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


    public static void densityFunction(){

    }
}
