package Sagrada.Controller;

import Sagrada.Model.Game;
import Sagrada.Model.Player;

import java.sql.Timestamp;
import java.util.ArrayList;

public class DashboardController {

    private ArrayList<Game> games;

    public DashboardController() {

        Player p = Player.GetPlayer(1);

        System.out.println("Player username:");

        System.out.println(p.getUsername());

//        getGames();
    }

    public void getGames(String username) {
        this.games = Game.GetPlayerGames(username);
    }

    public void createGame() {
        Game.CreateGame();
    }

    public void getChallenges() {

    }

    public void getAccounts() {

    }

    public void editChallenges(Boolean reaction) {

    }

}
