package com.oop.fa.model;

import com.oop.fa.view.TwoInputAndEnter;

public class ValidateInput {

    public static int validateInt(String input){
        input = input.replaceAll("[^0-9]", "");
        int numberInput = Integer.parseInt(input);
        if (numberInput >= 0 && numberInput <= 100){
            return(numberInput);
        } else {
            TwoInputAndEnter.message.setText("Has to be 0 - 100");
            return(-1);
        }
    }
}
