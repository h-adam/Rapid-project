/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gluonapplication.views;

import com.gluonhq.charm.glisten.animation.BounceInRightTransition;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.layout.layer.FloatingActionButton;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.gluonapplication.GluonApplication;
import com.gluonhq.charm.glisten.control.CharmListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Chapter2Sec2Presenter {

    ObservableList<String> sec3 = FXCollections.observableArrayList(
            "1. _______ is the code with natural language mixed with Java code.\n"
            + "a. Java program\n"
            + "b. A Java statement\n"
            + "c. Pseudocode  \n"
            + "d. A flowchart diagram",
            "2. What is the exact output of the following code?\n"
            + "\n"
            + "  double area = 3.5;\n"
            + "  System.out.print(\"area\");\n"
            + "  System.out.print(area);\n"
            + "\n"
            + "a.	3.53.5\n"
            + "b.	3.5 3.5\n"
            + "c. 	area3.5\n"
            + "d.       area 3.5"
    );

    @FXML
    private ListView chap2Sec2Q;

    public void initialize() {
        //System.out.println("here");
        chap2Sec2Q.setItems(sec3);
    }
}
