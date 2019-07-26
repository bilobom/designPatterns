/**
 * StockObserver
 */
public class StockObserver implements IObserver {

    private Subject stockGrabber;

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private int observerID;

    private static int observerIDTracker = 0;

    public StockObserver(Subject newStockGrabber) {
        this.stockGrabber = newStockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);

    }

    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        System.out.println("ObserverID" + this.observerID+" says : Yay I have been notified and I'm updating me");
        printPrices();
    }

    public void printPrices() {

        System.out.println("IBM Price: " + this.ibmPrice);
        System.out.println("Apple Price: " + this.aaplPrice);
        System.out.println("Google Price: " + this.googPrice);
    }
}