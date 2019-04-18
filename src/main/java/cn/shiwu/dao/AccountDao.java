package cn.shiwu.dao;

public interface AccountDao {
    // 更改账户金额的方法
    public int updateAccount(int aid,int money,boolean isBuy);
}
