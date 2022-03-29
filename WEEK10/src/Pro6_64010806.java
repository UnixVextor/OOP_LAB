package src;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Pro6_64010806 extends Application {
    @Override
    public void start(Stage window) {
        Button btPause = new Button("Pause");
        Button btResume = new Button("Resume");
        Button btReverse = new Button("Reverse");

        HBox paneForButton = new HBox(5);
        paneForButton.setAlignment(Pos.CENTER);
        paneForButton.getChildren().addAll(btPause,btResume,btReverse);

        SlideFanPane fan = new SlideFanPane();

        Slider slider = new Slider();
        slider.setMax(10);
        fan.ratProperty().bind(slider.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setTop(paneForButton);
        pane.setCenter(fan);
        pane.setBottom(slider);

        btPause.setOnAction(e -> {
            fan.pause();
        });

        btResume.setOnAction(e ->{
            fan.play();
        });

        btReverse.setOnAction(e -> {
            fan.reverse();
        });

        Scene scene = new Scene(pane,200,200);
        window.setTitle("Pro6");
        window.setScene(scene);
        window.show();
    }    
    public static void main(String[] args) {
        launch(args);
    }
}
