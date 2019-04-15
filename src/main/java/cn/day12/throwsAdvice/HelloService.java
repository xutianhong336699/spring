package cn.day12.throwsAdvice;

public class HelloService {
    public void run() throws Exception {
        System.out.println("run");
        throw new Exception("throw 出去一个异常");
    }
}
