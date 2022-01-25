import java.util.*;
public class Pro3_64010806 {
    public static void main(String[] args) {
       try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Enter a number between 0 and 1000: ");
           int num = scan.nextInt();
           int result = 0;
           if(num > 0 && num < 1000){
            while(num > 0){
               result += num % 10;
               num = num / 10;
            }
            System.out.println("the sum of digti is " + result);
           }else{
               System.out.println("Invalid number");
           }
        } catch(Exception e){
            System.out.println("Plese enter the number");
        }
    }
}
