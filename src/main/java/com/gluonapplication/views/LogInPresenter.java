package com.gluonapplication.views;

import com.gluonhq.charm.glisten.animation.BounceInRightTransition;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.layout.layer.FloatingActionButton;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.gluonapplication.GluonApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LogInPresenter {

    //@FXML
    //private View secondary;

    public void initialize() {
      /*  secondary.setShowTransitionFactory(BounceInRightTransition::new);
        
        secondary.getLayers().add(new FloatingActionButton(MaterialDesignIcon.INFO.text, 
            e -> System.out.println("Info")).getLayer());
        
        secondary.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = MobileApplication.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> 
                        MobileApplication.getInstance().showLayer(GluonApplication.MENU_LAYER)));
                appBar.setTitleText("Log In");
                <?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.layout.AnchorPane?><AnchorPane prefWidth="200.0" prefHeight="200.0" />
appBar.getActionItems().add(MaterialDesignIcon.FAVORITE.button(e -> 
                        System.out.println("Favorite")));
            }
        });
*/
    }

     
    @FXML
      private void goToChap(ActionEvent event){
          MobileApplication.getInstance().switchView(GluonApplication.CHAPTER_VIEW);
      }
      
}
