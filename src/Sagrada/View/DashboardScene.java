package Sagrada.View;

import Sagrada.Controller.DashboardController;
import Sagrada.Controller.MyApp;
import Sagrada.Model.Account;
import Sagrada.Model.Player;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class DashboardScene extends Scene {

    //private DashboardPane dashboardPane;
    private BorderPane root;
    private ArrayList<Pane> panes;
    private Text title;
    private HBox titleBox;

    public DashboardScene() {
        super(new Pane(), MyApp.width, MyApp.height);
        root = new BorderPane();
        titleBox = new HBox();
        SetTitle("Dashboard");
        setRoot(root);
        SetPanes();
        root.setLeft(panes.get(0));
    }

    public void SetPanes(){
        panes = new ArrayList<Pane>();
        panes.add(new DashboardPane(this));
        panes.add(new PlayersPane(this));
        panes.add(new GameListPane());
        panes.add(new RankingListPane());
        panes.add(new ChallengePane());
    }
    public void SwitchPane(int selectedScene, String pageTitle){
        SetTitle(pageTitle);
        root.setCenter(panes.get(selectedScene));
    }

    public void SetTitle(String pageTitle) {
        titleBox.getChildren().clear();
        titleBox.getChildren().addAll(GetTitle("Sagrada:"), GetTitle(pageTitle));
        titleBox.setSpacing(50);
        titleBox.setPadding(new Insets(50, 150,0,50));
        root.setTop(titleBox);
    }

    public Text GetTitle(String text){
        title = new Text(text);
        title.setFont(new Font("Arial", 100));
        return title;
    }

    public ArrayList<Account> getAcounts(ArrayList<Account> accounts) {
        //ArrayList<Player> players = new ArrayList<Player>();

        //todo delete
        Account p1 = new Account();
        p1.TestSetUsername("Punpun");
        accounts.add(p1);
        Account p2 = new Account();
        p2.TestSetUsername("Aiko");
        accounts.add(p2);
        //todo delete
        //players = new ArrayList<Player>();

        return accounts;
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
