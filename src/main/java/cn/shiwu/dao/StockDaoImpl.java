package cn.shiwu.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StockDaoImpl extends JdbcDaoSupport implements StockDao{
    @Override
    public int updateStock(int sid, int count, boolean isBuy){
        String sql = "";
        if(isBuy == true){ // 购买股票，股票增多
            sql="update stock set scount=scount+? where sid=? ";
        }else{
            sql="update stock set scount=scount-? where sid=? ";
        }
        return this.getJdbcTemplate().update(sql,count,sid);
    }
}
