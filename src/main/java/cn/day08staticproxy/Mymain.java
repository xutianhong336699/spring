package cn.day08staticproxy;

public class Mymain {
    public static void main(String[] args) {
        RealSubject rs = new RealSubject();
        ProxySubject ps= new ProxySubject();
        ps.setRealSubject(rs);
        String context = ps.request();
        System.out.println(context);
    }
}
