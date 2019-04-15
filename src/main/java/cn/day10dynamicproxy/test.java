package cn.day10dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] args) {
        final HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) Proxy.newProxyInstance(helloService.getClass().getClassLoader(), helloService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("log");
                Object result = method.invoke(helloService);
                System.out.println(result);
                return result;
            }
        });
        proxy.run();
    }
}
