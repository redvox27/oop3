package week3_ex1;

/**
 * Created by Gebruiker on 6-3-2017.
 */
public class Television implements ElectronicDevice{

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV is on");

    }

    @Override
    public void off() {
        System.out.println("TV has been turned off");
    }

    @Override
    public void volumeUp() {
        volume ++ ;
        System.out.println("volume up pressed, volume is " + volume);
    }

    @Override
    public void volumenDown() {
        volume--;
        System.out.println("volume down pressed, volume is " + volume);
    }
}
