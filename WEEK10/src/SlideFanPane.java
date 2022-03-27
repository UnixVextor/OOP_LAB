package src;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class SlideFanPane extends Pane{
    private Circle circle = new Circle();
    private double startAngle = 15;
    private Timeline fan;
    private Pane paneforBlades = new Pane();
    private Arc arc;

    public SlideFanPane(){
        setPadding(new Insets(10,10,10,10));
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        circle.centerXProperty().bind(widthProperty().divide(2));
        circle.centerYProperty().bind(heightProperty().divide(2));;
        circle.radiusProperty().bind(heightProperty().divide(2).multiply(.90));
        getBlades();
        getChildren().addAll(circle,paneforBlades); 
        fan = new Timeline(new KeyFrame(Duration.millis(50),e -> spinFan()));   
        fan.setCycleCount(Timeline.INDEFINITE);
        fan.play();
    }

    protected void spinFan(){
        ObservableList<Node> list = paneforBlades.getChildren();
        for (int i = 0; i < list.size(); i++) {
            Arc a = (Arc)list.get(i);
            a.setStartAngle(a.getStartAngle() + startAngle);
        }
    }

    public void pause(){
        fan.pause();
    }

    public void reverse(){
        startAngle *= -1;
    }

    public void play(){
        fan.play();
    }

    public DoubleProperty ratProperty(){
        return fan.rateProperty();
    }

    private void getBlades(){
        double angle = 0;
        for (int i = 0; i < 4; i++) {
            arc = new Arc();
            arc.centerXProperty().bind(widthProperty().divide(2));
            arc.centerYProperty().bind(heightProperty().divide(2));
            arc.radiusXProperty().bind(circle.radiusProperty().multiply(.90));
            arc.radiusYProperty().bind(circle.radiusProperty().multiply(.90));
            arc.setStartAngle(angle+90);
            arc.setLength(50);
            arc.setFill(Color.BLACK);
            arc.setType(ArcType.ROUND);
            paneforBlades.getChildren().add(arc);
            angle += 90;
        }
    }
}
