package com.trivadis.spring.user;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitor {

//    @Around("execution(* com.trivadis.spring.user.service..*.*(..))") // Pointcut
    @Around("@annotation(com.trivadis.spring.user.Duration)")
    public Object monitor(ProceedingJoinPoint pjp) throws Throwable {
        long before = System.currentTimeMillis();

        // Methode - Service
        try {
            return pjp.proceed();
        } finally {
            long after = System.currentTimeMillis();
            long duration = after - before;
            System.out.println("Duration: " + duration + "ms");
        }
    }
}
