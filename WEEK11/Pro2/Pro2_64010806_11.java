package Pro2;

import java.util.*;
public class Pro2_64010806_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false)? : ");
        boolean filled = input.nextBoolean();
        boolean repeatSideInput = true;

        do{
            System.out.print("Enter three side of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            try {
                Triangle triangle = new Triangle(side1,side2,side3);
                repeatSideInput = false;
                triangle.setColor(color);
                triangle.setFilled(filled);

                System.out.println(triangle.toString());
                System.out.format("Area: %.3f",triangle.getArea());
                System.out.println("\nPerimeter: " + triangle.getPerimeter());
                System.out.println("Color: " + triangle.getColor());
                System.out.println("Triangle is " + (triangle.isFilled() ? "":"not") + "filled");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }

        }while(repeatSideInput);
        input.close();
    }
}
