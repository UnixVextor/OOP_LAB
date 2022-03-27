package src;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
public class Pro4_64010806_10 extends Application{
    @Override
    public void start(Stage window) {
    CarPane pane = new CarPane();
    pane.setOnMousePressed(e -> pane.pause());
    pane.setOnMouseReleased(e -> pane.play());

    pane.setOnKeyPressed(e ->{
        if(e.getCode() == KeyCode.UP) pane.increaseSpeed();
        else if(e.getCode() == KeyCode.DOWN) pane.decreaseSpeed();
    });

    Scene scene = new Scene(pane,600,100);
    window.setTitle("Excersice15_29");
    window.setScene(scene);
    window.show();

    pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
