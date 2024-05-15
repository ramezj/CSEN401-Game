package game.gui;

import java.io.IOException;
import game.engine.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GameController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML TextField score;
	@FXML TextField turn;
	@FXML TextField phase;
	@FXML TextField resources;
	@FXML TextField lanes;
	@FXML Button weaponButton;
	public void createBattle () throws IOException {
		Battle battle = new Battle(0,0,0,0,0);
	}
	public void initialize() throws IOException {
		Battle battle = new Battle(0,0,0,0,0);
		weaponButton.setOnAction(e -> {Main.changeToScene("shop");});
		score.setText("" + battle.getScore());
		lanes.setText("" + battle.getLanes());
		turn.setText("" + battle.getNumberOfTurns());
	}
}
