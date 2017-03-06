package week3_ex1;

/**
 * Created by Gebruiker on 6-3-2017.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Command[] volumeUpCommands;
    Command[] volumeDownCommands;

    public RemoteControl(){
        onCommands = new Command[10];
        offCommands = new Command[10];

        volumeUpCommands = new Command[10];
        volumeDownCommands = new Command[10];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 10; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

            volumeUpCommands[i] = noCommand;
            volumeDownCommands[i] = noCommand;
        }
    }

    public void setOnCommands(int index, Command onComand, Command offCommand){
        this.onCommands[index] = onComand;
        this.offCommands[index] = offCommand;
    }

    public void setVolume(int index,Command volumeUpCommand, Command volumeDownCommand){
        this.volumeUpCommands[index] = volumeUpCommand;
        this.volumeUpCommands[index] = volumeDownCommand;
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot){
        offCommands[slot].execute();
    }

    public void volumeUp(int slot){
        volumeUpCommands[slot].execute();
    }

    public void volumeDown(int slot){
        volumeDownCommands[slot].execute();
    }

}
