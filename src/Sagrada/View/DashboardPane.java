package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class DashboardPane extends StackPane {

    private VBox vBox;

    public DashboardPane() {
        super();

        Text text = new Text("Hello, you're on the DashboardScene");
        Button next = new Button("Go to GameScene");
        next.setOnAction(e -> MyApp.switchScene(2));

        Button goback = new Button("Go back to AccountScene");
        goback.setOnAction(e -> MyApp.switchScene(0));

        vBox = new VBox(text, next, goback);
        vBox.setPadding(new Insets(15));
        vBox.setSpacing(50);

        getChildren().add(vBox);
    }

}
