package com.bumblebee.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author bumblebee
 */
@Slf4j
@Aspect
public class AspectV1 {

    @Around("execution(* com.bumblebee.aop.order..*(..))")
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("[log {}]", joinPoint.getSignature()); //join point ์๊ทธ๋์ฒ
        return joinPoint.proceed();
    }

}
