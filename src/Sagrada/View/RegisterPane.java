package Sagrada.View;


import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class RegisterPane extends BorderPane {

    private TextArea textArea;
    private VBox vBox;

   public RegisterPane(){
        super();
       setPaneStyle(this);
    }
    private void setPaneStyle(Pane pane) {
        pane.setStyle("-fx-background-radius: 30;" +
                "-fx-border-radius: 30;" +
                "-fx-border-width:4;" +
                "-fx-background-color: #b6b6b6;"+
                "-fx-border-color: #ff9900;");

    }
}
