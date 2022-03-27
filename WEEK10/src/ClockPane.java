package src;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class ClockPane extends Pane{
    private int hr;
    private int min;
    private int sec;
    private boolean hourHandVisible;
    private boolean minuteHandVisible;
    private boolean secondHandVisible;

    private double w = 250, h = 250;

    public ClockPane(){
        setCurrentTime();
    }

    public ClockPane(int hr,int min,int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        hourHandVisible = true;
        minuteHandVisible = true;
        secondHandVisible = true;
        painClock();
    }

    public void setHr(int hr){
        this.hr = hr;
        painClock();
    }

    public int getHr(){
        return hr;
    }

    public void setMin(int min){
        this.min = min;
        painClock();
    }

    public int getMin(){
        return min;
    }

    public void setSec(int sec){
        this.sec = sec;
        painClock();
    }

    public int getSec(){
        return sec;
    }

    public void setW(double w){
        this.w = w;
        painClock();
    }

    public double getW(){
        return w;
    }

    public void setH(double h){
        this.h = h;
        painClock();
    }

    public double getH(){
        return h;
    }

    public void setHourHandVisible(boolean hourHandVisible){
        this.hourHandVisible = hourHandVisible;
    }

    public boolean isHourHandVisible(){
        return hourHandVisible;
    }

    public void setMinuteHandVisible(boolean minuteHandVisible){
        this.minuteHandVisible = minuteHandVisible;
        painClock();
    }

    public boolean isMinuteHandVisible(){
        return minuteHandVisible;
    }

    public void setSecondHandVisible(boolean secondHandVisible){
        this.secondHandVisible = secondHandVisible;
        painClock();
    }

    public boolean isSecondHandVisible(){
        return secondHandVisible;
    }

    public void setCurrentTime(){
        Calendar calendar = new GregorianCalendar();
        this.hr = calendar.get(Calendar.HOUR_OF_DAY);
        this.min = calendar.get(Calendar.MINUTE);
        this.sec = calendar.get(Calendar.SECOND);

        painClock();
    }

    protected void painClock(){
        double clockRadius = Math.min(w,h) * 0.8 * 0.5;
        double centerX = w/2;
        double centerY = h/2;

        Circle circle = new Circle(centerX,centerY,clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5,centerY - clockRadius + 12, "12");
        Text t2 = new Text(centerX - clockRadius + 3,centerY + 5,"9");
        Text t3 = new Text(centerX + clockRadius - 10,centerY + 3,"3");
        Text t4 = new Text(centerX - 3,centerY + clockRadius - 3, "6");

        double slength = clockRadius * 0.8;
        double secondX = centerX + slength * Math.sin(sec * (2 * Math.PI / 60));
        double secondY = centerY - slength * Math.cos(sec *(2 * Math.PI / 60));
        Line sline = new Line(centerX,centerY,secondX,secondY);
        sline.setStroke(Color.ORANGE);

        double mlength = clockRadius * 0.65;
        double minuteX = centerX + mlength * Math.sin(min * (2 * Math.PI/60));
        double minuteY = centerY - mlength * Math.cos(min * (2 * Math.PI/60));
        Line mline = new Line(centerX,centerY,minuteX,minuteY);
        mline.setStroke(Color.GREEN);

        double hlength = clockRadius * 0.5;
        double hourX = centerX + hlength * Math.sin((hr % 12 + min/60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hlength * Math.cos((hr % 12 + min/60.0) * (2 * Math.PI / 12));
        Line hline = new Line(centerX,centerY,hourX,hourY);
        hline.setStroke(Color.BLUE);
    
        getChildren().clear();
        getChildren().addAll(circle, t1,t2,t3,t4);
        if(secondHandVisible) getChildren().add(sline);
        if(minuteHandVisible) getChildren().add(mline);
        if(hourHandVisible) getChildren().add(hline);
    }
}
