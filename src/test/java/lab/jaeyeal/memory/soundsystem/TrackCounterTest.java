package lab.jaeyeal.memory.soundsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackCounter counter;

    @Test
    @DisplayName("Count Track")
    public void testTrackCounter() {
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);
        compactDisc.playTrack(4);
        compactDisc.playTrack(4);
        compactDisc.playTrack(5);
        compactDisc.playTrack(5);

        Assertions.assertEquals(1, counter.getPlayCount(1));
        Assertions.assertEquals(2,counter.getPlayCount(2));

    }
}
