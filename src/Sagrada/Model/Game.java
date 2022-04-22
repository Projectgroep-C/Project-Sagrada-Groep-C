package Sagrada.Model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Game extends Database {

    private int idGame;
    private int turnIdPlayer;
    private int currentRoundID;
    private String created;

    public Game() {}

    public Game(int idGame, int turnIdPlayer, int currentRoundID, String created) {
        this.idGame = idGame;
        this.turnIdPlayer = turnIdPlayer;
        this.currentRoundID = currentRoundID;
        this.created = created;
    }

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public int getTurnIdPlayer() {
        return turnIdPlayer;
    }

    public void setTurnIdPlayer(int turnIdPlayer) {
        this.turnIdPlayer = turnIdPlayer;
    }

    public int getCurrentRoundID() {
        return currentRoundID;
    }

    public void setCurrentRoundID(int currentRoundID) {
        this.currentRoundID = currentRoundID;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ArrayList<Game> GetPlayerGames(int playerId) {

        ArrayList<Game> games = new ArrayList<>();

        try {

            Statement stmt = this.con.createStatement();
            String query = "select * from game where " + playerId;
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()) games.add( new Game( rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4) ) );

        }
        catch(Exception e){
            System.out.println(e);
        }

        return games;
    }

}
