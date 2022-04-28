package Sagrada.View;

import Sagrada.Controller.Main;
import Sagrada.Model.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class GameScene extends Scene {

    private int favorTokenAmount;
    private ArrayList<PatternCard> patterncardList = new ArrayList<PatternCard>();
    private HashMap<Player, Account> playerDetails = new HashMap<Player, Account>();
    private ArrayList<ToolCard> toolCardList = new ArrayList<ToolCard>();
    private ArrayList<PublicObjectiveCard> publicOjList = new ArrayList<PublicObjectiveCard>();
    private ArrayList<ChatLine> messageList = new ArrayList<ChatLine>();

    private PlayerBoardPane playerBoardPane;

    public GameScene() {
        super(new Pane(), Main.width, Main.height);
        this.playerBoardPane = new PlayerBoardPane();
        setRoot(this.playerBoardPane);

        Text text = new Text("Hello, you're on the GameScene");
        Button next = new Button("Go to GameOverScene");
        next.setOnAction(e -> Main.SwitchScene(3));
        next.setLayoutX(250);
        next.setLayoutY(220);

        Button goback = new Button("Go back to DashboardScene");
        goback.setOnAction(e -> Main.SwitchScene(1));

        Pane pane = new Pane();
        pane.getChildren().add(text);
        pane.getChildren().add(next);
        pane.getChildren().add(goback);
    }

    public void startGame() {

    }

    public void assignPlayerBoard() {

    }

    public void choosePatternCard() {

    }

    public void assignPrivateOC() {

    }

    public void checkFullAcceptance() {

    }

    public void placeDie() {

    }

    public void payToolCard() {

    }

    public void useToolCard() {

    }

    public void skipRound() {

    }

    public void nextTurn() {

    }

    public void nextRound() {

    }

    public void calculateFinalScore() {

    }

    public void sendMessage(String message) {

    }

}
