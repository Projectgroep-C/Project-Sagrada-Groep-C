package Sagrada.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Game extends Database {

    private int idGame;
    private int turnIdPlayer;
    private int currentRoundID;
    private String created;

    public Game() {
        this.created = new Date().toString();
    }

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

    public static ArrayList<Game> GetPlayerGames(String username) {

        ArrayList<Game> games = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement("select * from game inner join player on game.idgame = player.idgame where player.username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) games.add( new Game( rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4) ) );

            ps.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

        return games;
    }

    public static boolean CreateGame() {
        try {

            // Add to main for testing
            //if (Game.CreateGame()) System.out.println("Game gemaakt!");
            //else System.out.println("Game niet gemaakt!");
            // Doesn't work yet.

            Game newGame = new Game();
            System.out.println(newGame.getCreated());

            PreparedStatement ps = con.prepareStatement("insert into game values(?,?,?)");

            ps.setInt(1, newGame.getTurnIdPlayer());
            ps.setInt(2, newGame.getCurrentRoundID());
            Date date = new Date();
            Timestamp sqlTime = new Timestamp(date.getTime());
            ps.setTimestamp(3, sqlTime);

            ps.executeUpdate();
            ps.close();

            return true;
        }
        catch(Exception e){
            System.out.println(e);
        }

        return false;
    }

}
