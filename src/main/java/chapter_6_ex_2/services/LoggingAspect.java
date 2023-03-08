package chapter_6_ex_2.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* chapter_6_ex_2.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Method: " + methodName + " will execute with params: " + Arrays.asList(arguments));
        Object returnedByMethod = joinPoint.proceed();
        logger.info("Method executed and has returned: " + returnedByMethod);
        return returnedByMethod;
    }
}
