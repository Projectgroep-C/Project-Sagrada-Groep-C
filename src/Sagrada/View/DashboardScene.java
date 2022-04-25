package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class DashboardScene extends Scene {

    private DashboardPane playerBoardPane;

    public DashboardScene() {
        super(new Pane(), MyApp.width, MyApp.height);
        this.playerBoardPane = new DashboardPane();
        setRoot(this.playerBoardPane);
    }

    public void showGames() {

    }

    public void openGame() {

    }

    public void createGame() {

    }

    public void showChallenges() {

    }

    public void showAccounts() {

    }

    public void reactChallenge() {

    }

    public void logout() {

    }

}
