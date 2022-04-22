package Sagrada.Controller;

import Sagrada.View.AccountScene;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) throws Exception {
        Application.launch(args);
        MyApp myApp = new MyApp();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text(10, 40, "Hello Sagrada!");
        text.setFont(new Font(40));
        AccountScene accountScene = new AccountScene();

        stage.setTitle("Welcome to Sagrada!");
        stage.setScene(accountScene);
        stage.setFullScreen(false);
        stage.setResizable(true);
        stage.show();
    }


}
