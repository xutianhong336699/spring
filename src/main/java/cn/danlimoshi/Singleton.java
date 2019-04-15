package cn.danlimoshi;

// 线程不安全懒汉单例模式
public class Singleton {
    private Singleton() {
    }  // 私有构造函数( 确保不能new出对象 )

    private static Singleton instance = null;  //  instance 单例对象,< 也称静态成员 >

    // 静态工厂方法
    public static Singleton getInstance() {   // getInstance 是获取单例对象的方法
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

    // 1、如果单例初始值是null,还未构建,则构建单例对象并返回,这个写法属于单例模式当中的懒汉模式 < 如上所示 >;如果单例对象一开始就被 new Singleton()主动构建,private static Singleton instance = new Singleton(),则不再需要判空操作,这种写法属于饿汉模式。

    // 2、为什么懒汉单例模式多线程不安全: 懒汉单例模式多线程不安全原因: 假设Singleton类刚刚被初始化,instance对象还是空,这时候两个线程< 线程A,线程B >同时访问getInstance方法,因为Instance是空，所以两个线程同时通过了条件判断，开始执行new操作,显然instance被构建了两次。

    // 3、 饿汉单例模式线程安全，缺点是类一加载就实例化，提前占用系统资源 ( 代码如下 )
    /*
            public class Singleton {
                private Singleton() {
                }  // 私有构造函数( 确保不能new出对象 )

                private static Singleton instance = new Singleton();

                // 静态工厂方法
                public static Singleton getInstance() {
                    return instance;
                }
            }
    */

