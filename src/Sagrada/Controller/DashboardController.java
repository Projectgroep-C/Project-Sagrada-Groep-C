package Sagrada.Controller;

import Sagrada.Model.Game;
import Sagrada.Model.Player;

import java.util.ArrayList;

public class DashboardController {


   // private MyApp myApp;
    private Player player;
    private ArrayList<Game> games;
    private ArrayList<Player> players = new ArrayList<>();

    public DashboardController() {
         players.add(new Player());
        this.player = new Player();

        this.player = Player.GetPlayer(1);

        System.out.println("Player username:");

        getGames();
    }

    public ArrayList<Game> GetGames() {
        return Game.GetPlayerGames(this.players.get(1));
    }

    public boolean CreateGame() {
        return Game.CreateGame();
    }

    public ArrayList<Player> GetChallenges() {
        return Player.GetChallenges(this.players.get(1));
    }

    public void EditChallenges(Boolean reaction) {

    }

}
