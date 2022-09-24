package com.bumblebee.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author bumblebee
 */
@Slf4j
@Aspect
public class AspectV2 {

    // com.bumblebee.aop.order 패키지와 하위 패키지
    @Pointcut("execution(* com.bumblebee.aop.order..*(..))")
    private void allOrder() {} // pointcut signature

    @Around("allOrder()")
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("[log {}]", joinPoint.getSignature()); //join point 시그니처
        return joinPoint.proceed();
    }

}
