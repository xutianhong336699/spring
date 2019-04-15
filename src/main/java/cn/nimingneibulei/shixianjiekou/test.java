package cn.nimingneibulei.shixianjiekou;

public class test {
    public static void main(String[] args) {
        Person person= new Person() {
            @Override
            public void eat() {
                System.out.println("eat apple");
            }
        };
        person.eat();
    }
}
