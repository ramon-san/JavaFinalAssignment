package com.oop.fa.view;

import javax.swing.*;
import java.awt.*;

public class TwoInputAndEnter extends JPanel {
    JLabel title = new JLabel("Input data", SwingConstants.CENTER);
    JLabel label1 = new JLabel("A:");
    public static JTextField fieldA = new JTextField("");
    JLabel label2 = new JLabel("B:");
    public static JTextField fieldB = new JTextField("");
    public static JButton enterButton = new JButton("Enter");
    public static JLabel message = new JLabel("Enter (A < B).");

    /* Constructor. */
    public TwoInputAndEnter(){
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);

        title.setBounds(25, 25, 120, 25);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);
        label1.setBounds(25,70,20,25);
        add(label1);
        fieldA.setBounds(45, 70,100,25);
        add(fieldA);
        label2.setBounds(25,120,20,25);
        add(label2);
        fieldB.setBounds(45,120,100,25);
        add(fieldB);
        enterButton.setBounds(45,165,100,40);
        add(enterButton);
        message.setBounds(25, 215, 120, 25);
        add(message);
    }
}
