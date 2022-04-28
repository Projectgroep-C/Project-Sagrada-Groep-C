package Sagrada.Controller;

import Sagrada.Model.Game;
import Sagrada.Model.Player;

import java.util.ArrayList;

public class DashboardController {

    private ArrayList<Player> players = new ArrayList<>();

    public DashboardController() {
        players.add(new Player());
    }

    public ArrayList<Game> GetGames(String username) {
        return Game.GetPlayerGames(username);
    }

    public boolean CreateGame() {
        return Game.CreateGame();
    }

    public void GetChallenges() {

    }

    public void EditChallenges(Boolean reaction) {

    }

}
