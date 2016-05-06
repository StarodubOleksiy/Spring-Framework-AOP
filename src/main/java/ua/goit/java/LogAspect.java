package ua.goit.java;

/**
 * Created by Администратор on 01.05.16.
 */

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
    public void onExecute(ProceedingJoinPoint pjp) throws Throwable
    {
        System.out.println("LogAspect. Before execution of: " + pjp.getSignature().getName());
        pjp.proceed();
        System.out.println("LogAspect. After execution of: "+pjp.getSignature().getName());

    }
}
