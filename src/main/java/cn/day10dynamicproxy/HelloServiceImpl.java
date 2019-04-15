package cn.day10dynamicproxy;

public class HelloServiceImpl implements HelloService {
    @Override
    public void run() {
        System.out.println("doSome");
    }
}
