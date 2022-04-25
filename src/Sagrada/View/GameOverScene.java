package Sagrada.View;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameOverScene extends Scene {

    //instance variables
    private ResultPane resultPane;

    public GameOverScene() {
        super(new Pane());
        resultPane = new ResultPane();
        receivePlayerScore();
        setRoot(resultPane);
    }

    public void receivePlayerScore() {
        //test
        System.out.println(resultPane.testenHashMap());
    }

}
