package Sagrada.Controller;

import Sagrada.View.AccountScene;
import Sagrada.View.DashboardScene;
import Sagrada.View.GameOverScene;
import Sagrada.View.GameScene;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyApp extends Application {

    private DashboardController dashboardController;
    protected Stage stage;

    public MyApp() {
        this.dashboardController = new DashboardController(this);
    }

    public void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        Text text = new Text(10, 40, "Hello Sagrada!");
        text.setFont(new Font(40));

        AccountScene accountScene = new AccountScene(setupAccountScene());

        stage.setTitle("Welcome to Sagrada!");
        stage.setScene(accountScene);
        stage.setFullScreen(false);
        stage.setResizable(true);
        stage.show();
    }

    public void switchScene(int selectedScene) {
        //Temporarily return of String, actual code will come.
        switch (selectedScene) {
            case 0:
                AccountScene accountScene = new AccountScene(setupAccountScene());
                this.stage.setScene(accountScene);
                break;
            case 1:
                DashboardScene dashboardScene = new DashboardScene(setupDashboardScene());
                this.stage.setScene(dashboardScene);
                break;
            case 2:
                GameScene gameScene = new GameScene();
                this.stage.setScene(gameScene);
                break;
            case 3:
                GameOverScene gameOverScene = new GameOverScene();
                this.stage.setScene(gameOverScene);
                break;
            default: System.out.println("ERROR");
        };
    }

    public Pane setupAccountScene() {
        Button button = new Button("Go to Dashboard");
        button.setOnAction(e -> switchScene(1));

        Pane pane = new Pane();
        pane.getChildren().add(button);
        return pane;
    }

    public Pane setupDashboardScene() {
        Button button = new Button("Hallo, welkom op het dashboard");
        button.setOnAction(e -> switchScene(2));

        Pane pane = new Pane();
        pane.getChildren().add(button);
        return pane;
    }
}
