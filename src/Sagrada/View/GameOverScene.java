package Sagrada.View;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

public class GameOverScene extends Scene {

    private HashMap<Integer, Integer> playerScores;

    public GameOverScene() {
        super(new Pane(), 1440, 810);
    }

}
