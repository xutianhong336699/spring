package cn.nimingneibulei.jichengfulei;

public class test {
    public static void main(String[] args) {
        // 直接将抽象类Person中的方法在大括号中实现,这样便可以省略一个类的书写,并且匿名内部类还能用于接口上
        Person person = new Person() {
            @Override
            public void eat() {
                System.out.println("eat apple");
            }
        };
        person.eat();
    }
}
