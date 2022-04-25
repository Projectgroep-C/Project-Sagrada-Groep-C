package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class AccountScene extends Scene {

    private LoginPane loginPane;

    public AccountScene() {
        super(new Pane(), MyApp.width, MyApp.height);
        this.loginPane = new LoginPane();
        setRoot(this.loginPane);

    }
    public void createAccount(String username, String password) {

    }

    public void login() {

    }

}
