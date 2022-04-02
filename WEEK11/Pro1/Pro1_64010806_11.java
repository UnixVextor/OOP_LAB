package Pro1;


import java.util.*;
public class Pro1_64010806_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data  = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.print("Enter the index of the array: ");
        try {
            System.out.println("The corresponding element value is " + data[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        } 
        input.close();
    }

}
