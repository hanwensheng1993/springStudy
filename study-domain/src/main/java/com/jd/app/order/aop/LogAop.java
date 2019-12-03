package com.jd.app.order.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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

    @After(value = "pointCut()")
    public void after(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"\tafter...");
    }

    @AfterReturning(value = "pointCut()")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"\tafterReturning...");
    }

    @AfterThrowing(value = "pointCut()")
    public void afterThowing(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"\tafterThowing...");
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object result = null;
        try {
            System.out.println("Ŀ�귽������ǰ����������֪ͨ���� Before");
            try {
                result = pjp.proceed();
            } finally {
                System.out.println("Ŀ�귽�����ú󡣡�������֪ͨ���� After");
            }
            System.out.println("Ŀ�귽�����غ󡣡�������֪ͨ���� AfterReturning");
        } catch (Throwable throwable) {
            System.out.println("Ŀ�귽���쳣�󡣡�������֪ͨ���� AfterThrowing");
            throw throwable;
        }
        return result;
    }

}
