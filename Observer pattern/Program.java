/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        StockGraber stockGraber = new StockGraber();
        StockObserver stockObserver = new StockObserver(stockGraber);
        StockObserver stockObserver2 = new StockObserver(stockGraber);

        stockGraber.setIBMPrice(54.5);
        stockGraber.setAAPLPrice(100.2);
        stockGraber.setGOOGPrice(150.4);

    }
}