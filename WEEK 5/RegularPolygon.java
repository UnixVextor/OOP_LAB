/**
 * RegularPolygon
 */
public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    public RegularPolygon(){
       
    }

    public RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
    }
    
    public RegularPolygon(int n,double side,double x,double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setNumSide(int n){
        this.n = n;
    }

    public int getNumSide(){
        return this.n;
    }

    public void setLengthofSide(double side){
        this.side = side;
    }

    public double getLengthofSide(){
        return this.side;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return this.x;
    }

    public void setY(double y){
        this.y = x;
    }

    public double getY(){
        return this.y;
    }

    public double getPerimeter(){
        return this.n * this.side;
    }

    public double getArea(){
        double pi = Math.PI;
        return (n * Math.pow(side, 2)) / (4 * Math.tan(pi/n));
    }
    
}