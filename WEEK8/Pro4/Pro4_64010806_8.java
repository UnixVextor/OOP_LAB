package Pro4;
public class Pro4_64010806_8 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(3);
        System.out.println("Octagon Area: " + octagon1.getArea());
        System.out.println("Octagon Perimeter : " + octagon1.getPerimeter());
        System.out.println();

        Octagon octagon2 = (Octagon)octagon1.clone();
        System.out.println("Octagon clone Area: " + octagon2.getArea());
        System.out.println("Octagon clone Perimeter : " + octagon2.getPerimeter());
        System.out.println();
        int result = octagon1.compareTo(octagon2);
        if(result == 1) System.out.println("Octagon is greather than its clone.");
        else if(result == -1) System.out.println("Octagon is less than its clone.");
        else System.out.println("Octagon is equal to its clone.");
    }
}
