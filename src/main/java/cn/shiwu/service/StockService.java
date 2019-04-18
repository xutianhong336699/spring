package cn.shiwu.service;

import cn.shiwu.entity.MyException;

public interface StockService {
    public int buyStock(int aid,int money,int sid,int count) throws MyException;
}
