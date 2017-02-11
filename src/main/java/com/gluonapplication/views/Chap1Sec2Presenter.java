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

public class Chap1Sec2Presenter {

    ObservableList<String> sec2 = FXCollections.observableArrayList(
            "1. ________ is the physical aspect of the computer that can be seen.\n"
            + "a. Hardware\n"
            + "b. Software\n"
            + "c. Operating system\n"
            + "d. Application program",
            "2. __________ is the brain of a computer. \n"
            + "a. Hardware\n"
            + "b. CPU\n"
            + "c. Memory\n"
            + "d. Disk",
            "3. The speed of the CPU may be measured in __________. \n"
            + "a. megabytes\n"
            + "b. gigabytes\n"
            + "c. megahertz\n"
            + "d. gigahertz",
            "4. Why do computers use zeros and ones?\n"
            + "a. because combinations of zeros and ones can represent any numbers and characters.\n"
            + "b. because digital devices have two stable states and it is natural to use one state for 0 and the other for 1.\n"
            + "c. because binary numbers are simplest.\n"
            + "d. because binary numbers are the bases upon which all other number systems are built.",
            "5. One byte has ________ bits.\n"
            + "a. 4\n"
            + "b. 8\n"
            + "c. 12\n"
            + "d. 16",
            "6. Which of the following is not permanent storage devices?\n"
            + "a. floppy disk\n"
            + "b. hard disk\n"
            + "c. flash stick\n"
            + "d. CD-ROM\n"
            + "e. main memory",
            "7. ____________ is a device to connect a computer to a local area network (LAN).\n"
            + "a. Regular modem\n"
            + "b. DSL\n"
            + "c. Cable modem\n"
            + "d. NIC"
    );

    @FXML
    private ListView chap1Sec2Q;

    public void initialize() {
        chap1Sec2Q.setItems(sec2);
    }
    /*
    @FXML
    void click(Event event){
        
    }
     */
}
