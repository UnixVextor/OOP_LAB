import java.util.*;
public class Pro6_64010806_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] account = new Account[10];
        for (int i = 0; i < 10; i++) {
            account[i] = new Account(i,100);
        }
        int choice = 0;
        System.out.print("Enter an id: ");
        int id = input.nextInt();
        while(id <= 9){
            while(choice != 4){
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                choice = input.nextInt();
                if(choice == 1){
                    System.out.println("The balance is " + account[id].getBalance());
                }else if(choice == 2){
                    System.out.print("Enter an amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    account[id].withdraw(withdraw);
                }else if(choice == 3){
                    System.out.print("Enter an amount to deposit: ");
                    int deposit = input.nextInt();
                    account[id].deposit(deposit);
                }else if(choice == 4){
                    System.out.println("End of program");
                }
            }
            choice = 0;
            System.out.print("\nEnter an id: ");
            id = input.nextInt();
        }
        input.close();

    }
}
