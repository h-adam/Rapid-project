package com.gluonapplication.views;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.gluonapplication.GluonApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.gluonapplication.views.LogIn;
import com.gluonapplication.views.LogInPresenter;


public class Start_PagePresenter {

    @FXML
    private View start_page;
    
    @FXML
    private Label label;

    public void initialize() {
        /*start_page.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = MobileApplication.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> 
                        MobileApplication.getInstance().showLayer(GluonApplication.MENU_LAYER)));
                appBar.setTitleText("Start_Page");
                appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> 
                        System.out.println("Search")));
            }
        });
           */
    }
    
    @FXML
    private void LogInClick(ActionEvent event) {
        MobileApplication.getInstance().switchView(GluonApplication.SECONDARY_VIEW);
        
    }
  
    
    
    
}
