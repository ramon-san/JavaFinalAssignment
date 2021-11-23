package com.oop.fa;

import com.oop.fa.model.DBMS.ConnectDB;
import com.oop.fa.model.DBMS.QueriesDB;
import com.oop.fa.model.MainModel;
import com.oop.fa.view.MainView;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program initialized.\n");

        MainModel processManager = new MainModel();
        ConnectDB conn = new ConnectDB();
        QueriesDB queries = new QueriesDB();

        /* We get the DB result and close our connection. */
        processManager.setFullResult(queries.getFullResultSet(conn));
        conn.closeConnection();


        MainView frame = new MainView();
        frame.setVisible(true);

    }
}
