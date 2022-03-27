package src;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Pro2_64010806_10 extends Application{
    @Override
    public void start(Stage window) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5,5,5,5));
        pane.setHgap(5);
        pane.setVgap(5);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField text = new TextField();
                text.setPrefColumnCount(1);
                text.setText(String.valueOf((int)(Math.random() * 2)));
                pane.add(text, i,j);
                GridPane.setHalignment(text, HPos.CENTER);
                GridPane.setValignment(text, VPos.CENTER);
            }
        }


        Scene scene = new Scene(pane);
        window.setTitle("Exercise14_07");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
