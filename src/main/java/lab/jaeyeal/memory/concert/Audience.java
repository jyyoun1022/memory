package lab.jaeyeal.memory.concert;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect // 더이상 POJO가 아니라 Aspect임을 명시.
@Slf4j
public class Audience {

    @Pointcut("execution(* lab.jaeyeal.memory.concert.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            log.info("Silence CellPhones...");
            log.info("Taking seats");
            jp.proceed();
            log.info("CLAP !!! :: CLAP!!!");
        } catch (Throwable e) {
            log.info("Demanding a refund");
        }
    }

    @Before("performance()") // 공연 이전
    public void silenceCellPhone() {

    }
    @Before("performance()") // 공연 이전
    public void taskSeats() {

    }

    @AfterReturning("performance()") // 공연 후
    public void applause() {

    }

    @AfterThrowing("performance()") // 공연 실패 후˚
    public void demandRefund() {
    }




}
