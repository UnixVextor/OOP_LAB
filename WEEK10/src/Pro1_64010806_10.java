package src;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Pro1_64010806_10 extends Application {
    
    @Override
    public void start(Stage window) {
        GridPane pane = new GridPane();

        pane.add(new ImageView(new Image("image/uk.gif")),0,0);
        pane.add(new ImageView(new Image("image/ca.gif")),1,0);
        pane.add(new ImageView(new Image("image/china.gif")),0,1);
        pane.add(new ImageView(new Image("image/us.gif")), 1, 1);
      
        Scene scene = new Scene(pane);
        window.setTitle("Pro1");
        window.setScene(scene);
        window.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
