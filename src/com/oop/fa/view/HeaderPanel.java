package com.oop.fa.view;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    int imageWidth = 300;
    int imageHeight = 130;
    JLabel logo = new JLabel();
    JLabel title = new JLabel("Proyecto final OOP 2021", SwingConstants.CENTER);
    /* We make the image the same size as the label. */
    ImageIcon originalFile = new ImageIcon("Logo_Ibero.jpg");
    Image image = originalFile.getImage();
    Image scaledImage = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
    ImageIcon scaledLogo = new ImageIcon(scaledImage);

    /* Constructor. */
    public HeaderPanel(){
        setLayout(null);
        title.setBounds(100, 100, 500,50);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setOpaque(true);
        title.setBackground(Color.LIGHT_GRAY);
        add(title);
        logo.setBounds(700, 20, imageWidth,imageHeight);
        logo.setIcon(scaledLogo);
        add(logo);

    }
}
