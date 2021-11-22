package com.oop.fa.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class ThreeButtonsVertical extends JPanel {
    /* Create buttons. */
    public static JButton button1 = new JButton("EPOC");
    public static JButton button2 = new JButton("DIABETES");
    public static JButton button3 = new JButton("ASMA");

    public ThreeButtonsVertical(){
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);

        button1.setBounds(25, 25, 100,50);
        add(button1);
        button2.setBounds(25, 100, 100,50);
        add(button2);
        button3.setBounds(25, 175, 100,50);
        add(button3);
    }
}
