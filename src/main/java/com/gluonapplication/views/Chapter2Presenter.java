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

public class Chapter2Presenter {
    
    ObservableList<String> chap2 = FXCollections.observableArrayList(
    "Section 2.2 Elementary Programming", "Section 2.3 Reading Input from the Console", 
            "Section 2.4 Identifiers", "Section 2.5 Variables",
            "Section 2.6 Assignment Statements and Assignment Expressions", 
            "Section 2.7 Named Constants", 
            "Section 2.8 Naming Conventions", 
            "Section 2.9 Numeric Data Types and Operations",
            "Section 2.10 Numeric Literals",
            "Section 2.11 Evaluating Expressions and Operator Precedence",
            "Section 2.12 Case Study: Displaying the Current Time",
            "Section 2.13 Augmented Assignment Operators",
            "Section 2.14 Increment and Decrement Operators",
            "Section 2.15 Numeric Type Conversions",
            "Section 2.16 Software Life Cycle",
            "Section 2.18 Common Errors and Pitfalls");
    
    @FXML
    private ListView chapter2SectionsList;
    
    public void initialize(){
        chapter2SectionsList.setItems(chap2);  
    }
    
    @FXML
    void secClick(Event event){
        if(chapter2SectionsList.getSelectionModel().getSelectedIndex() == 0){
            MobileApplication.getInstance().switchView(GluonApplication.CHAPTER2SEC2);
            //System.out.println(chapter2SectionsList.getSelectionModel().getSelectedIndex());
    }
    }
}
