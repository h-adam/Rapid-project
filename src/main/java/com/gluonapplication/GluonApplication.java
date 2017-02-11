package com.gluonapplication;

import com.gluonapplication.views.Chapter1Sec2;
import com.gluonapplication.views.Chapter1View;
import com.gluonapplication.views.Chapter2Sec2;
import com.gluonapplication.views.Chapter2View;
import com.gluonapplication.views.ChapterSelectionView;
import com.gluonapplication.views.Start_PageView;
import com.gluonapplication.views.LogIn;
import com.gluonapplication.views.SectionsView;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.layout.layer.SidePopupView;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class GluonApplication extends MobileApplication {

     public static final String START_PAGE_VIEW = HOME_VIEW;
     public static final String SECONDARY_VIEW = "Log In";
     public static final String MENU_LAYER = "Side Menu";
     public static final String CHAPTER_VIEW = "Chapter Selection";
     public static final String CHAPTER1 = "Chapter 1";
     public static final String CHAPTER2 = "Chapter 2";
     public static final String SECTIONS = "SECTIONS";
     public static final String CHAPTER1SEC2 = "Chapter 1 Section 2";
     public static final String CHAPTER2SEC2 = "Chapter 2 Section 2";
    
    @Override
    public void init() {
       addViewFactory(START_PAGE_VIEW, () -> new Start_PageView(START_PAGE_VIEW).getView());
       addViewFactory(SECONDARY_VIEW, () -> new LogIn(SECONDARY_VIEW).getView());
       //addLayerFactory(MENU_LAYER, () -> new SidePopupView(new DrawerManager().getDrawer()));
       addViewFactory(CHAPTER_VIEW, () -> new ChapterSelectionView(CHAPTER_VIEW).getView());
       addViewFactory(SECTIONS, () -> new SectionsView(SECTIONS).getView());
       addViewFactory(CHAPTER1, () -> new Chapter1View(CHAPTER1).getView());
       addViewFactory(CHAPTER2, () -> new Chapter2View(CHAPTER2).getView());
       addViewFactory(CHAPTER1SEC2, () -> new Chapter1Sec2(CHAPTER1SEC2).getView());
       addViewFactory(CHAPTER2SEC2, () -> new Chapter2Sec2(CHAPTER2SEC2).getView());
    }

    @Override
    public void postInit(Scene scene) {
        Swatch.BLUE.assignTo(scene);

        scene.getStylesheets().add(GluonApplication.class.getResource("style.css").toExternalForm());
        ((Stage) scene.getWindow()).getIcons().add(new Image(GluonApplication.class.getResourceAsStream("/icon.png")));
    }
    
    
    
    
}
