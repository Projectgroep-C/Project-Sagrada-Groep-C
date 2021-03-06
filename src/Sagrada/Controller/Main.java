package Sagrada.Controller;

import Sagrada.Model.Database;
import Sagrada.View.AccountScene;
import Sagrada.View.DashboardScene;
import Sagrada.View.GameOverScene;
import Sagrada.View.GameScene;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public final static int width = 1440;
    public final static int height = 810;

    protected static Stage stage;

    public static void main(String[] args) throws Exception {
        DashboardController dashboardController = new DashboardController();
        Application.launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Text text = new Text(10, 40, "Hello Sagrada!");
        text.setFont(new Font(40));

        SwitchScene(0);

        stage.setTitle("Welcome to Sagrada!");
        stage.setFullScreen(false);
        stage.setResizable(true);
        stage.show();
    }

    public static void SwitchScene(int selectedScene) {
        //Temporarily return of String, actual code will come.
        switch (selectedScene) {
            case 0:
                AccountScene accountScene = new AccountScene();
                stage.setScene(accountScene);
                break;
            case 1:
                DashboardScene dashboardScene = new DashboardScene();
                stage.setScene(dashboardScene);
                break;
            case 2:
                GameScene gameScene = new GameScene();
                stage.setScene(gameScene);
                break;
            case 3:
                GameOverScene gameOverScene = new GameOverScene();
                stage.setScene(gameOverScene);
                break;
            default: System.out.println("ERROR");
        };
    }

}
