package playingcards24;
/**
 *
 * @author Alex Monteverde, Sebastien, Tyler Wisniewski
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class PlayingCards24 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("playingCardsFXML.fxml"));
    primaryStage.setTitle("Playing Cards");
    primaryStage.setScene( new Scene(root));
    primaryStage.show();
  }
}
