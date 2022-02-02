package com.example.botenles1;

import com.example.botenles1.screens.HomeWindow;
import com.example.botenles1.screens.TaalWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class Applicatie extends Application {

    private static Stage mainStage;
    private static ArrayList<Scene> scenes = new ArrayList<>();

    public static int[] applicationSize = {1200, 600};

    public static void main(String[] args) {launch(args); }


    @Override
    public void start(Stage primaryStage) {

        scenes.add(new HomeWindow().getHomeScene()); //0
        scenes.add(new TaalWindow().getTalenScene());  //1



        mainStage = primaryStage;
        mainStage.setResizable(false);
        mainStage.setTitle("Watersportvereniging Arne");
        mainStage.show();

        setScene(0);
    }

    public static Stage getMainStage() {
        return mainStage;
    }

    public static void setScene(int scene) {mainStage.setScene(scenes.get(scene));}
}