package cn.shiwu.entity;

// 股票类
public class Stock {
    private Integer sid;   // 股票代号
    private String sname;  // 股票名称
    private Integer scount; // 股票数量

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getScount() {
        return scount;
    }

    public void setScount(Integer scount) {
        this.scount = scount;
    }
}
