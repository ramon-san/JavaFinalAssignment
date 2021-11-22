package com.oop.fa;

import com.oop.fa.controller.ConnectDB;
import com.oop.fa.view.MainView;

public class Main {

    public static void main(String[] args) {

        ConnectDB con = new ConnectDB();

        System.out.println("Program initialized.");
        MainView frame = new MainView();
        frame.setVisible(true);
    }
}
