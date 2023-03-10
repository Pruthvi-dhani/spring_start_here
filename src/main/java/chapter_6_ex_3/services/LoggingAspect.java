package chapter_6_ex_3.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] methodArgs = joinPoint.getArgs();
        logger.info("Method: " + methodName + " with args: " + Arrays.toString(methodArgs) + " will execute...");
        Object returnObj = joinPoint.proceed();
        logger.info("Method has returned: " + returnObj);
        return returnObj;
    }

    @Before("@annotation(BeforeLog)")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] methodArgs = joinPoint.getArgs();
        logger.info("Before Method: " + methodName + " with args: " + Arrays.toString(methodArgs) +
                " will execute...");
    }

    @AfterReturning(pointcut = "@annotation(AfterLog)", returning = "returnVal")
    public void logAfter(JoinPoint joinPoint, Object returnVal) {
        String methodName = joinPoint.getSignature().getName();
        Object[] methodArgs = joinPoint.getArgs();
        logger.info("After Method: " + methodName + " with args: " + Arrays.toString(methodArgs) +
                " has executed and has returned: " + returnVal);
    }

}
