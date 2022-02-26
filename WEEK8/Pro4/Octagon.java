package Pro4;
import Pro1.GeometricObject;
import java.lang.Comparable;
import java.lang.Cloneable;
public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
    private double side;
    public Octagon(){
    }
    public Octagon(double side){
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public double getArea(){
        return (2+(4/22) * side * side);
    }

    public double getPerimeter(){
        return side * 8;
    }

    public int compareTo(Octagon o){
        if(getArea() > o.getArea()) return 1;
        else if(getArea() < o.getArea()) return -1;
        else return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override 
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter();
	}
}
