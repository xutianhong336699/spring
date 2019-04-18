package cn.day20;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Before(value="execution(* cn.day20.HelloService.*(..))")
    public void mybefore(){
        System.out.println("这是前置增强");
    }

    @AfterReturning(value="execution(* cn.day20.HelloService.*(..))")
    public void myafterreturing(){
        System.out.println("这是后置增强");
    }

    @Around(value="execution(* cn.day20.HelloService.*(..))")
    public void myaround(ProceedingJoinPoint joinPoint){
        System.out.println("这是环绕增强");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("这是环绕增强");
    }
}
