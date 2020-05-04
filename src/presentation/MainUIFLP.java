package presentation;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import db.Datakobling;
import db.OpretLoginDB;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import db.Kunde;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
 

public class MainUIFLP extends Application {
    TextField søg;
    TextField Navn;
    TextField Adresse;
    TextField Tlfnr;
    TextField CPRNR;
    TextField Mail;
    TextField Bilnavn;
    TextField Bilpris;
    TextField Tilbudspris;
    TextField Lånslængde;
    Button Opretetlån;
    Button Redigeretlån;
    Button Fjernetlån;
    private Scene scene3;
    private Pane pane3;
//    private BorderPane borderpane3;

 

    public static void main(String[] args) {
        launch(args);

 

    }

 
    @Override
    public void start(Stage bubber123) {
        bubber123.setTitle("Ferrari is best");

       // primaryStage.setTitle("TextArea Experiment 1");
       // TextArea textArea = new TextArea();
       //  VBox vbox = new VBox(textArea);

       // Scene scene = new Scene(vbox, 200, 100);
      //  primaryStage.setScene(scene);
       
        // signupKnap.setText("Opret Login");
        // loginKnap.setText("Login");

 

        Label label1 = new Label();
        Label label2 = new Label("logget in som...");
        label2.relocate(669.0, 523.0);
        pane3 = new Pane();
    //    borderpane3 = new BorderPane();

 

        // Button assignments
        Opretetlån = new Button("Opret et lån");
        Redigeretlån = new Button("Rediger et lån");
        Navn = new TextField();
        Adresse = new TextField();
        Tlfnr = new TextField();
        CPRNR = new TextField();
        Mail = new TextField();
        Bilnavn = new TextField();
        Bilpris = new TextField();
        Tilbudspris = new TextField();
        Lånslængde = new TextField();
        søg = new TextField();
        Fjernetlån = new Button("Fjern et lån");

 

        // pane.setPrefHeight(800);
        // pane.setPrefWidth(600);
        // pane.setBackground(value);

 

/*        Opretetlån.setPrefHeight(30);
        Opretetlån.setPrefWidth(214);
        søg.setPromptText("Søg");
        Redigeretlån.setPrefHeight(30);
        Redigeretlån.setPrefWidth(214);
        Fjernetlån.setPrefHeight(30);
        Fjernetlån.setPrefWidth(214); */

 

        pane3.setPrefHeight(556);
        pane3.setPrefWidth(842);

 

        //borderpane3.setPrefHeight(554);
        //borderpane3.setPrefWidth(841);

 

        // borderpane.getAlignment("CENTER");
        //borderpane3.setPrefHeight(554.0);
        //borderpane3.setPrefWidth(841.0);
        // borderpane.relocate(-1.0, -5.0);
     /*   VBox vbox = new VBox(Navn,Adresse,Tlfnr,CPRNR, Mail,Bilnavn,Bilpris,Tilbudspris,Lånslængde);
        vbox.relocate(358, 75);
        vbox.setPrefHeight(242);
  /      vbox.setPrefWidth(375);
   
   */
        
        pane3.setPrefHeight(556.0);
        pane3.setPrefWidth(842.0);
        Opretetlån.relocate(44.0, 475.0);
        Opretetlån.setPrefHeight(25);
        Opretetlån.setPrefWidth(100);
        Redigeretlån.setPrefHeight(25);
        Redigeretlån.setPrefWidth(100);
        Redigeretlån.relocate(150.0, 475.0);
        Fjernetlån.relocate(254.0, 475.0);
        Fjernetlån.setPrefHeight(25);
        Fjernetlån.setPrefWidth(100);
       // Adresse.relocate(arg0, arg1);
        Lånslængde.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        Tilbudspris.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        Bilpris.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        Bilnavn.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        Mail.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        CPRNR.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        Tlfnr.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        Adresse.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        Navn.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        
        Lånslængde.setPromptText("Lånets længde");
        Tilbudspris.setPromptText("Tilbudspris");
        Bilpris.setPromptText("Bilpris");
        Bilnavn.setPromptText("Bilnavn");
        Mail.setPromptText("Mail");
        CPRNR.setPromptText("CPR-nr");
        Tlfnr.setPromptText("Tlf.nr");
        Adresse.setPromptText("Adresse");
        Navn.setPromptText("Navn");
        søg.setPromptText("Søg");
        søg.relocate(27, 61);
        søg.setPrefHeight(25);
        søg.setPrefWidth(148.5078);
       label2.setPrefHeight(17);
       label2.setPrefWidth(80.9472);
       label2.relocate(669, 523);
        pane3.setStyle("-fx-background-color: #ff2800");
      //  label2.setStyle("-fx-background-color: #ff0000");
       Redigeretlån.setFont(new Font(12));
      Fjernetlån.setFont(new Font(12));
       Opretetlån.setFont(new Font(12));
       label2.setFont(new Font(12));

        // Add to pane
   //     pane3.getChildren().add(vbox);
        pane3.getChildren().add(label2);
        pane3.getChildren().add(Redigeretlån);
        pane3.getChildren().add(Opretetlån);
        pane3.getChildren().add(Fjernetlån);
        pane3.getChildren().add(søg);
        //borderpane3.getChildren().add(pane3);
        // Show scene
        scene3 = new Scene(pane3, 824, 556);
        bubber123.setScene(scene3);
        bubber123.show();
    }

 

}