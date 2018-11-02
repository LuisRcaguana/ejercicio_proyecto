package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private AnchorPane mypane;
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
		 
		 mypane = (AnchorPane) loader.load();
		 
		primaryStage.setTitle("aplicacion");
		primaryStage.setScene(new Scene(mypane));
		primaryStage.show();
		 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
