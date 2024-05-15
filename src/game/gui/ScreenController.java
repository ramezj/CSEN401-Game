package game.gui;

import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.HashMap;

public class ScreenController {
    private final HashMap<String, Parent> screenMap = new HashMap<>();
    private final Scene main;

    public ScreenController(Scene scene) {
        main = scene;
    }

    public void addScreen(String name, Parent pane) {
        screenMap.put(name, pane);
    }

    public void removeScreen(String name) {
        screenMap.remove(name);
    }

    public void activate(String name) {
        main.setRoot(screenMap.get(name));
    }
}