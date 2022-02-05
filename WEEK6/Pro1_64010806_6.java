import java.util.*;
/**
 * Pro1_64010806_6
 */
public class Pro1_64010806_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = input.nextLine();
        System.out.print("Your Age: ");
        int age = input.nextInt();
        System.out.print("Weight in pound: ");
        double weigth = input.nextDouble();
        System.out.print("height in inches: ");
        double height = input.nextDouble();
        BMI person = new BMI(name,age,weigth,height/12,height%12);
        System.out.format("BMI value: %.2f\n",person.getBMI());
        System.out.println("Interpretation: " + person.getInterpretation());
        input.close();
    }
    
}