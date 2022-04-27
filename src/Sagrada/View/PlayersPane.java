package Sagrada.View;

import Sagrada.Model.Player;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class PlayersPane extends Pane {
    private DashboardScene dashboard;
    private ArrayList<Player> players;

    PlayersPane(DashboardScene dashboard){
        this.dashboard = dashboard;

    }

    public void sort() {

    }

}
