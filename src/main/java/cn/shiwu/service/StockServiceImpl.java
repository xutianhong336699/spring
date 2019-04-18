package cn.shiwu.service;

import cn.shiwu.entity.MyException;
import cn.shiwu.dao.AccountDao;
import cn.shiwu.dao.StockDao;

public class StockServiceImpl implements StockService{
    private AccountDao accountDao;
    private StockDao stockDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    @Override
    public int buyStock(int aid, int money, int sid, int count) throws MyException {
        boolean isBuy=true;
        // 账户金额减少
        int r1 = accountDao.updateAccount(aid,money,isBuy);
        if(1==1){
            // 抛出异常
            throw new MyException("出错了!");
        }
        // 股票增多
        int r2 = stockDao.updateStock(aid,count,isBuy);
        if(r1>0&&r2>0){
            return r2+r2;
        }else{
            return -1;
        }
    }
}
