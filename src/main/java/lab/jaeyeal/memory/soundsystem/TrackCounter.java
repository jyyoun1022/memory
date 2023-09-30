package lab.jaeyeal.memory.soundsystem;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Log4j2
public class TrackCounter {

    private Map<Integer,Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* lab.jaeyeal.memory.soundsystem.CompactDisc.playTrack(int))" +
            "&& args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        log.info(trackCounts);
        trackCounts.put(trackNumber,currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}
