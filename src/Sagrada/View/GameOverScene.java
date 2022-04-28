package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class GameOverScene extends Scene {

    //instance variables
    private ResultPane resultPane;

    public GameOverScene() {
        super(new Pane(), MyApp.width, MyApp.height);
        resultPane = new ResultPane();
        receivePlayerScore();
        setRoot(resultPane);

        Text text = new Text("Hello, you're on the GameOverScene");
        Button goback = new Button("Go back to GameScene");
        goback.setOnAction(e -> MyApp.SwitchScene(2));

        Pane pane = new Pane();
        pane.getChildren().add(text);
        pane.getChildren().add(goback);
    }

    public void receivePlayerScore() {
        System.out.println(resultPane.testenHashMap());
    }

}
