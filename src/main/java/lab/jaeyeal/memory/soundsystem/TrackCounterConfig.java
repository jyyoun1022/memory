package lab.jaeyeal.memory.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy // AspectJ Auto Proxying Activate
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers() {

        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper;s Longely HEart Club Band");
        tracks.add("With a Little Help fro my Fr");
        tracks.add("Lucy in the sky the Diamond");
        tracks.add("Getting Better");
        tracks.add("Gixing a  hole");

        return BlankDisc.builder()
                .title("Sgt. Pepper's Lonely Hearts Club Band")
                .artist("The Beatles")
                .tracks(tracks)
                .build();
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
