package cn.day11;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class test11 {
    public static void main(String[] args) {
        final HelloService helloService = new HelloService();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(helloService.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("before");
                Object result = methodProxy.invoke(helloService, args);
                System.out.println("after");
                return result;
            }
        });
        HelloService proxy= (HelloService)enhancer.create();
        proxy.dosome();
    }
}
