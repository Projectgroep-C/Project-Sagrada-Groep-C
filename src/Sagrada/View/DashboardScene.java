package Sagrada.View;
import Sagrada.Controller.Main;
import Sagrada.Controller.DashboardController;
import Sagrada.Controller.MyApp;
import Sagrada.Model.Account;
import Sagrada.Model.Game;
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

    private BorderPane root;
    private ArrayList<Pane> panes;
    private Text title;
    private HBox titleBox;

    public DashboardScene() {
        super(new Pane(), Main.width, Main.height);
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
        panes.add(new GameListPane(this));
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

    //todo delete
    public ArrayList<Account> getAcounts(ArrayList<Account> accounts) {
        //todo delete
        Account p1 = new Account();
        p1.TestSetUsername("Punpun");
        accounts.add(p1);
        Account p2 = new Account();
        p2.TestSetUsername("Aiko");
        accounts.add(p2);
        Account p3 = new Account();
        p3.TestSetUsername("Jhon");
        accounts.add(p3);
        Account p4 = new Account();
        p4.TestSetUsername("Joseph");
        accounts.add(p4);
        Account p5 = new Account();
        p5.TestSetUsername("Deku");
        accounts.add(p5);
        int i = 0;
        while (30 > i){
            Account p6 = new Account();
            p6.TestSetUsername("Deku" + i);
            accounts.add(p6);
            i++;
        }
        //todo delete
        return accounts;
    }
    //todo delete
    public ArrayList<Game> getGames(ArrayList<Game> games) {
        int i = 0;
        Game g1 = new Game();
        g1.setIdGame(120);g1.setCurrentRoundID(3);g1.setTurnIdPlayer(3);
        games.add(g1);
        while (30 > i){
            Game g2 = new Game();
            g2.setIdGame(i);g1.setCurrentRoundID(i+1);g1.setTurnIdPlayer(i+1*3);
            games.add(g2);
            i++;
        }

        return games;
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
