package com.oop.fa.view;

import javax.swing.*;
import java.awt.*;

public class SystemInstructions extends JPanel {
    JLabel title = new JLabel("Input data", SwingConstants.CENTER);
    JTextArea instructions = new JTextArea("This program reads data from a CSV file and displays it's information." +
           " If you click a disease button you'll see the histogram of people with that disease and if you give valid" +
           " inputs and click Enter in the Input Data section you'll see the probability of what you chose.");

    /* Constructor. */
    public SystemInstructions(){
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);

        title.setBounds(25, 25, 235, 25);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);
        instructions.setLineWrap(true);
        instructions.setWrapStyleWord(true);
        instructions.setBackground(Color.LIGHT_GRAY);
        instructions.setBounds(25,75,235,150);
        add(instructions);
    }
}
