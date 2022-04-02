public class Pro1_64010806_4{
    public static void main(String[] args) {
        String symbol = "ORCL";
        String name = " Oracle Coperation";
        Stock stock = new Stock(symbol,name);
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("symbol: " + stock.symbol);
        System.out.println("name: " + stock.name);
        System.out.println("Previous Closing Price: " + stock.previousClosingPrice);
        System.out.println("Current Price: " + stock.currentPrice);
        System.out.println("Price Change: " + stock.getChangePercent() + "%");
        
    }
}