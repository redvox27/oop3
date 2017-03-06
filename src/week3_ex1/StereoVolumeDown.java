package week3_ex1;

/**
 * Created by Gebruiker on 6-3-2017.
 */
public class StereoVolumeDown implements Command {
    ElectronicDevice stereo;

    public StereoVolumeDown(ElectronicDevice device){
        stereo = device;
    }

    @Override
    public void execute() {
        stereo.volumenDown();
    }
}
