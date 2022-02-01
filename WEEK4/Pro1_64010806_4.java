import java.util.*;
public class Pro1_64010806_4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Symbol: ");
        String symbol = input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();

        Stock stock = new Stock(symbol,name);

        System.out.print("Previous Closing Price: ");
        stock.previousClosingPrice = input.nextDouble();
        System.out.print("Current Price: ");
        stock.currentPrice = input.nextDouble();
        System.out.print("Price Change: " + stock.getChangePercent() + "%");
        
        input.close();
    }
}