package cn.danlimoshi;

// 静态内部类,确保线程安全
public class Singleton3 {
    private Singleton3() {
    }

    private static class LazyHolder{   // 静态内部类
        private static final Singleton3 instance = new Singleton3();
    }

    public static final Singleton3 getInstance(){
        return LazyHolder.instance;
    }
}

    // 1.从外部无法访问静态内部类LazyHolder，只有当调用Singleton3.getInstance方法的时候，才能得到单例对象instance
    // 2.instance 对象初始化的时机并不是在单例类Singleton3被加载的时候,而是在调用getInstance方法使得静态内部类LazyHolder被加载的时候。因此这种实现方式是利用classloader的加载机制来实现懒加载,并保证构建单例的线程安全。