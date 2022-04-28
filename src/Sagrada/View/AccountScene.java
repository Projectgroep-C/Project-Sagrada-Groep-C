package Sagrada.View;

import Sagrada.Controller.AccountController;
import Sagrada.Controller.MyApp;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.util.ArrayList;

public class AccountScene extends Scene {
    private static final String ImageUrl = "/images/bgLogin.jpg";
    private static final String GeneralStylePath = "/style/accountStyle.css";

    private BorderPane root;
    private ArrayList<Pane> panes;

    public AccountScene() {
        super(new Pane(), MyApp.width, MyApp.height);
        this.getStylesheets().add(getClass().getResource(GeneralStylePath).toString());
        root = new BorderPane();
        setRoot(root);
        SetPanes();
        ShowBackgroundImage();
        root.setCenter(panes.get(0));
    }

    private void ShowBackgroundImage() {
        BackgroundSize cover = new BackgroundSize(1, 1, false, false, false, true);
        Image image = new Image(getClass().getResource(ImageUrl).toString());
        Background background = new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, cover));
        root.setBackground(background);
    }

    private void SetPanes() {
        panes = new ArrayList<Pane>();
        panes.add(new LoginPane(this));
        panes.add(new RegisterPane(this));
    }

    public void SwitchPane(int selectedScene){
        root.setCenter(panes.get(selectedScene));
    }
    public void CreateAccount(String username, String password) {

    }

    public static void Login(String username, String password) {
        AccountController accountController = new AccountController();

        boolean succesRate = accountController.LoginAccount(username, password);
        if (succesRate){
            MyApp.SwitchScene(1);
        }

    }

}
