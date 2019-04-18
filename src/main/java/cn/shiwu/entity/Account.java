package cn.shiwu.entity;

// 账户类
public class Account {
    private Integer aid; // 账户卡号
    private String aname;  // 账户名称
    private Integer abalance; // 账户余额

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getAbalance() {
        return abalance;
    }

    public void setAbalance(Integer abalance) {
        this.abalance = abalance;
    }
}
