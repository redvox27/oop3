package week3_ex1;

/**
 * Created by Gebruiker on 6-3-2017.
 */
public class StereoVolumeUp implements Command {
    ElectronicDevice stereo;

    public StereoVolumeUp(ElectronicDevice device){
        stereo = device;
    }

    @Override
    public void execute() {
        stereo.volumeUp();
    }
}
