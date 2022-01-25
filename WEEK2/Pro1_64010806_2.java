import java.util.Scanner;

public class Pro1_64010806_2 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int count = scanner.nextInt(); 
        System.out.println("Today is " + days[day] + " and the future day is " + days[day + (count%7)]);
    }
}