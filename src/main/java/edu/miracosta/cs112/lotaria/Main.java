package edu.miracosta.cs112.lotaria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;

import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class Main extends Application {
    //CONSTANTS
    private static final LoteriaCard[] LOTERIA_CARDS = {
            new LoteriaCard("Las matematicas", "1.png", 1),
            new LoteriaCard("Las ciencias", "2.png", 2),
            new LoteriaCard("Las Tecnologia", "8.png", 8),
            new LoteriaCard("Las ingenieria", "9.png", 9),
    };

    //ClASS-LEVEL-VARIABLES
    private Label messageLabel, titleLabel;
    private ImageView cardImageView;
    private Button drawCardButton;
//    private ProgressBar gameProgressBar;

    //GUI METHODS
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //INSTANTIATE COMPONENTS
        titleLabel = new Label("Welcom to EChale STEM Loteria!");
        cardImageView = new ImageView();
        messageLabel = new Label("Click the button to randomly draw a card. The progress bar will indicate how far we're into the game");
        drawCardButton = new Button("Draw Random Card");
//        gameProgressBar = new ProgressBar();

        //SET COMPONENT PROPERTIES
        titleLabel.setFont(new Font(18));

        LoteriaCard tempCard = new LoteriaCard();
        cardImageView.setImage(tempCard.getImage());
        cardImageView.setFitWidth(300);
        cardImageView.setPreserveRatio(true);
        messageLabel.setWrapText(true);
        messageLabel.setTextAlignment(TextAlignment.CENTER);

        //SETUP LAYOUT
        VBox mainLayout = new VBox();
        mainLayout.getChildren().addAll(titleLabel, cardImageView, messageLabel, drawCardButton);
        mainLayout.setAlignment(Pos.CENTER);

        //SETUP SCENE AND SHOW
        Scene scene = new Scene(mainLayout, 350, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("EChale STEM Loteria");
        primaryStage.show();
    }
}
