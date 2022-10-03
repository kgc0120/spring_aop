package com.bumblebee.aop.proxyvs.code;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author bumblebee
 */
@Slf4j
@Aspect
public class ProxyDiAspect {

    @Before("execution(* com.bumblebee.aop..*.*(..))")
    public void doTrace(JoinPoint joinPoint) {
        log.info("[proxyDiAdvice] {}", joinPoint.getSignature());
    }

}
