package week3_ex1;

/**
 * Created by Gebruiker on 6-3-2017.
 */
public class Stereo implements ElectronicDevice {
    public int volume =0;

    @Override
    public void on() {
        System.out.println("stereo has been turned on");
    }

    @Override
    public void off() {
        System.out.println("stereo has been turned off");
    }

    @Override
    public void volumeUp() {
        volume ++;
        System.out.println("the volume has been cranked up " + volume);
    }

    @Override
    public void volumenDown() {
        volume --;
        System.out.println("volume has been cranked down " + volume);
    }
}
