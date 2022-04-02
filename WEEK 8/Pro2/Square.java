package Pro2;

import Pro1.GeometricObject;

public class Square extends GeometricObject implements Colorable{
    double side;
    public  Square() {
        // no-arg
    }
    
    public Square(double side){
        this.side = side;
        setFilled(false);
    }

    public Square(double side,boolean filled){
        this.side = side;
        setFilled(filled);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    @Override
    public String howToColor(){
        if(isFilled()){
            return "Color all four side is filled";
        }
        else return "Color all four side is not filled";
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