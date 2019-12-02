package com.jd.app.order.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author hanwensheng
 * @date 2019/12/2
 * LogAop
 */
@Aspect
public class LogAop {

    @Pointcut("execution(* com.jd.app.order.aop.PrinterImpl.*(..))")
    public void pointCut(){}

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"\tbefore...");
    }

    @AfterReturning(value = "pointCut()")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"\tafterReturning...");
    }

    @After(value = "pointCut()")
    public void after(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"\tafter...");
    }

    @AfterThrowing(value = "pointCut()")
    public void afterThowing(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"\tafterThowing...");
    }

/*    @Around(value = "pointCut()")
    public Object arount(JoinPoint joinPoint){
        return joinPoint.getTarget();
    }*/

}
