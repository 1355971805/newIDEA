package cn.happy.Springtx.cn.happy.dao;

import cn.happy.Springtx.cn.happy.entity.Stock;

/**
 * Created by Happy on 2017-08-04.
 */
public interface IStockDAO {
    public boolean addStock(Stock stock);
    public boolean updateStock(int sid, int count, boolean isBuy);
}
