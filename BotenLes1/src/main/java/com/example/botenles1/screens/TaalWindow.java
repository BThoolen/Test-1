package com.example.botenles1.screens;

import com.example.botenles1.Applicatie;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

public class TaalWindow {
    private Scene talenScene;

    public TaalWindow() {

        FlowPane root = new FlowPane();

        Image imgPascal = new Image("file:src/main/java/com/example/botenles1/resources/images/Pascal.png");
        ImageView imgViewPascal = new ImageView(imgPascal);
        imgViewPascal.setFitHeight(300);
        imgViewPascal.setFitWidth(500);

        RadioButton rbNL = new RadioButton("Nederlands");

        RadioButton rbEN = new RadioButton("Engels");

        ToggleGroup tg = new ToggleGroup();
        rbNL.setToggleGroup(tg);
        rbEN.setToggleGroup(tg);

        rbEN.setOnAction(e->{

        });

        Button bevestig = new Button("Bevestig");

        bevestig.setOnAction(e->{
        Applicatie.setScene(0);

        });


        root.getChildren().addAll(imgViewPascal, rbNL, rbEN, bevestig);

        talenScene = new Scene(root, Applicatie.applicationSize[0], Applicatie.applicationSize[1]);

    }
    public Scene getTalenScene() { return talenScene; }
}
