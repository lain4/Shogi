import game.Game;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Game game = new Game();

        stage.setTitle("｡◕ ‿ ◕｡\tShogi\t｡◕ ‿ ◕｡");
        stage.setScene(new Scene(game, Region.USE_PREF_SIZE, Region.USE_PREF_SIZE));
        stage.setOnCloseRequest(e -> Platform.exit());
        stage.show();
    }
}
