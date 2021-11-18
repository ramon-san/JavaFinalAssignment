package com.oop.fa.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame {
    int width = 1100;
    int height = 800;
    HeaderPanel header = new HeaderPanel();

    public MainView() {
        setLayout(null);
        setSize(width, height);
        setTitle("Proyecto Final");

        /* We now add the panels. */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        header.setBounds(0,0,width,150);
        add(header);
    }

}
