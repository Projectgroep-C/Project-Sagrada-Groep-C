package Sagrada.View;

import Sagrada.Model.Account;
import Sagrada.Model.Player;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class PlayersPane extends BorderPane {
    private DashboardScene dashboard;
    private ScrollPane root;
    private ArrayList<Account> accounts;
    private VBox playerTable;
    private HBox playerTableRow;
    private Text tableText;


    PlayersPane(DashboardScene dashboard){
        this.dashboard = dashboard;
        setCenter(setContend());
    }

    private ScrollPane setContend(){
        root = new ScrollPane();
        root.setPadding(new Insets(0, 0,45,60));
        root.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        root.setStyle("-fx-background-color:transparent;");
        root.setContent(SetPlayerTable());
        root.setMaxHeight(500);
        return root;
    };

    private VBox SetPlayerTable() {
        playerTable = new VBox();
        accounts = new ArrayList<Account>();
        accounts = dashboard.getAcounts(accounts);
        for(Account account : accounts){
            playerTable.getChildren().add(setPlayerTableRow(account));
        }
        return playerTable;
    }

    private HBox setPlayerTableRow(Account account) {
        playerTableRow = new HBox();
        playerTableRow.getChildren().add(SetTableText(account.getUsername()));
        playerTableRow.getChildren().add(SetTableButton("Challenge"));
        playerTableRow.setSpacing(0);
        playerTableRow.setPadding(new Insets(0, 0,20,0));
        return playerTableRow;
    }

    private Text SetTableText(String text){
        tableText = new Text(text);
        tableText.setWrappingWidth(100);;
        tableText.setFont(new Font("Arial", 20));
        return tableText;
    }

    private Button SetTableButton(String btnText){
        Button btn = new Button(btnText);
        btn.setMinWidth(100);
        Font font = Font.font("Arial", 12);
        btn.setFont(font);
        //todo Make button send Challange
        //btn.setOnAction(e -> dashboard.SwitchPane(paneIndex, name));
        return btn;
    }

    private void sort() {

    }
    @Deprecated
    private Pane SetPlayerTableCell(Node contend){
        Pane playerTableCell = new Pane();
        playerTableCell.getChildren().add(contend);
        return playerTableCell;
    }
}
