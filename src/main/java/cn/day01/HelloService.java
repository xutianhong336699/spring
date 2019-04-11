package cn.day01;

public class HelloService {
    private String info;

    @Override
    public String toString() {
        return "HelloService{" +
                "info='" + info + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
