package game.gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InstructionsController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	 @FXML
	 public void switchToMainScreen(ActionEvent event) throws IOException {
		  Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
}
