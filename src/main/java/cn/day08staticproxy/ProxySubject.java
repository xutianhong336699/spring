package cn.day08staticproxy;

public class ProxySubject implements Subject{
    private RealSubject realSubject;

    public RealSubject getRealSubject() {
        return realSubject;
    }

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public String request() {
       String str1 =  "我是增强代理";
       String str2 = realSubject.request();
       return str1+"\n"+str2;
    }
}
