package Sagrada.View;

import Sagrada.Controller.MyApp;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class DashboardPane extends BorderPane {

    private VBox nav;
    private DashboardScene dashboard;

    public DashboardPane(DashboardScene dashboard) {
        super();
        this.dashboard = dashboard;
        SetNav();
    }

    private void SetNav(){
        nav = new VBox();
        nav.setPadding(new Insets(50, 150,0,50));
        nav.setSpacing(50);
        nav.getChildren().addAll(
                SetNavItem("Players", 1),
                SetNavItem("Games",2),
                SetNavItem("Ranks",3),
                SetNavItem("Challanges",4)
        );
        setCenter(nav);
    }

    private Button SetNavItem(String name, int paneIndex){
        Button btn = new Button(name);
        btn.setMinWidth(400);
        Font font = Font.font("Arial", 36);
        btn.setFont(font);
        btn.setOnAction(e -> dashboard.SwitchPane(paneIndex, name));
        return btn;
    }


}
