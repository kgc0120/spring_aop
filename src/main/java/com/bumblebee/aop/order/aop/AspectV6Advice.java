package com.bumblebee.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author bumblebee
 */
@Slf4j
@Aspect
public class AspectV6Advice {

    @Around("com.bumblebee.aop.order.aop.Pointcuts.orderAndService()")
    public Object doTracsaction(ProceedingJoinPoint joinPoint) throws Throwable {

        try {
//            @Before
            log.info("[트랜잭션 시작] {}",joinPoint.getSignature() );
            Object result = joinPoint.proceed();
//            @AfterReturning
            log.info("[트랜잭션 커밋] {}",joinPoint.getSignature() );
            return result;
        }catch (Exception e) {
//            @AfterThrowing
            log.info("[트랜잭션 롤백 {}]", joinPoint.getSignature());
            throw e;
        }finally {
//            @After
            log.info("[리소스 릴리즈 {}]", joinPoint.getSignature());
        }
    }

    @Before("com.bumblebee.aop.order.aop.Pointcuts.orderAndService()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("[before] {}", joinPoint.getSignature());
    }

    @AfterReturning(value = "com.bumblebee.aop.order.aop.Pointcuts.orderAndService()", returning = "result")
    public void doReturn(JoinPoint joinPoint, Object result) { // retruning 절에 지정된 타입의 값을 반환하는 메서드만 대상으로 실행된다.(부모 타입을 지정하면 모든 자식 타입은 인정된다.)
        log.info("[return] {} return={}", joinPoint.getSignature(), result);
    }

    @AfterThrowing(value = "com.bumblebee.aop.order.aop.Pointcuts.orderAndService()", throwing = "ex")
    public void doThrowing(JoinPoint joinPoint, Exception ex) {
        log.info("[ex] {} messaage={}", ex);
    }

    @After(value = "com.bumblebee.aop.order.aop.Pointcuts.orderAndService()")
    public void doAfter(JoinPoint joinPoint) { //finally 용도로 많이 사용
        log.info("[afger] {}", joinPoint.getSignature());
    }


}
