package com.example.botenles1.screens;

import com.example.botenles1.Applicatie;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

public class HomeWindow {
private Scene homeScene;

public HomeWindow() {

    Pane root = new Pane();

    Image imgPascal = new Image("file:src/main/java/com/example/botenles1/resources/images/Pascal.png");
    ImageView imgViewPascal = new ImageView(imgPascal);
    imgViewPascal.setFitHeight(500);
    imgViewPascal.setFitWidth(300);

    Label title = new Label("Roeiboten vereniging");
    title.setStyle("-fx-font-size: 50px");
    title.relocate(100, 100);

    Button btnHulp = new Button("Hulp");
    btnHulp.setStyle("-fx-background-color: blue; -fx-font-size: 45px; -fx-background-radius: 10px;-fx-text-fill: #000000; -fx-font-family: sans-serif;");
    btnHulp.relocate(400, 700);


    Button btnOverzicht = new Button("Overzicht");
    btnOverzicht.setStyle("-fx-background-color: blue; -fx-font-size: 45px; -fx-background-radius: 10px;-fx-text-fill: #000000; -fx-font-family: sans-serif;");
    btnOverzicht.relocate(400, 800);


    Button btnTalen = new Button("Talen");
    btnTalen.setStyle("-fx-background-color: blue; -fx-font-size: 45px; -fx-background-radius: 10px;-fx-text-fill: #000000; -fx-font-family: sans-serif;");
    btnTalen.relocate(600, 900);


    btnTalen.setOnAction(e -> {
        Applicatie.setScene(1);
    });


    root.getChildren().addAll(imgViewPascal, title, btnHulp, btnOverzicht, btnTalen);

    homeScene = new Scene(root, Applicatie.applicationSize[0], Applicatie.applicationSize[1]);

}
    public Scene getHomeScene() { return homeScene; }
}
