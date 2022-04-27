package Sagrada.Controller;

import Sagrada.View.AccountScene;
import Sagrada.View.DashboardScene;
import Sagrada.View.GameOverScene;
import Sagrada.View.GameScene;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyApp extends Application {

    public final static int width = 1440;
    public final static int height = 810;

    private DashboardController dashboardController;
    protected static Stage stage;

    public MyApp() {
        //this.dashboardController = new DashboardController();
    }

    public void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Text text = new Text(10, 40, "Hello Sagrada!");
        text.setFont(new Font(40));

        switchScene(0);

        stage.setTitle("Welcome to Sagrada!");
        stage.setFullScreen(false);
        stage.setResizable(true);
        stage.show();
    }

    public static void switchScene(int selectedScene) {
        //Temporarily return of String, actual code will come.
        switch (selectedScene) {
            case 0:
                stage.setScene(new AccountScene());
                break;
            case 1:
                stage.setScene(new DashboardScene());
                break;
            case 2:
                stage.setScene(new GameScene());
                break;
            case 3:
                stage.setScene(new GameOverScene());
                break;
            default: System.out.println("ERROR");
        };
    }

}
