package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

import java.awt.*;

public class LoginPane extends StackPane {

    private TextArea textArea;
    private VBox vBox;

    public LoginPane() {
        super();

        Text text = new Text("Hello, you're on the AccountScene");

        Button next = new Button("Go to DashboardScene");
        next.setOnAction(e -> MyApp.switchScene(1));
        vBox = new VBox(text, next);
        vBox.setPadding(new Insets(15));
        vBox.setSpacing(50);

        getChildren().add(vBox);
    }

}
