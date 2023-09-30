package lab.jaeyeal.memory.concert;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;

@Aspect // 더이상 POJO가 아니라 Aspect임을 명시.
@Slf4j
public class Audience {

    @Pointcut("execution(* lab.jaeyeal.memory.concert.Performance.perform(..))")
    public void performance() {};

    @Before("performance()") // 공연 이전
    public void silenceCellPhone() {
        log.info("Silence CellPhones...");
    }
    @Before("performance()") // 공연 이전
    public void taskSeats() {
        log.info("Taking seats");
    }

    @AfterReturning("performance()") // 공연 후
    public void applause() {
        log.info("CLAP !!! :: CLAP!!!");
    }

    @AfterThrowing("performance()") // 공연 실패 후˚
    public void demandRefund() {
        log.info("Demanding a refund");
    }




}
