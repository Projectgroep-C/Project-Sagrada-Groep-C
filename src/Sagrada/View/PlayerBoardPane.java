package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class PlayerBoardPane extends StackPane {

    private VBox vBox;

    public PlayerBoardPane() {
        super();

        Text text = new Text("Hello, you're on the GameScene");
        Button next = new Button("Go to GameOverScene");
        next.setOnAction(e -> MyApp.switchScene(3));

        Button goback = new Button("Go back to DashboardScene");
        goback.setOnAction(e -> MyApp.switchScene(1));

        vBox = new VBox(text, next, goback);
        vBox.setPadding(new Insets(15));
        vBox.setSpacing(50);

        getChildren().add(vBox);
    }

}
