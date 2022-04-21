package Sagrada.Controller;

import Sagrada.Model.Player;
import Sagrada.Model.PlayerBoard;

public class GameController {

    private MyApp ma;
    private Player p;
    private PlayerBoard playerBoard;

    public GameController(MyApp ma, Player p) {
        this.ma = ma;
        this.p = p;
        this.playerBoard = new PlayerBoard();

        // When done
        // System.out.println("Done with GameScene");
        // System.out.println("To GameOverScene!");
        // ma.switchScene(3);
    }

    public void createDice() {

    }

    public void createPlayerBoard() {

    }

    public boolean checkChallengeStatus() {
        return false;
    }

    public void gatherCard(int Type) {

    }

    public void rollDice() {

    }

    public void useToolCard(int ToolCard) {

    }

    public void nextRound() {

    }

    public void calculateFinalScore() {

    }

    public void saveMessage(String message) {

    }

}
