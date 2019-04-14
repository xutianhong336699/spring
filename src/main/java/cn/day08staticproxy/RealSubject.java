package cn.day08staticproxy;

public class RealSubject implements Subject{
    @Override
    public String request() {
        return "真实代理";
    }
}
