package lab.jaeyeal.memory.soundsystem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;
    private List<String> tracks;

    @Override
    public void play() {
        for (String track : tracks) {
            log.info("Playing " + title + "by " + artist + "TRACK :: {}",track);
        }
    }

    @Override
    public void playTrack(int trackNumber) {

    }
}
