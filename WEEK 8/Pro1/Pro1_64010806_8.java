package Pro1;
import java.util.*;

public class Pro1_64010806_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        double side3;
        boolean filled;
        do {
            System.out.print("Enter side1 of Triangle: ");
            side1 = input.nextDouble();
            if(side1 < 0) System.out.println("The number is must to be positive number.");  
        } while (side1 < 0);
        
        do {
            System.out.print("Enter side2 of Triangle: ");
            side2 = input.nextDouble();
            if(side2 < 0) System.out.println("The number is must to be positive number.");
            
        } while (side2 < 0);
        
        do {
            System.out.print("Enter side3 of Triangle: ");
            side3 = input.nextDouble();
            if(side3 < 0) System.out.println("The number is must to be positive number.");
            
        } while (side3 < 0);
        
        System.out.print("Enter your color : ");
        String color = input.next();
        try { 
                System.out.print("Is triangle filled (true or false):");
                filled = input.nextBoolean();
                Triangle triangle = new Triangle(side1,side2,side3,color,filled);
                System.out.println(triangle.toString());   
        } catch (Exception e) {
                System.out.println("Enter filled only true or false");
        }    
        input.close();
    }
}
