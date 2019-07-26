/**
 * Subject
 */
public interface Subject {

    public void register(IObserver o);

    public void unregister(IObserver o);

    public void notifyObserver();
}