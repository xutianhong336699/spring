package cn.day12.throwsAdvice;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice{
    public void afterThrowing(Exception e){
        System.out.println(e.getMessage()+"============出错了");
    }
}