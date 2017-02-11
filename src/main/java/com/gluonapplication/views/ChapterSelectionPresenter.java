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


/**
 *
 * @author Asian
 */
public class ChapterSelectionPresenter {
    
    ObservableList<String> chap = FXCollections.observableArrayList(
    "Chapter 1: Introduction to Computers, Programs, and Java",
            "Chapter 2: Elementary Programming",
            "Chapter 3: Selections", 
            "Chapter 4: Mathematical Functions, Characters, and Strings",
            "Chapter 5: Title",
            "Chapter 6: Title",
            "Chapter 7: Title",
            "Chapter 8: Title",
            "Chapter 9: Title",
            "Chapter 10: Title",
            "Chapter 11: Title",
            "Chapter 12: Title",
            "Chapter 13: Title",
            "Chapter 14: Title",
            "Chapter 15: Title",
            "Chapter 16: Title",
            "Chapter 17: Title",
            "Chapter 18: Title",
            "Chapter 19: Title",
            "Chapter 20: Title",
            "Chapter 21: Title",
            "Chapter 22: Title",
            "Chapter 23: Title",
            "Chapter 24: Title",
            "Chapter 25: Title",
            "Chapter 26: Title",
            "Chapter 27: Title",
            "Chapter 28: Title",
            "Chapter 29: Title",
            "Chapter 30: Title",
            "Chapter 31: Title",
            "Chapter 32: Title",
            "Chapter 33: Title",
            "Chapter 34: Title",
            "Chapter 35: Title"
          );
    
    
   // @FXML
    //private CharmListView<String, String> ChapSelect;
    
    @FXML
    private ListView chapterList;
    
    public void initialize(){
        chapterList.setItems(chap);
        
        
    }
    
    /*@FXML
    void chapClick(ActionEvent event){
        System.out.println(ChapSelect.getSelectedItem().toString());
    }
    */
    @FXML
    void touch(Event event){
        //System.out.println(chapterList.getSelectionModel().getSelectedIndex());
        if(chapterList.getSelectionModel().getSelectedIndex() == 0){
            MobileApplication.getInstance().switchView(GluonApplication.CHAPTER1);
        }
        else if(chapterList.getSelectionModel().getSelectedIndex() == 1){
            MobileApplication.getInstance().switchView(GluonApplication.CHAPTER2);
        }
    }
}
