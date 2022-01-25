import java.util.*;

public class Pro4_64010806 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter weight in pounds: ");
            double w = scan.nextFloat();
            System.out.print("Enter height in inches: ");
            double h = scan.nextFloat();
            double BMI = (w*0.45359237)/Math.pow(h*0.0254, 2);
            System.out.format("BMI : %.4f", BMI);
        } catch(Exception e){
            System.out.println("Plese enter number in decimal number!!");
        }
    }
}
