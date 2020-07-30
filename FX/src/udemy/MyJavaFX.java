package udemy;

import javafx.application.Application; //to launch GUI
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MyJavaFX extends Application {
	
	
	@Override
	public void start(Stage stagePrimary) {
		Button btnOk = new Button("OK");
		Scene scene = new Scene(btnOk, 200, 300);
		stagePrimary.setTitle("Main myJava FX");
		stagePrimary.setScene(scene);
		stagePrimary.show();
		
		Stage stage2 = new Stage();
		stage2.setTitle("Second screen");
		Button btnCancel = new Button("Cancel");
		Scene scene2 = new Scene(btnCancel, 400, 600);
		stage2.setScene(scene2);
		stage2.show();
		
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
