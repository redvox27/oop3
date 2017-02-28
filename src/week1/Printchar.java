package week1;

/**
 * Created by Gebruiker on 24-2-2017.
 */
public class Printchar implements Runnable {
    private String charToPrint;
    private int times;

    public Printchar(String charToPrint, int times){
        this.charToPrint = charToPrint;
        this.times = times;
    }

    public  String returnChar(){
        String temp = "";

        for (int i = 0; i < times; i++){
            temp = charToPrint;
        }
        return temp;
    }

    @Override
    public void run() {
        for(int i = 1; i < times; i++){
            System.out.print(charToPrint);
        }

    }
}
