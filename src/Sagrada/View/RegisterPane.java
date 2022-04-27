package Sagrada.View;


import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class RegisterPane extends BorderPane {

    private final int PaneWidth = 400;
    private final int PaneHeight = 600;

    private TextArea textArea;
    private VBox vBox;
    private AccountScene accountScene;

   public RegisterPane(AccountScene accountScene){
        super();
        this.accountScene = accountScene;
        SetPaneStyle(this);
    }
    private void SetPaneStyle(Pane pane) {
        pane.setStyle("-fx-background-radius: 30;" +
            "-fx-border-radius: 30;" +
            "-fx-border-width:4;" +
            "-fx-background-color: #b6b6b6;"+
            "-fx-border-color: #ff9900;");

    }
}
