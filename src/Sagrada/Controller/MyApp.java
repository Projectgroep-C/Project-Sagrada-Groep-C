package Sagrada.Controller;

public class MyApp {

    private DashboardController dashboardController;

    public MyApp() {
        this.dashboardController = new DashboardController(this);
    }

    public String switchScene(int selectedScene) {
        //Temporarily return of String, actual code will come.
        String newScene;
        switch (selectedScene) {
            case 0:
                newScene = "AccountScene";
                break;
            case 1:
                newScene = "DashboardScene";
                break;
            case 2:
                newScene = "GameScene";
                break;
            case 3:
                newScene = "GameOverScene";
                break;
            default: return "ERROR";
        };
        return newScene;
    }
}
