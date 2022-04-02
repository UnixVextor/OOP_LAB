package src;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Test extends Application {
    @Override
    public void start(Stage window) {
        Pane pane = new Pane();
        Arc c = new Arc();
        c.setCenterX(100);
        c.setCenterY(100);
        c.setRadiusX(50);
        c.setRadiusY(50);
        c.setStartAngle(10);
        c.setLength(100);
        c.setType(ArcType.ROUND);
        c.setFill(Color.BLUE);

        pane.getChildren().addAll(c);
        Scene scene = new Scene(pane,200,200);
        window.setTitle("Test");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
