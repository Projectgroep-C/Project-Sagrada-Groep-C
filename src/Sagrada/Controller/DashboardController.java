package Sagrada.Controller;

import Sagrada.Model.Game;
import Sagrada.Model.Player;

import java.util.ArrayList;

public class DashboardController {

    private MyApp myApp;
    private Player player;
    private ArrayList<Game> games;

    public DashboardController(MyApp myApp) {
        this.myApp = myApp;
        this.player = new Player();

        this.player = Player.GetPlayer(1);

        System.out.println("Player username:");
        System.out.println(this.player.getUsername());

        getGames();
    }

    public void getGames() {

        this.games = Game.GetPlayerGames(this.player.getUsername());

        for (Game g : this.games) {
            System.out.println("Game creation date:");
            System.out.println(g.getCreated());
        }

    }

    public void createGame() {
        Game newGame = new Game();
    }

    public void getChallenges() {

    }

    public void getAccounts() {

    }

    public void editChallenges(Boolean reaction) {

    }

}
