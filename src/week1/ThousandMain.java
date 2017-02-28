package week1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Gebruiker on 24-2-2017.
 */
public class ThousandMain  {

    public static void main(String args[]){
        ThousandThreads threads = new ThousandThreads();

        for(int i = 0; i< 100; i++){
            Thread thread = new Thread(threads);
            thread.start();
        }

    }
}
