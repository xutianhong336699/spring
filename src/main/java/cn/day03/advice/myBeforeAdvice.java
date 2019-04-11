package cn.day03.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class myBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("日志");
    }
}
