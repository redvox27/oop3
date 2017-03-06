package week3_ex1;

/**
 * Created by Gebruiker on 6-3-2017.
 */
public class TurnTVOn implements Command {

    ElectronicDevice tv;

    public TurnTVOn(ElectronicDevice device){
        tv = device;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
