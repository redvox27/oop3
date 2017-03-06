package week3_ex1;

/**
 * Created by Gebruiker on 6-3-2017.
 */
public class RemoteMain {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Television tv = new Television();
        Stereo stereo = new Stereo();

        TurnTVOn tvOnCommand = new TurnTVOn(tv);
        TurnTVOff tvOffCommand = new TurnTVOff(tv);

        StereoVolumeUp volumeUpCommand = new StereoVolumeUp(stereo);
        StereoVolumeDown volumeDownCommand = new StereoVolumeDown(stereo);

        control.setOnCommands(0,tvOnCommand,tvOffCommand);
        control.setVolume(0,volumeUpCommand,volumeDownCommand);

        control.onButtonPushed(0);
        control.offButtonPushed(0);

        control.volumeUp(0);
        control.volumeDown(0);
    }

}
