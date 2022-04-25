package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class DashboardScene extends Scene {

    //private DashboardPane dashboardPane;
    private BorderPane root;
    private ArrayList<Pane> panes;

    public DashboardScene() {
        super(new Pane(), MyApp.width, MyApp.height);
        root = new BorderPane();
        setRoot(root);
        SetPanes();
        root.setCenter(panes.get(0));
    }

    public void SetPanes(){
        panes = new ArrayList<Pane>();
        panes.add(new DashboardPane(this));
        panes.add(new PlayersPane());
        panes.add(new GameListPane());
        panes.add(new RankingListPane());
        panes.add(new ChallengePane());
    }
    public void SwitchPane(int selectedScene){
        root.setCenter(panes.get(selectedScene));
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
