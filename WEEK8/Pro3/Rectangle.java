package Pro3;
import Pro1.GeometricObject;
import java.lang.Comparable;
public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private double width;
    private double height;
    
    public Rectangle(){
        width = 0;
        height = 0;
    }
    
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width,double height,String color,boolean filled){
        this(width, height);
        setColor(color);
        setFilled(filled);
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    
    public int compareTo(Rectangle o){
        if(getArea() > o.getArea()) return 1;
        else if(getArea() < o.getArea()) return -1;
        else return 0;
    }
    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width * 2) + (height*2);
    }

    public boolean equals(Object o){
        return this.compareTo((Rectangle)o) == 0;
    }

    @Override 
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}
