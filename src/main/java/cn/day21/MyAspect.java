package cn.day21;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void mybefore(){
        System.out.println("前置增强");
    }
    public void myafterreturing(){
        System.out.println("后置增强");
    }

    public void myaround(ProceedingJoinPoint joinPoint){
        System.out.println("环绕增强");
        // 分界点
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕增强");
    }
}
