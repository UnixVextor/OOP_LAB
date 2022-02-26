package Pro2;
import Pro1.GeometricObject;

public class Square extends GeometricObject implements Colorable{
    double side;
    public  Square() {
        // no-arg
    }
    
    public Square(double side){
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    @Override
    public String howToColor(){
        return "color all four side";
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return side * 4;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSide : " + side + "\nArea" +
        getArea() + "\nPerimeter : " + getPerimeter();
    }
}