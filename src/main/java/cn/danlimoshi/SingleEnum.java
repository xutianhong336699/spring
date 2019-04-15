package cn.danlimoshi;

// 枚举方式,确保线程安全
public enum SingleEnum {
    INSTANCE;
    SingleEnum(){
        System.out.println("构造函数执行");
    }
    public String getName(){
        return "singleEnum";
    }
    public static void main(String[] args){
        SingleEnum singleEnum = SingleEnum.INSTANCE;
        System.out.println(singleEnum.getName());
    }
}
