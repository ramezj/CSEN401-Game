package game.gui;
import java.io.IOException;

import game.engine.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import junit.framework.Test;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;


public class Main extends Application {
	private static ScreenController screenController;
 @Override
 public void start(Stage primaryStage) throws IOException {
	 Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
     Scene scene = new Scene(root);
     primaryStage.setScene(scene);
	 primaryStage.getIcons().add(new Image("https://wallpapers.com/images/hd/metallic-attack-on-titan-logo-jl1xer4d7ymwghz3.jpg"));
     primaryStage.show();
     screenController = new ScreenController(scene);
     screenController.addScreen("main", root);
     screenController.addScreen("game", FXMLLoader.load(getClass().getResource("Game.fxml")));
     screenController.addScreen("shop", FXMLLoader.load(getClass().getResource("WeaponShop.fxml")));
     screenController.addScreen("instructions", FXMLLoader.load(getClass().getResource("Instructions.fxml")));
 } 
 public static void changeToScene(String sceneName) {
     screenController.activate(sceneName);
 }
 public static void main(String[] args) {
  launch(args);
 }
}