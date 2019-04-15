package cn.day12.aroundAdvice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前置");
        Object result = methodInvocation.proceed();
        System.out.println("后置");
        return result;
    }
}
