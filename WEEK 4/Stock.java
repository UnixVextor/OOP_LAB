public class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent(){
        double diff = this.currentPrice - this.previousClosingPrice;
        double divide = this.previousClosingPrice;
        double result = (diff/divide) * 100;
        return result;
    }

}