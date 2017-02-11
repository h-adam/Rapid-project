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

public class Chapter1Presenter {
    
    ObservableList<String> chap1 = FXCollections.observableArrayList(
    "Section 1.2 What is a Computer?", "Section 1.3 Program Languages", 
            "Section 1.4 Operating Systems", "Section 1.5 Java, World Wide Web, and Beyond",
            "Section 1.6 The Java Language Specification, API, JDK, and IDE", 
            "Section 1.7 A Simple Java Program", 
            "Section 1.8 Creating, Compiling, and Executing a Java Program", 
            "Section 1.9 Programming Style and Documentation",
            "Section 1.10 Programming Errors");
    
    @FXML
    private ListView chapter1SectionsList;
    
    public void initialize(){
        chapter1SectionsList.setItems(chap1);       
    }
    
    @FXML
    void secClick(Event event){
        if(chapter1SectionsList.getSelectionModel().getSelectedIndex() == 0){
            MobileApplication.getInstance().switchView(GluonApplication.CHAPTER1SEC2);
        }
    }
    
}
