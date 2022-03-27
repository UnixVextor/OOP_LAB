package src;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
public class Pro3_64010806_10 extends Application{
    @Override
    public void start(Stage window) {
        ClockPane clock = new ClockPane((int)(Math.random() * 12),((int)(Math.random() *2) == 1 ? 30:0),0);
        String timeString = clock.getHr() + ":" + clock.getMin() + ":" + clock.getSec();
        clock.setSecondHandVisible(false);
        Label time = new Label(timeString);
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(time);
        BorderPane.setAlignment(time, Pos.TOP_CENTER);

        Scene scene = new Scene(pane,250,250);
        window.setTitle("Exercise14_28");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
