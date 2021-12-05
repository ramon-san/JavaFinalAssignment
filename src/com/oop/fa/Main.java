/**
 * This Main contains our main Java function.
 *
 * @version 1.0
 */
package com.oop.fa;

import com.oop.fa.controller.MainController;
import com.oop.fa.model.DBMS.ConnectDB;
import com.oop.fa.model.DBMS.QueriesDB;
import com.oop.fa.model.MainModel;
import com.oop.fa.view.MainView;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program initialized.\n");

        MainModel processManager = new MainModel();
        MainView frame = new MainView(processManager);
        MainController orchestrator = new MainController(frame, processManager); // Don't erase.

        /* We know connect to the DB. */
        ConnectDB conn = new ConnectDB();
        QueriesDB queries = new QueriesDB();
        /* We get the DB results and close our connection. */
        processManager.setFullResult(queries.getFullResultSet(conn));
        conn.closeConnection();

        frame.makeGraphs();
        frame.makeNormalizedGraph();
        frame.setVisible(true);
    }
}
