package lab.jaeyeal.memory.concert;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Slf4j
public class Audience {

    @Before("execution(* lab.jaeyeal.memory.concert.Performance.perform(..))") // 공연 이전
    public void silenceCellPhone() {
        log.info("Silence CellPhones...");
    }
    @Before("execution(* lab.jaeyeal.memory.concert.Performance.perform(..))") // 공연 이전
    public void taskSeats() {
        log.info("Taking seats");
    }

    @AfterReturning("execution(* lab.jaeyeal.memory.concert.Performance.perform(..))") // 공연 후
    public void applause() {
        log.info("CLAP !!! :: CLAP!!!");
    }

    @AfterThrowing("execution(* lab.jaeyeal.memory.concert.Performance.perform(..))") // 공연 실패 후˚
    public void demandRefund() {
        log.info("Demanding a refund");
    }




}
