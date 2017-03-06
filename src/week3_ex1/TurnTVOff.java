package week3_ex1;

/**
 * Created by Gebruiker on 6-3-2017.
 */
public class TurnTVOff implements Command {
    ElectronicDevice tv;

    public TurnTVOff(ElectronicDevice device){
        tv = device;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
