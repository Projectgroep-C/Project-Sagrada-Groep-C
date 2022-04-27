package Sagrada.View;

import Sagrada.Model.Account;
import Sagrada.Model.Player;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class PlayersPane extends VBox {
    private DashboardScene dashboard;
    private ArrayList<Account> accounts;
    private VBox playerTableRow;
    private Text tableText;


    PlayersPane(DashboardScene dashboard){
        this.dashboard = dashboard;
        setPadding(new Insets(60, 30,10,60));
        setPlayerTable();
    }

    public void setPlayerTable() {
        accounts = new ArrayList<Account>();
        accounts = dashboard.getAcounts(accounts);

        for(Account account : accounts){
            getChildren().add(setPlayerTableRow(account));
        }
    }

    public VBox setPlayerTableRow(Account account) {
        playerTableRow = new VBox();
        playerTableRow.getChildren().add(SetTableText(account.getUsername()));
        playerTableRow.setSpacing(50);
        playerTableRow.setPadding(new Insets(0, 0,20,0));
        return playerTableRow;
    }

    public Text SetTableText(String text){
        tableText = new Text(text);
        tableText.setFont(new Font("Arial", 20));
        return tableText;
    }

    public void sort() {

    }

}
