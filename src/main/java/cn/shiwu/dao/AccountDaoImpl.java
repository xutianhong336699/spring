package cn.shiwu.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public int updateAccount(int aid, int money, boolean isBuy){
        String sql = "";
        if(isBuy == true){ // 购买股票，金额减少
            sql="update account set abalance=abalance-? where aid=? ";
        }else{
            sql="update account set abalance=abalance+? where aid=? ";
        }
        return this.getJdbcTemplate().update(sql,money,aid);
    }
}
