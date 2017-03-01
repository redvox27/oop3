package week2;

/**
 * Created by vincent on 1-3-2017.
 */
public class StockApp{
    public static void main(String[] args){

        // create concrete subject
        StockGrabber stockGrabber = new StockGrabber();

        // create and register concrete observer
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);
    }
}