package com.xiaoge.springIOCdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

//    @Before("execution(* *.send*(..))")
//    public void doBefore(){
//        System.out.println("hello in My Aspect doBefore Method");
//    }
    @Around("@annotation(TimeUsed)")
    public void doAround(ProceedingJoinPoint proceedingJoinPoint){

        //Before
        long currentN = System.currentTimeMillis();
        try {
            Object returnValue = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - currentN);

        //after
    }
}
