package Sagrada.View;

import Sagrada.Model.Game;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class GameListPane extends BorderPane {
    private DashboardScene dashboard;
    private ScrollPane root;
    private ArrayList<Game> games;
    private VBox gamesTable;
    private HBox gamesTableRow;
    private Text tableText;

    GameListPane(DashboardScene dashboard){
        this.dashboard = dashboard;
        VBox f = new VBox();
        f.getChildren().addAll(setGamesTableTopRow(), setContend());
        //setTop(setGamesTableTopRow());
        setCenter(f);
    }

    private ScrollPane setContend(){
        root = new ScrollPane();
        root.setPadding(new Insets(0, 0,45,60));
        root.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        root.setStyle("-fx-background-color:transparent;");
        root.setContent(SetGamesTable());
        root.setMaxHeight(500);
        return root;
    };

    private VBox SetGamesTable() {
        gamesTable = new VBox();
        games = new ArrayList<Game>();
        games = dashboard.getGames(games);
        for(Game game : games){
            gamesTable.getChildren().add(setGamesTableRow(game));
        }
        return gamesTable;
    }

    private HBox setGamesTableRow(Game game) {
        gamesTableRow = new HBox();
        gamesTableRow.getChildren().add(SetTableText(""+game.getIdGame()));
        gamesTableRow.getChildren().add(SetTableText(""+game.getCurrentRoundID()));
        gamesTableRow.getChildren().add(SetTableText(""+game.getTurnIdPlayer()));
        gamesTableRow.getChildren().add(SetTableButton("Open"));
        gamesTableRow.setPadding(new Insets(0, 0,20,0));
        return gamesTableRow;
    }

    private HBox setGamesTableTopRow() {
        gamesTableRow = new HBox();
        gamesTableRow.getChildren().add(SetTableText("GameId"));
        gamesTableRow.getChildren().add(SetTableText("Current Round"));
        gamesTableRow.getChildren().add(SetTableText("TurnPlayer"));
        return gamesTableRow;
    }

    private Text SetTableText(String text){
        tableText = new Text(text);
        tableText.setWrappingWidth(200);
        tableText.setFont(new Font("Arial", 20));
        return tableText;
    }

    private Button SetTableButton(String btnText){
        Button btn = new Button(btnText);
        btn.setMinWidth(100);
        Font font = Font.font("Arial", 12);
        btn.setFont(font);
        //todo Make button open game
        //btn.setOnAction(e -> dashboard.SwitchPane(paneIndex, name));
        return btn;
    }

    public void sort(String sortBy) {

    }

    public void showOpenGames() {

    }

}
