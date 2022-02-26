package Pro2;
public class Pro2_64010806_8 {
    public static void main(String[] args) {
        Square[] square = {new Square(2.3),new Square(4.9),new Square(2.0),new Square(1.5),new Square(5.6)};
        
        for (int i = 0; i < square.length; i++) {
            System.out.println("Square #" + (i+1));
            System.out.println("Area : " + square[i].getArea());
            System.out.println("Perimeter : " + square[i].getPerimeter());
            System.out.println("How to color: " + square[i].howToColor());
            System.out.println();
        }
    }
    
}