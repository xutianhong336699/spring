package cn.danlimoshi;

// 同步锁,确保线程安全
public class Singleton1 {
    private Singleton1() {
    }

    private static Singleton1 instance = null;

    public static synchronized Singleton1 getInstance(){   //  synchronized
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
