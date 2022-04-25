package Sagrada.Controller;

public class DashboardController {

    private MyApp ma;

    public DashboardController(MyApp ma) {
        this.ma = ma;

        this.switchScene();
    }

    private void switchScene() {
        ma.switchScene();
    }

}
