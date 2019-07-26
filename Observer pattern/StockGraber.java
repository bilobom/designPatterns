import java.util.ArrayList;

/**
 * StockGraber
 */
public class StockGraber implements Subject {

    private ArrayList<IObserver> observers;
    private double imbPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGraber() {
        observers = new ArrayList<IObserver>();
    }

    public void register(IObserver newObserver) {
        observers.add(newObserver);
    }

    public void unregister(IObserver removeObserver) {
        int removeObserverIndex = observers.indexOf(removeObserver);
        observers.remove(removeObserverIndex);

        System.out.println("Observer " + (removeObserverIndex + 1) + "deleted");

    }

    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update(imbPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice) {
        this.imbPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}