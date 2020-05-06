package presentation;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.application.Application;

public class adminUI extends Application {
	
	Button lån;
	Button låneanmodning;
	Button sealger;
	
	private Scene scene;
    private Pane pane;
    private Image ferrari;
    private ImageView ferraripic;

    
    
    public static void main(String[] args) {
        launch(args);

	}
    public void start(Stage bubber123) {
        bubber123.setTitle("Ferrari is best");
        
        
        pane = new Pane();
        ferrari = new Image("https://3.bp.blogspot.com/-DRM75enaO7s/VDrpAiCm55I/AAAAAAAABGM/VnsBvuXIygU/s1600/Ferrari%2BCar%2Blogos.jpg%22");
        ferraripic = new ImageView();
        ferraripic.setImage(ferrari);
        
        
        
      // Button assignments
      lån = new Button("Lån");
      låneanmodning = new Button("Låne anmodninger");
      sealger = new Button("Opret Sælger");
       
      
      pane.setStyle("-fx-background-color: #ff2800");
      
      
      ferraripic.relocate(223,30);
      ferraripic.setFitWidth(300);
      ferraripic.setFitHeight(150);
      
      lån.setPrefHeight(62);
      lån.setPrefWidth(189);
      lån.relocate(274, 235);
      
      låneanmodning.setPrefHeight(62);
      låneanmodning.setPrefWidth(189);
      låneanmodning.relocate(274, 317);
      
      sealger.setPrefHeight(62);
      sealger.setPrefWidth(189);
      sealger.relocate(274, 404);
      
      
      pane.getChildren().add(ferraripic);
      pane.getChildren().add(låneanmodning);
      pane.getChildren().add(sealger);
      pane.getChildren().add(lån);
      
      
      scene = new Scene(pane, 755, 551);
      bubber123.setScene(scene);
      bubber123.show();
      
}
    
 
    
    
    
}
