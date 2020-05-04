package presentation;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;


	public class Main extends Application {
		
		
		
	    
	    @Override
	    public void start(Stage primaryStage) {
	    	try {
	    	Parent root = FXMLLoader.load(getClass().getResource("loginUI.fxml"));
	      
	    	Scene scene = new Scene(root);
	    	primaryStage.setScene(scene);
	    	primaryStage.setTitle("Ferrari login");
	    	primaryStage.show();
	            
	    } catch(Exception e) {
	    	e.printStackTrace(); }
	    }
	 
	   

	
	    public static void main(String[] args) {
	        launch(args);
	    }
	    }
	
	
