package game.gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WeaponShopController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML Button backButton;
	public void initialize() {
		backButton.setOnAction(e -> {Main.changeToScene("game");});
	}
}

