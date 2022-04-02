import java.util.*;

public class Pro4_64010806_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Order[] = {"first","second","third"};
        String city[] = {"","",""};
        for(int i = 0; i<3; i++){
            System.out.print("Enter the " + Order[i] +" city: ");
            String input = scanner.nextLine();
            input = input.trim().toLowerCase();
            city[i] = input;
        }
        Arrays.sort(city);
        System.out.println("The three city in alphabetical Order are " + city[0] + " " + city[1] + " " + city[2]);
        scanner.close();
    }
}