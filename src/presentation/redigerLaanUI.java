package presentation;



	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.Pane;
	import javafx.scene.text.Font;
	import javafx.stage.Stage;
	 

	public class redigerLaanUI extends Application {
	   
	    TextField Navn;
	    TextField Adresse;
	    TextField Tlfnr;
	    TextField CPRNR;
	    TextField Mail;
	    TextField Bilnavn;
	    TextField Bilpris;
	    TextField Tilbudspris;
	    TextField Lånslængde;
	    Button Redigerlån;
	    
	    private Scene scene3;
	    private Pane pane3;
	    private Image ferrari;
	    private ImageView ferraripic;
//	    private BorderPane borderpane3;

	 

	    public static void main(String[] args) {
	        launch(args);

	 

	    }

	 
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
	        ferrari = new Image("https://3.bp.blogspot.com/-DRM75enaO7s/VDrpAiCm55I/AAAAAAAABGM/VnsBvuXIygU/s1600/Ferrari%2BCar%2Blogos.jpg%22"); 
	        pane3.setPrefHeight(670.0);
	        ferraripic = new ImageView();
	    //    borderpane3 = new BorderPane();

	 

	        // Button assignments
	        Redigerlån = new Button("Opdater Lån");
	      
	        Navn = new TextField();
	        Adresse = new TextField();
	        Tlfnr = new TextField();
	        CPRNR = new TextField();
	        Mail = new TextField();
	        Bilnavn = new TextField();
	        Bilpris = new TextField();
	        Tilbudspris = new TextField();
	        Lånslængde = new TextField();
	       
	        
	        Navn.relocate(298.0, 225.0);
	        Navn.setPrefHeight(25.0);
	        Navn.setPrefWidth(321.0);
	        Adresse.relocate(298.0,250.0);
	        Adresse.setPrefHeight(25.0);
	        Adresse.setPrefWidth(321.0);
	        Tlfnr.relocate(298.0, 275.0);
	        Tlfnr.setPrefHeight(25.0);
	        Tlfnr.setPrefWidth(321.0);
	        CPRNR.relocate(298, 300.0);
	        CPRNR.setPrefHeight(25.0);
	        CPRNR.setPrefWidth(321.0);
	        Mail.relocate(298, 325);
	        Mail.setPrefHeight(25.0);
	        Mail.setPrefWidth(321.0);
	        Bilnavn.relocate(298, 350);
	        Bilnavn.setPrefHeight(25.0);
	        Bilnavn.setPrefWidth(321.0);
	        Bilpris.relocate(298, 375);
	        Bilpris.setPrefHeight(25.0);
	        Bilpris.setPrefWidth(321.0);
	        Tilbudspris.relocate(298, 400);
	        Tilbudspris.setPrefHeight(25.0);
	        Tilbudspris.setPrefWidth(321.0);
	        Lånslængde.relocate(298, 425);
	        Lånslængde.setPrefHeight(25.0);
	        Lånslængde.setPrefWidth(321.0);
	 

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

	        ferraripic.setFitWidth(350);
	        ferraripic.setFitHeight(175);
	        ferraripic.setImage(ferrari);
	        ferraripic.relocate(285, 30);
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
	       
	        pane3.setPrefWidth(930.0);
	        Redigerlån.relocate(347.0, 464.0);
	        Redigerlån.setPrefHeight(51.0);
	        Redigerlån.setPrefWidth(223.0);
	      
	        
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
	     
	       label2.setPrefHeight(17);
	       label2.setPrefWidth(80.9472);
	       label2.relocate(669, 523);
	        pane3.setStyle("-fx-background-color: #ff2800");
	      //  label2.setStyle("-fx-background-color: #ff0000");
	     
	       Redigerlån.setFont(new Font(12));
	       label2.setFont(new Font(12));

	        // Add to pane
	   //     pane3.getChildren().add(vbox);
	       	pane3.getChildren().add(ferraripic);
	        pane3.getChildren().add(label2);
	        pane3.getChildren().add(Mail);
	        pane3.getChildren().add(CPRNR);
	        pane3.getChildren().add(Navn);
	        pane3.getChildren().add(Tlfnr);
	        pane3.getChildren().add(Adresse);
	        pane3.getChildren().add(Bilnavn);
	        pane3.getChildren().add(Bilpris);
	        pane3.getChildren().add(Tilbudspris);
	        pane3.getChildren().add(Lånslængde);
	        pane3.getChildren().add(Redigerlån);
	        
	        //borderpane3.getChildren().add(pane3);
	        // Show scene
	        scene3 = new Scene(pane3, 930, 670);
	        bubber123.setScene(scene3);
	        bubber123.show();
	    }

	 

	}

