package Sagrada.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

public class LoginPane extends BorderPane {

    private static final String ImageUrl = "/images/logo.png";
    private final int PaneWidth = 400;
    private final int PaneHeight = 600;
    private final int ImageWidth = 200;
    private final int ImageHeight = 100;
    private final int VBoxWidth = 300;
    private final int VBoxHeight = 700;

    private AccountScene accountScene;
    private TextField usernameField;
    private Image image;
    private ImageView imageView;
    private TextField passwordField;
    private Label usernameLabel;
    private Label passwordLabel;
    private Button submitButton;
    private Label registerLabel;
    private Button registerButton;
    private Text topText;
    private VBox vBox;

    public LoginPane(AccountScene accountScene) {
        super();
        setMaxSize(PaneWidth, PaneHeight);
        SetPaneStyle(this);
        this.accountScene = accountScene;

        image = new Image(getClass().getResource(ImageUrl).toString());
        imageView = new ImageView(image);
        imageView.setFitHeight(ImageHeight);
        imageView.setFitWidth(ImageWidth);
        topText = new Text("Inloggen");
        topText.setStyle("-fx-font: 35 arial;");
        usernameLabel = new Label("Gebruikersnaam");
        usernameField = new TextField();
        passwordLabel = new Label("Wachtwoord");
        passwordField = new TextField();
        SetTextFieldStyle(usernameField,passwordField);
        submitButton = new Button("Inloggen");
        registerLabel = new Label("Geen account?");
        registerButton = new Button("Registreren");
        SetButtonStyle(submitButton, registerButton);
        submitButton.setOnAction(e -> AccountScene.Login(usernameField.getText().toLowerCase(), passwordField.getText().toLowerCase()));
        registerButton.setOnAction(e -> SwitchPane(1));

        vBox = new VBox(imageView, topText, usernameLabel, usernameField, passwordLabel, passwordField, submitButton, registerLabel, registerButton );
        vBox.setMargin(imageView, new Insets(50, 0, 30, 0));
        vBox.setMargin(topText, new Insets(0, 0, 30, 0));
        vBox.setMargin(usernameField, new Insets(0, 0, 30, 0));
        vBox.setMargin(usernameLabel, new Insets(0, 200, 5, 0));
        vBox.setMargin(passwordLabel, new Insets(0, 220, 5, 0));
        vBox.setMargin(passwordField, new Insets(0, 0, 30, 0));
        vBox.setMargin(submitButton, new Insets(0, 0, 0, 190));
        vBox.setMargin(registerLabel, new Insets(20, 0, 5, 0));

        vBox.setMaxSize(VBoxWidth, VBoxHeight);
        vBox.setAlignment(Pos.TOP_CENTER);
        setCenter(vBox);





    }

    private void SwitchPane(int i) {
        accountScene.SwitchPane(i);
    }

    private void SetPaneStyle(Pane pane) {
        pane.getStyleClass().add("accountPaneStyle");

    }

    private void SetTextFieldStyle(Node... nodes) {
        for (Node node : nodes) {
            node.getStyleClass().add("accountTextField");
        }
    }
    private void SetButtonStyle(Node... nodes){
        for (Node node : nodes) {
            node.getStyleClass().add("accountSceneButton");
        }
    }

}
