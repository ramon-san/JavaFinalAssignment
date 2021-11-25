package com.oop.fa.view;

import javax.swing.*;
import java.awt.*;

public class TwoInputAndEnter extends JPanel {
    JLabel title = new JLabel("Input data", SwingConstants.CENTER);
    JLabel label1 = new JLabel(">");
    public static JTextField field1 = new JTextField("");
    JLabel label2 = new JLabel("<");
    public static JTextField field2 = new JTextField("");
    public static JButton enterButton = new JButton("Enter");
    public static JLabel message = new JLabel("Enter one input.");

    public TwoInputAndEnter(){
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);

        title.setBounds(25, 25, 120, 25);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title);
        label1.setBounds(25,70,20,25);
        add(label1);
        field1.setBounds(45, 70,100,25);
        add(field1);
        label2.setBounds(25,120,20,25);
        add(label2);
        field2.setBounds(45,120,100,25);
        add(field2);
        enterButton.setBounds(45,165,100,40);
        add(enterButton);
        message.setBounds(25, 215, 120, 25);
        add(message);
    }
}
