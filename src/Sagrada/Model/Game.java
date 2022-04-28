package Sagrada.Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Game extends Database {

    private int idGame;
    private int turnIdPlayer;
    private int currentRoundID;
    private Timestamp created;

    public Game() {
        this.created = new Timestamp(System.currentTimeMillis());
    }

    public Game(int idGame, int turnIdPlayer, int currentRoundID, Timestamp created) {
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

    public Timestamp getCreated() {
        return created;
    }

    public static ArrayList<Game> GetPlayerGames(String username) {

        ArrayList<Game> games = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement("select * from game inner join player on game.idgame = player.idgame where player.username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) games.add( new Game( rs.getInt(1), rs.getInt(2), rs.getInt(3), Timestamp.valueOf(rs.getString(4)) ) );

            ps.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

        return games;
    }

    public static boolean CreateGame() {
        try {

            Game newGame = new Game();
            System.out.println(newGame.getCreated());

            PreparedStatement ps = con.prepareStatement("insert into game (idgame,turn_idplayer,current_roundID,creationdate) values(5,null,null,?)");
            ps.setTimestamp(1, newGame.getCreated());

            ps.executeUpdate();
            ps.close();

            return true;
        }
        catch(Exception e){
            System.out.println(e);
        }

        return false;
    }

    public void UseToolCard() {

    }

    public void UpdateScore() {

    }

}
