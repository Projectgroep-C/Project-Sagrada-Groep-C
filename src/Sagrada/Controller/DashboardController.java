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

        Player player = new Player();
        player.GetPlayer(1);
        this.player = player;

        System.out.println(this.player.getUsername());

        getGames();
    }

    public void getGames() {

        Game game = new Game();
        games = game.GetPlayerGames(player.getId());

        for (Game g : games) {
            System.out.println(g.getCreated());
        }

    }

    public void createGame() {

    }

    public void getChallenges() {

    }

    public void getAccounts() {

    }

    public void editChallenges(Boolean reaction) {

    }

}
