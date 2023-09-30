package lab.jaeyeal.memory.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Test";
    private String artist = "The Beatels";

    @Override
    public void play() {

    }

    @Override
    public void playTrack(int trackNumber) {

    }
}
