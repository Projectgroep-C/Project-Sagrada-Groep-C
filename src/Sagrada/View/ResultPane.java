package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.HashMap;

public class ResultPane extends StackPane {

    //instance variables
    private Background background = new Background(new BackgroundFill(Color.rgb(198, 0, 42), null, null));
    private Pane informationPane;
    private VBox vBox;
    private HashMap<Integer, Integer> mapTest = new HashMap<Integer, Integer>();
    private Button button;

    public ResultPane() {
        super();
        button = new Button("Return to GameScene!");
        button.setOnAction(e -> MyApp.SwitchScene(2));
        button.setFont(new Font(20));
        button.setWrapText(true);

        Text text1 = new Text("Spel Resultaten");
        setupTextStyle(text1);

        //Moet dynamisch worden = naam ophalen en score
        Text text2 = new Text("Vincent: 5");
        setupTextStyle(text2);

        Text text3 = new Text("| Post-Game Leaderboard |");
        setupTextStyle(text3);

        vBox = new VBox(text1, text2, text3, button);
        vBox.setPadding(new Insets(15));
        vBox.setSpacing(50);

        informationPane = new Pane();
        informationPane.getChildren().add(vBox);
        informationPane.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        informationPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(4))));

        setAlignment(vBox, Pos.CENTER);
        getChildren().add(informationPane);
        setPadding(new Insets(100));
        setPrefSize(MyApp.width, MyApp.height);
        setBackground(background);
    }

    public int testenHashMap() {
        //Zet deze methode in de klasse waar de player score HaspMap staat.
        //Maak hier een switch van, afhankelijk van de playerID get de bijbehorende score
        //en return de score vervolgens.
        //De methode moet worden aangeroepen in de resultPane class.
        mapTest.put(0, 25);
        mapTest.put(1, 18);
        mapTest.put(2, 20);
        mapTest.put(3, 36);
        int getal = mapTest.get(0);
        return getal;
    }

    private Text setupTextStyle(Text text) {
        text.setStyle("-fx-text-fill : black;");
        text.setStyle("-fx-font-family: 'Verdana'");
        text.setStyle("-fx-font-size: 50");
        return text;
    }

    private void sortOutRankings() {

    }


}
