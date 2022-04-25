package Sagrada.View;

import Sagrada.Model.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.HashMap;

public class GameScene extends Scene {

    private final static int width = 1440;
    private final static int height = 810;

    private int favorTokenAmount;
    private ArrayList<PatternCard> patterncardList = new ArrayList<PatternCard>();
    private HashMap<Player, Account> playerDetails = new HashMap<Player, Account>();
    private ArrayList<ToolCard> toolCardList = new ArrayList<ToolCard>();
    private ArrayList<PublicObjectiveCard> publicOjList = new ArrayList<PublicObjectiveCard>();
    private ArrayList<ChatLine> messageList = new ArrayList<ChatLine>();


    public GameScene() {
        super(new Pane(), width, height);
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
