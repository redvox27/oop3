package week2;

/**
 * Created by vincent on 1-3-2017.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
