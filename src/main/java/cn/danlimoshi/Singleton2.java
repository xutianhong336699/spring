package cn.danlimoshi;

// 双重检查锁定,确保线程安全
public class Singleton2 {
    private Singleton2() {
    }

    private volatile static Singleton2 instance = null;  // volatile: 修饰符阻止了变量访问前后的指令重排,保证了指令执行顺序!

    public static Singleton2 getInstance(){
        if(instance == null){   // 双重检查机制, 第1 次判空检查
            synchronized(Singleton2.class){    // 在new 操作之前加上Synchronized 同步锁,锁住整个类( 注意,这里不能使用对象锁 ),进入Synchronized 临界区以后,还要再做一次判空。因为当两个线程同时访问的时候,线程A构建完对象,线程B也已经通过了最初的判空验证,不做第二次判空的话,线程B还是会再次构建instance对象。
                if(instance == null){   // 双重检查机制,第2 次判空检查
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
