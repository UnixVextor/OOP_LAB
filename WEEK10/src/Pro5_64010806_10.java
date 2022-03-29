package src;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Pro5_64010806_10 extends Application{
    @Override
    public void start(Stage window) {
        FanPane pane = new FanPane();

        Button btPause = new Button("Pause");
        Button btResume = new Button("Resume");
        Button btReverse = new Button("Reverse");
        HBox hbox = new HBox(5);
        hbox.setAlignment(Pos.CENTER);

        hbox.getChildren().addAll(btPause,btResume,btReverse);

        BorderPane borderpane = new BorderPane();
        borderpane.setCenter(pane);
        borderpane.setBottom(hbox);

        btPause.setOnAction(e -> {
            pane.pause();
        });
        btResume.setOnAction(e -> {
            pane.play();
        });
        btReverse.setOnAction(e -> {
            pane.reverse();
        });

        Scene scene = new Scene(borderpane,250,250);
        window.setTitle("Pro5");
        window.setScene(scene);
        window.show();
        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
