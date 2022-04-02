package Pro3;
public class Pro3_64010806_8 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5,"red",true);
        Rectangle r2 = new Rectangle(7,6,"green", false);
        Rectangle r3 = new Rectangle(6,7,"yellow",true);

        System.out.println("Rectangle1 Area : " + r1.getArea());
        System.out.println("Rectangle2 Area : " + r2.getArea());
        System.out.println("Rectangle3 Area : " + r3.getArea());

        System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") + 
                           "equal to Rectangle2");
        System.out.println("Rectangle2 is " + (r2.equals(r3) ? "" : "not ") + 
                           "equal to Recatangle3");
    
    }
}
