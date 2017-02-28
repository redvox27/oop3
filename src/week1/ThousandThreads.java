package week1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Gebruiker on 24-2-2017.
 */
public class ThousandThreads implements Runnable{
    private static Integer counter = 0;
    private static String text = "new thread created...";
    //private ReentrantLock lock = new ReentrantLock();

    public ThousandThreads(){

    }

    public  static void increment(){
        System.out.println(text);
        counter++;
        System.out.println(counter);
    }

    public synchronized void run(){
        increment();
    }
}
