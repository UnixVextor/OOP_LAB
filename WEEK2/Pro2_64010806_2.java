import java.util.Random;
import java.util.Scanner;

public class Pro2_64010806_2 {
    public static void main(String[] args) {
        String[] game = {"scissor", "rock", "paper"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int PC = random.nextInt(3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = scanner.nextInt();

        if(PC == player)
            System.out.println("The PC is " + game[PC] + ". player are " + game[player] + " too. It is a draw");
        else if(PC == 0 && player == 1)
            System.out.println("The PC is " + game[PC] + ". player are " + game[player] + " player Won");
        else if(PC == 0  && player == 3)
            System.out.println("The PC is " + game[PC] + ". player are " + game[player] + " player Lose");
        else if(PC == 1 && player == 0)
            System.out.println("The PC is " + game[PC] + ". player are " + game[player] + " player Lose");
        else if(PC == 1 && player == 2)
            System.out.println("The PC is " + game[PC] + ". player are " + game[player] + " player Won");
        else if(PC == 2 && player == 0)
            System.out.println("The PC is " + game[PC] + ". player are " + game[player] + " player Won");
        else if(PC == 2 && player == 1)
            System.out.println("The PC is " + game[PC] + ". player are " + game[player] + " player Lose");
        else if(player > 2)
            System.out.println("Please enter number between 0 - 2 next time!");
    }
}