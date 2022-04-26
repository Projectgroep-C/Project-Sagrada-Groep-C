package Sagrada.View;

import Sagrada.Controller.AccountController;
import Sagrada.Controller.MyApp;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AccountScene extends Scene {

    private BorderPane root;
    private ArrayList<Pane> panes;

    public AccountScene() {
        super(new Pane(), MyApp.width, MyApp.height);

        root = new BorderPane();
        setRoot(root);
        setPanes();

        root.setCenter(panes.get(0));
    }

    private void setPanes() {
        panes = new ArrayList<Pane>();
        panes.add(new LoginPane());
        panes.add(new RegisterPane());
    }

    public void SwitchPane(int selectedScene){
        root.setCenter(panes.get(selectedScene));
    }
    public void createAccount(String username, String password) {

    }

    public static void login(String username, String password) {
        AccountController accountController = new AccountController();

        boolean succesRate = accountController.loginAccount(username, password);
        if (succesRate){
            MyApp.switchScene(1);
        }

    }

}
