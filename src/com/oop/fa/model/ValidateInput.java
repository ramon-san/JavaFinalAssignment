package com.oop.fa.model;

import com.oop.fa.view.TwoInputAndEnter;

public class ValidateInput {

    /**
     * This function validates the user input and returns an int when done correctly.
     *
     * @param input from the user.
     * @return int value of the given input, if input is not valid return -1.
     */
    public static int validateInt(String input){
        input = input.replaceAll("[^0-9]", "");
        try {
            int numberInput = Integer.parseInt(input);
            if (numberInput >= 0 && numberInput <= 100) {
                return (numberInput);
            } else {
                TwoInputAndEnter.message.setText("Has to be 0 - 100");
                return (-1);
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR (NaN): " + e);
            return (-1);
        }
    }
}
