package Sagrada.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Game {

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

    public static ArrayList<Game> GetPlayerGames(Player player) {

        ArrayList<Game> games = new ArrayList<>();

        try {
            Connection con = Database.CreateConnection();
            PreparedStatement ps = con.prepareStatement("select * from game inner join player on game.idgame = player.idgame where player.username = ?");
            ps.setString(1, player.getUsername());
            ResultSet rs = ps.executeQuery();

            while(rs.next()) games.add( new Game( rs.getInt(1), rs.getInt(2), rs.getInt(3), Timestamp.valueOf(rs.getString(4)) ) );

            ps.close();
            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

        return games;
    }

    public static boolean CreateGame() {
        try {
            Connection con = Database.CreateConnection();
            PreparedStatement ps1 = con.prepareStatement("select * from game order by idgame desc limit 1");
            ResultSet rs = ps1.executeQuery();
            rs.next();

            PreparedStatement ps2 = con.prepareStatement("insert into game (idgame,turn_idplayer,current_roundID,creationdate) values(?,null,null,?)");
            ps2.setInt(1, (rs.getInt(1) + 1));
            ps2.setTimestamp(2, new Timestamp(System.currentTimeMillis()));

            ps2.executeUpdate();

            ps1.close();
            ps2.close();
            con.close();

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
