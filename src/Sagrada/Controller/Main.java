package Sagrada.Controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) throws Exception {
        Application.launch(args);

        MyApp ma = new MyApp();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text(10, 40, "Hello World!");
        text.setFont(new Font(40));
        Scene scene = new Scene(new Group(text));

        stage.setTitle("Welcome to Sagrada!");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }



}
