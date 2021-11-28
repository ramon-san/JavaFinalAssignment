package com.oop.fa.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class ThreeButtonsVertical extends JPanel {
    /* Create buttons. */
    public static JButton buttonEpoc = new JButton("EPOC");
    public static JButton buttonDiabetes = new JButton("DIABETES");
    public static JButton buttonAsma = new JButton("ASMA");

    /* Constructor. */
    public ThreeButtonsVertical(){
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);

        buttonEpoc.setBounds(25, 25, 100,50);
        add(buttonEpoc);
        buttonDiabetes.setBounds(25, 100, 100,50);
        add(buttonDiabetes);
        buttonAsma.setBounds(25, 175, 100,50);
        add(buttonAsma);
    }
}
