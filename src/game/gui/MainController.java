package game.gui;

import java.io.IOException;
import game.gui.Main;

import game.engine.Battle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML Button easy;
	@FXML Button hard;
	@FXML Button instructions;
	public void initialize() {
		easy.setOnAction(e -> {Main.changeToScene("game");});
		hard.setOnAction(e -> {Main.changeToScene("game");});
		instructions.setOnAction(e -> {Main.changeToScene("instructions");});
	}
}
