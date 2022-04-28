package Sagrada.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Player {

    private int id;
    private String username;
    private int game;
    private PlayStatus playStatus;
    private int seqNr;
    private String private_objective_color;
    private int idPatternCard;
    private int score;

    public Player() {}

    public Player(int id, String username, int game, PlayStatus playStatus, int seqNr, String private_objective_color, int idPatternCard, int score) {
        this.id = id;
        this.username = username;
        this.game = game;
        this.playStatus = playStatus;
        this.seqNr = seqNr;
        this.private_objective_color = private_objective_color;
        this.idPatternCard = idPatternCard;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public PlayStatus getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(PlayStatus playStatus) {
        this.playStatus = playStatus;
    }

    public int getSeqNr() {
        return seqNr;
    }

    public void setSeqNr(int seqNr) {
        this.seqNr = seqNr;
    }

    public String getPrivate_objective_color() {
        return private_objective_color;
    }

    public void setPrivate_objective_color(String private_objective_color) {
        this.private_objective_color = private_objective_color;
    }

    public int getIdPatternCard() {
        return idPatternCard;
    }

    public void setIdPatternCard(int idPatternCard) {
        this.idPatternCard = idPatternCard;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static Player GetPlayer(int playerId) {
        try {
            Connection con = Database.CreateConnection();
            PreparedStatement ps = con.prepareStatement("select * from player where idplayer = ?");
            ps.setInt(1, playerId);
            ResultSet rs = ps.executeQuery();

            rs.next();
            Player p = new Player(rs.getInt(1), rs.getString(2), rs.getInt(3), PlayStatus.valueOf(rs.getString(4)), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
            con.close();
            return p;
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
}
