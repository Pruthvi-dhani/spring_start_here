package chapter_6_ex_4.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around(value = "@annotation(ToSecurity)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] methodArgs = joinPoint.getArgs();
        logger.info("Security Method: " + methodName + " with Args: " + Arrays.toString(methodArgs)
                + " will execute...");
        Object returnVal = joinPoint.proceed();
        logger.info("Security Return val is: " + returnVal);
        return returnVal;
    }
}
