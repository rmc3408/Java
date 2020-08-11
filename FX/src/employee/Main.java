package employee;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	// Save data from objects
	private Stage primaryStage;
	private BorderPane mainLay;
	
	
	@Override
	public void start(Stage stOne) throws IOException {
		// the object will be set to stage Start.
		
		this.primaryStage = stOne; //assign 
		this.primaryStage.setTitle("My First Scene Builder"); //title
		
		// Load View in Start Method to show Pane.
		showMainView();
		showBtnView();
		
	}
	
	public void showMainView() throws IOException {
		//this object create a loader for FXML MainView
		FXMLLoader myloader = new FXMLLoader();
		
		//describe location of the file
		//load in MainClass the resource main/view
		myloader.setLocation(Main.class.getResource("view/MainView.fxml"));
		
		//this layout will be load and styled in borderPane type.
		mainLay = myloader.load();
		
		
		//Once defined, load in Scene. And after into Stage
		Scene s1 = new Scene(mainLay);
		primaryStage.setScene(s1);
		primaryStage.show();
		
	}
	
	public void showBtnView() throws IOException {
		//create a loader for FXML
		FXMLLoader myloader = new FXMLLoader();
		
		//load in MainClass the resource mMain ItEM
		myloader.setLocation(Main.class.getResource("view/MainItem.fxml"));
		
		//this layout will be load and styled in borderPane type.
		BorderPane item = myloader.load();
		
		//TODO Scene is already created.
		//this layout will be load and styled in borderPane type.
		mainLay.setCenter(item);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
